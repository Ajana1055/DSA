class Solution {
    public void check(List<List<Integer>> res, List<Integer> list, int start) {
        if (start == list.size()) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < list.size(); i++) {

            Collections.swap(list, i, start);
            check(res, list, start + 1);
            Collections.swap(list, i, start);

        }

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        check(res, list, 0);
        return res;
    }
}