class counter {
    int count = 0;
    public synchronized void increment(){
        count++;
        
    }
}

class Mythread5 extends Thread{
    counter c ;
    Mythread5(counter c){
        this.c = c;
    }
    public void run(){
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }

}

class Mythread6 extends Thread{
    counter c ;
    Mythread6(counter c){
        this.c = c;
    }
    public void run(){
        for (int i = 1; i <= 1000; i++) {
            c.increment();
        }
    }

}

public class Synchronization_for_race_condition {
    public static void main(String[] args)throws InterruptedException{

        counter c = new counter();

        Mythread5 m1 = new Mythread5(c);
        Mythread6 m2 = new Mythread6(c);

        m1.start();
        m2.start();

        m1.join();
        m2.join();

        System.out.println("Final Result or Count " + c.count);

    }
}/*
    🧠 Why It Always Gives 2000 Now?

Because you added:

public synchronized void increment() {
    count++;
}

Let’s understand what happened internally.

🔒 What synchronized Did

When you write:

public synchronized void increment()

It means:

👉 Only ONE thread can enter this method at a time.
👉 Other thread must WAIT outside.

So now execution becomes like this:

Thread 1 → increment
Thread 2 → wait
Thread 1 → exit
Thread 2 → enter
Thread 2 → increment

No overlapping.
No interference.
No race condition.

So final result = 2000 ✅

🔥 What You Just Learned

Before synchronized:

Two threads entering increment() at same time
→ count++ overlapping
→ wrong result

After synchronized:

One thread at a time
→ correct result

🎯 Important Interview Question

If interviewer asks:

Why does synchronized fix race condition?

You answer:

Because synchronized ensures mutual exclusion. Only one thread can access the critical section at a time, which prevents concurrent modification of shared data.

That’s a strong answer 💪

🧠 Now Next Level Question

Inside your code:

public synchronized void increment()

Which object’s lock is used here?

Think carefully.

Is it:
1️⃣ m1’s lock
2️⃣ m2’s lock
3️⃣ counter object’s lock
4️⃣ Class lock

Answer carefully 😎
*/
