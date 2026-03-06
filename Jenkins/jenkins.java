public class jenkinsdemo {
    public static void main(String[] args) {
        System.out.println("Entered Argument is "+args[0]);
		int n=Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
			System.out.println(i);
        }
    }
}
