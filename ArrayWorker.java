class ArrayWorker {
    public void printElement(int[] array, int index) {
        try{

                    System.out.println("value is " + array[index]);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("wrong index");
        }finally {
            for (int i : array) {
                while (array[i] == index) {
                    System.out.println("index is " + i);
                }
            }
        }
    }
}

class ArrayWorkerTest {
    public static void main(String[] args) {
        //int[] array = {1, 2, 3};

        //value is 1
        //index is 0
        //new ArrayWorker().printElement(array, 0);

        //wrong index
        //index is 10
       // new ArrayWorker().printElement(array, 10);
        String language = "Java";
        language.toUpperCase();
        System.out.println(language);
    }
}