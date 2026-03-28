class Solution {
public:
    vector<string> dfs(string from, int size, unordered_map<string,vector<pair<string,bool>>>& adj, vector<string>& path){

        if(size == 0) return path; // Visited all the edges
        
        if( adj.find(from) == adj.end()
            || adj[from].empty()){ // Reached a DEAD-END
            return vector<string>();
        }
        for(auto& to:adj[from]){
            // If this edge is already visited,
            // skip this edge
            if(to.second) continue;

            
            // Backtracking logic 
            to.second = true;           // Mark as visited
            path.push_back(to.first);   // Add `to` to `path`
            
            if(dfs(to.first, size-1, adj, path).size()){
                // Found a solution
                return path;
            }
            path.pop_back();            // Remove `to` from `path`
            to.second = false;          // Mark as available
        }
        return vector<string>();
    }
    vector<string> findItinerary(vector<vector<string>>& tickets) {
        unordered_map<string, vector<pair<string, bool>>> adj;
        int size = tickets.size();

        // Build adj list
        for(int i{}; i<size; i++){
            adj[tickets[i][0]].push_back(make_pair(tickets[i][1], false));
        }

        // For each node,
        // sort edges according to the lexical order
        for(auto& vctr:adj){
            sort(vctr.second.begin(), vctr.second.end());
        }

        // `path` contains the path taken
        vector<string> path;

        // Add the first Stop
        path.push_back("JFK");
        return dfs("JFK", size, adj, path);
    }
};