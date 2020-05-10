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
		System.out.println("�Ƚ��˲�������:" + count);
		//System.out.println(Arrays.toString(nums));
//		before:2020/02/12 16:23:20:703
//		after:2020/02/12 16:23:32:750
//		�Ƚ��˲�������:1603714390
	}

	public static void bubbleSort(int[] nums) {
		int temp = 0;
		boolean flag = false;
		for (int j = 0; j < nums.length - 1; j++) {
			for (int i = 0; i < nums.length - 1 - j; i++) {// �˴�-i�ǽ������ֵȷ�����������ٱȽ����ǣ�������ѭ��

				if (nums[i] > nums[i + 1]) {
					count++;
					flag = true;
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
			if (!flag)// �Ż�: ˵������û�н��бȽϣ������j���Ѿ��ź����״̬�£��ּ�������.
				break;
			else
				flag = false;
			// System.out.println(Arrays.toString(nums));
		}
	}

}
