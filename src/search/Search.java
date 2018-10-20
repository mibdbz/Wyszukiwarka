
package search;


public class Search {

    public static void main(String[] args) {
        Controller controller = new Controller();
        
        controller.startSearch();
        
        
//        System.out.println("nazwa | białka | węglowodany | tłuszcz | kcal");
        System.out.println(controller.getProduct().toString());
    }
        
    
}
