public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = ReaderandSum.read("C:\\Users\\User\\IdeaProjects\\untitled\\src\\numbers.txt");
            System.out.println(ReaderandSum.sum(arr));
        }
        catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }


    }
}