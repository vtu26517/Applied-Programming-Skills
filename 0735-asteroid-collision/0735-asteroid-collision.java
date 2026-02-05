class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            boolean destroyed = false;

            // Collision only if stack top is moving right and current is moving left
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                int top = stack.peek();

                if (Math.abs(top) < Math.abs(ast)) {
                    // Top asteroid explodes
                    stack.pop();
                    continue;
                } else if (Math.abs(top) == Math.abs(ast)) {
                    // Both explode
                    stack.pop();
                }
                // Current asteroid is destroyed
                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(ast);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result; 
    }
}