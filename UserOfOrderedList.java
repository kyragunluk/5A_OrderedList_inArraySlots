/*
public int size(){
public String toString() {
public Object get(int index){
public boolean add( Object val){
public int remove(int index){
public int removeValue(int value)
*/
public class UserOfOrderedList {
  	public static void main(String[] commandLine) {
    		OrderedList_inArraySlots orderedList = new OrderedList_inArraySlots();
        // testing add method
        System.out.println("Initial empty Ordered List: " + orderedList);
    		orderedList.add(4);
    		System.out.println("" + orderedList
                              + ": "
                              + "expecting [4,]");
    		orderedList.add(2);
        System.out.println("" + orderedList
                              + ": "
                              + "expecting [2,4,]");
    		orderedList.add(1);
        System.out.println("" + orderedList
                              + ": "
                              + "expecting [1,2,4,]");
    		orderedList.add(3);
        System.out.println("" + orderedList
                              + ": "
                              + "expecting [1,2,3,4,]");
        // testing size method
        System.out.println("" + orderedList.size()
                              + ": "
                              + "expecting 4");
        // testing get method
        System.out.println("" + orderedList.get(0)
                              + ": "
                              + "expecting 1");
        System.out.println("" + orderedList.get(3)
                              + ": "
                              + "expecting 4");
        //testing remove methods
        orderedList.remove(2);
        System.out.println("" + orderedList
                              + ": "
                              + "expecting [1,2,4,]");
        orderedList.removeValue(2);
        System.out.println("" + orderedList
                              + ": "
                              + "expecting [1,4,]");
  	}
}
