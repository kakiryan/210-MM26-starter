package lec03.complexity;

import static java.lang.Math.random;

// Example of Linear Search based on Random numbers
// will print out the time taken to search a random number (key) in array
public class LinearSearchRnd {
    public static void main(String[] args) {
        int n = 6000000;        // size of array b[] 6Million
        int b[] = new int[n];   // array to be searched
        int repeat = 100;        // number of times to repeat the experiment

        // fill array b[] with random numbers in range 0-n
        for (int j = 0; j < repeat; j++) {
            int key = (int) (n * random());     // key=random number to be searched
            for (int i = 0; i < n; i++) {
                b[i] = (int) (n * random());    // fill in array b[]
            }
            long startTime = System.nanoTime();
            searchArray(b, key);                // conduct the search (result not being printed)
            long endTime = System.nanoTime();
            long duration = endTime - startTime;    // duration of search in nanoseconds
            long durationInMicro = duration / 1000;
            System.out.println(durationInMicro );       // prints out time taken for search in microseconds
        }
    }

    static int searchArray(int[] y, int key){       // conducts linear search for key in y[]
        for (int i = 0; i < y.length; i++) {
            if (y[i] == key) {
                return(i);     // returns index of y[] as soon as successful search
            }}
        return(-1);     // return -1 if search unsuccessful
    }
}
