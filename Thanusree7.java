public class Thanusree7 {
    public int majorityElement(int [] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>nums.length/2){
                return i;
            }
        }
        return 0;
        
    }
}
