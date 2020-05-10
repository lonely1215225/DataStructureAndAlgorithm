package edu.hunau.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
	static int count = 0;

	public static void main(String[] args) {
		int[] nums = new int[80000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10000000);
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String beforetime = simpleDateFormat.format(new Date());
		System.out.println("before:" + beforetime);
		bubbleSort(nums);
		Date date = new Date();
		String afterTime = simpleDateFormat.format(date);
		System.out.println("after:" + afterTime);
		System.out.println("比较了操作数量:" + count);
		//System.out.println(Arrays.toString(nums));
//		before:2020/02/12 16:23:20:703
//		after:2020/02/12 16:23:32:750
//		比较了操作数量:1603714390
	}

	public static void bubbleSort(int[] nums) {
		int temp = 0;
		boolean flag = false;
		for (int j = 0; j < nums.length - 1; j++) {
			for (int i = 0; i < nums.length - 1 - j; i++) {// 此处-i是将后面的值确定化，并不再比较它们，减少内循环

				if (nums[i] > nums[i + 1]) {
					count++;
					flag = true;
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
			if (!flag)// 优化: 说明本轮没有进行比较，避免第j次已经排号序的状态下，又继续排序.
				break;
			else
				flag = false;
			// System.out.println(Arrays.toString(nums));
		}
	}

}
