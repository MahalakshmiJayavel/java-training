
    interface M{
        void display();

    }
    public class LambdaExpression {
        public static void main(String[] args) {
            M obj=()->{System.out.println("hello kj");

            };
            obj.display();
        }
}

