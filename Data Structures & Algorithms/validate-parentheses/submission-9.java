class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> closeToOpen= new HashMap<>();
        closeToOpen.put(']', '[');
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');

        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (closeToOpen.containsKey(c)) {
                if (stack.size() == 0) return false;
                char top = stack.remove(stack.size() - 1);
                if (closeToOpen.get(c) != top) {
                    return false;
                } 
            } else {
                stack.add(c);
            }
        }
        if (stack.size() != 0) return false;
        return true;
    }
}
