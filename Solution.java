class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> addedPairs = new HashSet<>();
        
        for(int num : arr){
            int complement = -num;
            if(seen.contains(complement)){
                int min = Math.min(num, complement);
                int max = Math.max(num, complement);
                String pairKey = min + "," + max;
                if(!addedPairs.contains(pairKey)){
                    result.add(new ArrayList<>(Arrays.asList(min, max)));
                    addedPairs.add(pairKey);
                }
            }
            seen.add(num);
        }
        result.sort((a, b) -> {
            if(a.get(0).equals(b.get(0))){
                return a.get(1) - b.get(1);
            }
            return a.get(0) - b.get(0);
        });
        return result;
    }
}
