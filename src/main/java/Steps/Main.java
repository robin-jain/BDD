package Steps;

class Main {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            int array3[] = new int[10];
            array[9] = 30 / 5;
            return;
        }
        catch (ArithmeticException e) {
            System.out.println("This is Arithmetic "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("This is base "+e.getMessage());
        }
        finally {
            System.out.println("This is executed Finallly ");
        }
    }
}
