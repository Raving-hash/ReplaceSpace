class Solution {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        if(s.isEmpty()){
            return s;
        }
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if(c == ' '){
                res.append("%20");
                continue;
            }
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.replaceSpace("ad ad  sy");
        System.out.println(s);
    }
}