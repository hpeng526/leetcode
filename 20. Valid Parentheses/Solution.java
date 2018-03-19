class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char push = s.charAt(i);
            if (isLeft(push)) {
                stack.push(push);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char pop = stack.pop();
                if (!equal(pop, push)) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean equal(char left, char right) {
        switch (left) {
            case '(':
                return ')' == right;
            case '[':
                return ']' == right;
            case '{':
                return '}' == right;
            default:
                return false;
        }
    }

    private boolean isLeft(char s) {
        return s == '(' || s == '[' || s == '{';
    }
}