package listimpl;

public class ListUtilities {
    public static void display(IList list){
        for (int i = 0; i < list.size();i++)
            System.out.print(list.get(i)+" ");
        System.out.println();
    }
    public static void insertSort (IList<Integer> firstTable){
        int unsortedIndex =1;
        do {
            if (firstTable.get(unsortedIndex) <= firstTable.get(0))
                moveValue(firstTable, unsortedIndex, 0);
            else {
                for(int i=0; i<unsortedIndex-1;i++){
                    if(firstTable.get(unsortedIndex)>= firstTable.get(i) &&
                    firstTable.get(unsortedIndex)<= firstTable.get(i+1)) {
                        moveValue(firstTable, unsortedIndex,i+1);
                        break;
                    }
                }
            }
            unsortedIndex++;
        }while(unsortedIndex!=firstTable.size());

    }

    private static void moveValue (IList list, int fromIndex, int toIndex){
        list.add(list.get(fromIndex),toIndex);
        list.remove(fromIndex+1);
    }
}
