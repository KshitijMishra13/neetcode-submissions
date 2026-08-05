class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);
        int n=intervals.length;
        int i=0;
        while(i<n){
            int start=intervals[i][0];
            int end = intervals[i][1];
            int j=i+1;
            while(j<n && intervals[j][0]<=end){
                end = Math.max(intervals[j][1], end);
                j++;
            }ans.add(Arrays.asList(start, end));
            i=j;
        }
        int[][] a = new int[ans.size()][2];
        for(int k=0; k<ans.size(); k++){
            a[k][0] = ans.get(k).get(0);
            a[k][1] = ans.get(k).get(1);
        }return a;
    }
}
