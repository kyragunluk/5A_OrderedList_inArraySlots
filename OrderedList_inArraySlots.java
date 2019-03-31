public class OrderedList_inArraySlots{
  	private List_inArraySlots orderedList;

  	public OrderedList_inArraySlots(){
  		  orderedList = new List_inArraySlots();
  	}

    public int size(){
        return orderedList.size();
    }

  	public String toString(){
  		  return orderedList.toString();
  	}

  	public int get(int index){
  		  return orderedList.get(index);
  	}

  	public boolean add( int value){
        for (int index = 0 ; index < orderedList.size() ; index++){
            if (value <= orderedList.get(index)){
                orderedList.add(index , value);
                return true;
            }
        }
        orderedList.add(value);
        return true;
  	}

  	public int remove( int index) {
  		  return orderedList.remove(index);
  	}

  	public int removeValue ( int value){
  		  for (int index = 0 ; index < orderedList.size() ; index++){
            if (value == orderedList.get(index))
               orderedList.remove(index);
        }
        return value;
  	}
}
