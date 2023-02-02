package homework9.extraMile;

public class ArrayLikeASet {
    private Integer[] myList;

    public ArrayLikeASet() {
        this.myList = new Integer[]{};
    }

    public void addToList(Integer element) {
        for (int index = 0; index < myList.length; index++) {
            if (myList[index] == element) {
                return;
            }
        }
        Integer[] bufferArray = new Integer[myList.length];
        for (int index = 0; index < myList.length; index++) {
            bufferArray[index] = myList[index];
        }

        myList = new Integer[bufferArray.length + 1];

        for (int index = 0; index < bufferArray.length; index++) {
            myList[index] = bufferArray[index];
        }
        myList[myList.length - 1] = element;

        myList = sortArray(myList);
    }

    public Integer[] sortArray(Integer[] arrayToSort) {
        int temp;
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 0; j < arrayToSort.length; j++) {
                if (arrayToSort[i] < arrayToSort[j]) {
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        return arrayToSort;
    }

    public Integer getElement(int index) {
        return myList[index];
    }

    public void removeFromList(int index) {
        if (index >= myList.length) {
            return;
        }

        Integer[] bufferArray = new Integer[myList.length - 1];
        for (int i = 0; i < myList.length; i++) {
            if (i < index) {
                bufferArray[i] = myList[i];
            } else if (i > index) {
                bufferArray[i - 1] = myList[i];
            }
        }

        myList = new Integer[bufferArray.length];
        for (int i = 0; i < bufferArray.length; i++) {
            myList[i] = bufferArray[i];
        }
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Integer element : myList) {
            returnString = returnString + " " + element;
        }
        return returnString;
    }
}
