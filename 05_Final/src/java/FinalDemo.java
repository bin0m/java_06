/**
 * final
 */
public class FinalDemo {
    public static MyClass x;

    public static void main(String[] args) {
        final int i = 10;
        // Недопустимо:
        // i++;
        // i = 100;
        final MyClass myClass = new MyClass(10);
        // Недопустимо:
        // myClass = new MyClass(100);
        // myClass = null;
        // myClass.VALUE2 = 30;
        // x.VALUE2 = 10;
        // Можем менять значение
        myClass.value = 1;
        myClass.value = 20;
        System.out.println("myClass.value = " + myClass.value);
    }

    // final - не можем создать наследника
    static final class MyClass {
        // final - мы можем присваивать значение только в конструкторе
        // и только один раз
        public final int VALUE2; // = 10
        public int value;

        public MyClass(final int value2) {
            // value2 = 10; // Не можем
            x = this;
            // this.VALUE2 = 10;
            this.VALUE2 = value2 + 100;
        }
    }

    static class A {
        final void x() {

        }
    }

    static class B extends A {
        // Не можем перезагрузить
        //void x(){
        //}
        int x(int x) {
            return 0;
        }

        double x(double xx) {
            return 0.0;
        }
    }

/*
    static class MyClass2 extends MyClass {

        public MyClass2(int value2) {
            super(value2);
        }
    }
*/
}
