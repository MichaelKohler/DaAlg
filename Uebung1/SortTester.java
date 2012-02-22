/**
 * File: SortTester.java
 * Autoren:
 *   - Lukas Diener - 
 *   - Michael Kohler - 11-108-289
 * Einfaches Testprogramm der Sortieralgorithmen.
 */

public class SortTester {

    public static final int MAX_EXPERIMENT_TIME_IN_MS = 600000;
    public static final int MAX_LENGTH = 100000;
    public static final int ELEMENT_UPPERLIMIT = 1000000;

	public static void printArray(int[] array)
	{
		// Ausgabe des Arrays:
		for (int i=0; i<array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
        Timer experimentTimer = new Timer();
        while(experimentTimer.timeElapsed()<MAX_EXPERIMENT_TIME_IN_MS) {
		    // zu sortierender Array generieren
            int[] array = generateNewArray();
            int[] array2 = new int[array.length];
		    java.lang.System.arraycopy(array, 0, array2, 0, array.length);

            // beginn Insertion Sort
            Timer timer = new Timer();
		    Sorting.insertionSort(array);
		    long time = timer.timeElapsed();
		    System.out.println(time+"\t ms to insertion sort\t"+
		                        array.length+"\telements: ");
		    printArray(array);
		    // beginn Merge Sort
		    timer.reset();
		    Sorting.mergeSort(array2, 0, array.length-1);
		    long time2 = timer.timeElapsed();
		    System.out.println(time2+"\t ms to merge sort\t"+
		                        array2.length+"\telements: ");
		    printArray(array2);
        }
	}

	public static int[] generateNewArray() {
	    java.util.Random random = new java.util.Random();
        int size = random.nextInt(MAX_LENGTH);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(ELEMENT_UPPERLIMIT);
            array[i] = randomNumber;
        }
        return array;
	}
}


