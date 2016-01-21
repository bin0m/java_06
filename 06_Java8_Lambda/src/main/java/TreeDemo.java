/**
 * Операции с бинарным деревом
 */
public class TreeDemo {
    public static void main(String[] args) {
        //             6
        //          5    1
        //        4  3  8
        //       2
        TreeNode tree = new TreeNode(
                6,
                new TreeNode(5,
                        new TreeNode(4,
                                new TreeNode(2)),
                        new TreeNode(3)),
                new TreeNode(1,
                        new TreeNode(8))
        );
        TreeOperation depth = new TreeOperation() {
            @Override
            public int apply(TreeNode node) {
                int r = 1;
                if (node.left != null)
                    r = Math.max(r, 1 + apply(node.left));
                if (node.right != null)
                    r = Math.max(r, 1 + apply(node.right));
                return r;
            }
        };
        System.out.println("depth(tree) = " + depth.apply(tree));
        System.out.println("depth.apply(tree.right) = " + depth.apply(tree.right));

        TreeOperation sum = new TreeOperation() {
            @Override
            public int apply(TreeNode node) {
                int r = node.value;
                if (node.left != null)
                    r += apply(node.left);
                if (node.right != null)
                    r += apply(node.right);
                return r;
            }
        };
        System.out.println("sum(tree) = " + sum.apply(tree));
    }

    // Операция с деревом
    interface TreeOperation {
        int apply(TreeNode node);
    }

    static class TreeNode {
        int value; // Значение в каждом узле дерева
        TreeNode left;
        TreeNode right; // Левое поддерево и правое поддерево

        // Конструктор
        TreeNode(int value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode(int value, TreeNode left) {
            // Вызов другого конструктора
            this(value, left, null);
        }

        TreeNode(int value) {
            this(value, null);
        }

    }
}
