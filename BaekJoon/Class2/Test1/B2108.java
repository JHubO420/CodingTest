package BaekJoon.B2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//산술평균(min) : N개의 수들의 합을 N으로 나눈 값
//중앙값(med) : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값(lit) : N개의 수들 중 가장 많이 나타나는 값
//범위(rang) : N개의 수들 중 최댓값과 최솟값의 차이

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double min = 0;
        int med = 0, rang = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        //평균값 구하기
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));//값 입력받기
            min += (double)list.get(i);
        }
        min = min/n;
        System.out.println(Math.round(min));//평균값 출력

        list.sort(Comparator.naturalOrder());//오름차순 정렬

        med = list.get(list.size()/2);
        System.out.println(med);//중앙값 출력

        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : list){
            int count = map.getOrDefault(number, 0) + 1;
            map.put(number, count);
            maxCount = Math.max(maxCount, count);
        }

        List<Integer> modes = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==maxCount){
                modes.add(entry.getKey());
            }
        }
        Collections.sort(modes);
        if(modes.size()<2){
            System.out.println(modes.get(0));
        }else {
            System.out.println(modes.get(1));
        }

        rang = list.get(list.size()-1) - list.get(0);
        System.out.println(rang);//범위 출력
    }
}
