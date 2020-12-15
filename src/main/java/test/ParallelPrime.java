package test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;
//import static java.util.stream.LongStream.*;
import java.io.*;
import java.nio.file.*;

import static java.util.stream.LongStream.rangeClosed;
//import onjava.Timer;

public class ParallelPrime {
    static final int COUNT = 100_000;
    public static boolean isPrime(long n){
        return rangeClosed(2, (long)Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }
    public static void main(String[] args)
            throws IOException {

        //String aa = "abc,";
        //System.out.println("1 << 30->"+aa.substring(0,aa.lastIndexOf(",")));



        int aa = 1 << 2;
        System.out.println("1 << 3->"+aa);

        /*String a = "a";
        System.out.println(a);
        modiyString(a);
        System.out.println("modiyString->"+a);
        AtomicInteger
        Integer b = new Integer(177);
        System.out.println(b);
        modiyB(b);
        System.out.println("modiyB->"+b);*/

        /*Timer timer = new Timer();
        List<String> primes =
                iterate(2, i -> i + 1)
                        .parallel()              // [1]
                        .filter(ParallelPrime::isPrime)
                        .limit(COUNT)
                        .mapToObj(Long::toString)
                        .collect(Collectors.toList());

        //System.out.println(timer.duration());
        Files.write(Paths.get("primes.txt"), primes, StandardOpenOption.CREATE);*/
        String hostId = "8a82e7907452a5f7017452a8f8490008#8a82e7907452c1f0017452c620a20006";
        String[] ids = hostId.split("#");
        if(ids.length > 1) {
            for(int i = 0; i < (ids.length -1); i++) {
                hostId = ids[i] + "#";
            }
            hostId = hostId.substring(0, hostId.length()-1);
            System.out.println("hostId String->"+hostId);
        }
    }

    public static void modiyString(String a){
        a= "B";
    }

    public static Integer modiyB(Integer a){
        a= new Integer(12);
        return a;
    }
}
