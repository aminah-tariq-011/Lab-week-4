import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Shop shop= new Shop(new Person("John", "email"),"Lahore");
	
	System.out.println("1 to add a product");
	System.out.println("2 to sell a product");
	System.out.println("0 to exit");
	System.out.println("Enter option to continue:");
        Scanner sc = new Scanner(System.in);
        while(true) {
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                shop.addProduct();
                break;
                case 2:
                    shop.sale();
                    break;
		case 3:
		    shop.modifyProduct();
		    break;
		case 4:
		    shop.displayProduct();
		    break;
                case 0:
                   System.exit(0);
                   break;
                default:
            }
        }
    }
}