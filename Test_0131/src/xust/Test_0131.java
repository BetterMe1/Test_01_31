package xust;

/*
1. 字符串中的单词数
统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
请注意，你可以假定字符串里不包括任何不可打印的字符。
示例:
输入: "Hello, my name is John"
输出: 5
 */
//public class Test_0131 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		String s = "Hello, my name is John";
//		System.out.println(So.countSegments(s));
//	}
//}
//class Solution {
//    public int countSegments(String s) {
//    	if (s.length() == 0)
//    			return 0;
//    	int count = 0;
//    	int flag = 0;
//        for(int i=0; i<s.length(); i++){
//        	if(s.charAt(i) != ' ' && flag == 0){
//        		count++;
//        		flag = 1;
//        	}
//        	else if(s.charAt(i) == ' ' && flag == 1){
//        		flag = 0;
//        	}
//        }
//        return count;
//    }
//}
/*
2. 排列硬币
你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
给定一个数字 n，找出可形成完整阶梯行的总行数。
n 是一个非负整数，并且在32位有符号整型的范围内。

示例 1:
n = 5
硬币可排列成以下几行:
¤
¤ ¤
¤ ¤
因为第三行不完整，所以返回2.

示例 2:
n = 8
硬币可排列成以下几行:
¤
¤ ¤
¤ ¤ ¤
¤ ¤
因为第四行不完整，所以返回3.
 */
//public class Test_0131 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int n = 5;
//		System.out.println(So.arrangeCoins(n));
//	}
//}
//class Solution {
//    public int arrangeCoins(int n) {
//    	if(n < 0){
//    		return -1;
//    	}
//    	int i=0;
//        while(n>=0){
//        	n -= i;
//        	i++;
//        }
//        return i-2;
//    }
//}
/*
3. 压缩字符串
给定一组字符，使用原地算法将其压缩。
压缩后的长度必须始终小于或等于原数组长度。
数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
在完成原地修改输入数组后，返回数组的新长度。
进阶：
你能否仅使用O(1) 空间解决问题？

示例 1：
输入：
["a","a","b","b","c","c","c"]
输出：
返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
说明：
"aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。

示例 2：
输入：
["a"]
输出：
返回1，输入数组的前1个字符应该是：["a"]
说明：
没有任何字符串被替代。

示例 3：
输入：
["a","b","b","b","b","b","b","b","b","b","b","b","b"]
输出：
返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
说明：
由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
注意每个数字在数组中都有它自己的位置。
注意：
所有字符都有一个ASCII值在[35, 126]区间内。
1 <= len(chars) <= 1000。
 */
//public class Test_0131 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//	}
//}
//class Solution {
//    public int compress(char[] chars) {
//        
//    }
//}
/*
4. 可怜的小猪
有1000只水桶，其中有且只有一桶装的含有毒药，其余装的都是水。它们从外观看起来都一样。如果小猪喝了毒药，它会在15分钟内死去。
问题来了，如果需要你在一小时内，弄清楚哪只水桶含有毒药，你最少需要多少只猪？
回答这个问题，并为下列的进阶问题编写一个通用算法。
进阶:
假设有 n 只水桶，猪饮水中毒后会在 m 分钟内死亡，你需要多少猪（x）就能在 p 分钟内找出“有毒”水桶？n只水桶里有且仅有一只有毒的桶。
 */
public class Test_0131 {
	public static void main(String[] args) {
		Solution So = new Solution();
	}
}
class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        
    }
}