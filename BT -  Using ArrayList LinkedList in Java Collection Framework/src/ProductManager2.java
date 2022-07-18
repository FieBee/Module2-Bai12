//
//import java.util.LinkedList;
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class ProductManager2 {
//
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////
////        LinkedList<Product> arrProduct2 = new LinkedList<>();
////
////        arrProduct2.add(product4);
////        arrProduct2.add(product5);
////        arrProduct2.add(product6);
////
////
////
////        extracted(input, arrProduct2);
////
////
////    }
//
//
//
//    //    Chuong trinh
//    private static void extracted(Scanner input, LinkedList<Product> arrProduct1) {
//        int selectOption;
//        do {
//            System.out.println("------------------------------");
//            System.out.println("Chọn thao tác: ");
//            System.out.println("   1. Thêm sản phẩm.");
//            System.out.println("   2. Sửa thông tin sản phẩm theo id.");
//            System.out.println("   3. Xoá sản phẩm theo id.");
//            System.out.println("   4. Hiển thị danh sách sản phẩm.");
//            System.out.println("   5. Tìm kiếm sản phẩm theo tên.");
//            System.out.println("   6. Sắp xếp sản phẩm tăng dần theo giá.");
//            System.out.println("   0. Thoát khỏi chương trình. ");
//            System.out.println("------------------------------");
//            selectOption = input.nextInt();
//
//            switch (selectOption){
//                case 1: addProduct(arrProduct1);break;
//                case 2: setProductId(arrProduct1); break;
//                case 3: deleteProduct(arrProduct1);break;
//                case 4: displayArrays(arrProduct1);break;
//                case 5: searchProductName(arrProduct1);break;
//                case 6: sortArrayProduct(arrProduct1);break;
//            }
//        }while(selectOption != 0) ;
//    }
//
//
//    //      Them san pham
//    public static void addProduct(LinkedList<Product> arr){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập tên cho sản phẩm:");
//        String name = input.nextLine();
//
//        int id = Product.count;
//        System.out.println("Nhập giá cho sản phẩm:");
//
//        int price = input.nextInt();
//
//        Product product1 = new Product(name, price, id);
//        arr.push(product1);
//
//        System.out.println("Thêm thành công: "+product1);
//        Product.count++;
//    }
//
//
//    //    Check san pham co ton tai hay khong
//    public static int checkId(LinkedList<Product> arr, String option){
//        Scanner input = new Scanner(System.in);
//        int id;
//        do {
//            System.out.println(option);
//            id = input.nextInt();
//        }while (id >= arr.size() || id < 0);
//        return id;
//    }
//
//    public static void setProductId(LinkedList<Product> arr){
//        int id = checkId(arr, "Nhập ID sản phẩm muốn sửa: ");
//
//        Scanner input = new Scanner(System.in);
//        Product product = arr.get(id);
//
//        String newName = input.nextLine();
//        System.out.println("Nhập lại tên sản phẩm");
//        product.setName(newName);
//
//        System.out.println("Nhập lại giá sản phẩm");
//        product.setPrice(input.nextInt() );
//
//        System.out.println("Sửa thành công: "+ product);
//    }
//
//    //      Xoa san pham
//    public static void deleteProduct(LinkedList<Product> arr){
//        int id = checkId(arr, "Nhập ID sản phẩm muốn xóa:");
//
//        Product product = arr.get(id);
//        System.out.println("Da xoa "+ product.toString());
//        arr.remove(id);
//    }
//
//    //      Duyet san pham
//    public static void displayArrays(LinkedList<Product> arr){
//
//        Product.stt = 1;
//        System.out.println("Danh sách sản phẩm:");
//        for (Product product : arr) {
//            System.out.println(Product.stt+". " + product);
//            Product.stt++;
//        }
//    }
//
//
//    //    Tim san pham theo ten
//    public static void searchProductName(LinkedList<Product> arr){
//        Scanner input =new Scanner(System.in);
//        System.out.println("Nhập tên sản phẩm muốn tìm kiếm: ");
//        String name = input.nextLine();
//
//        boolean checkName = false;
//        Product product = null;
//        for (Product value : arr) {
//            if (name.equals(value.getName())) {
//                checkName = true;
//                product = value;
//            }
//        }
//        if (checkName){
//            System.out.println("Sản phẩm tìm kiếm là: "+ product);
//        }else {
//            System.out.println("Không tồn tại sản phẩm có tên là: "+name);
//        }
//
//    }
//
//
//    //    Sap xep theo Price
//    private static void sortArrayProduct(LinkedList<Product> arrProduct1) {
//        arrProduct1.sort(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getPrice() - o2.getPrice();
//            }
//        });
//        displayArrays(arrProduct1);
//    }
//
//}
//
