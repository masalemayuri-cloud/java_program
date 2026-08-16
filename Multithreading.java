// Java Program to implement
// Multithreading

class Multithreading extends Thread {
    int start, end;
    int[] arr;
    int result;

    public Multithreading(int start, int end, int[] arr)
    {
        this.start = start;
        this.end = end;
        this.arr = arr;
        this.result = 0;
    }

    public void run()
    {
        for (int i = start; i <= end; i++) {
            result += arr[i];
        }
    }

    public static void main(String[] args)
    {
        int n = 10000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int numThreads = 4;
        int chunkSize = n / numThreads;
        Multithreading[] threads = new Multithreading[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize - 1;
            threads[i] = new Multithreading(start, end, arr);
            threads[i].start();
        }

        int result = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                result += threads[i].result;
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(result);
    }
}