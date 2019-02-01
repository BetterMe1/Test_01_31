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
3. 回旋镖的数量
给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。

示例:
输入:
[[0,0],[1,0],[2,0]]
输出:
2
解释:
两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 */
//public class Test_0131 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[][] points ={{0,0},{1,0},{2,0}};
//		System.out.println(So.numberOfBoomerangs(points));
//	}
//}
//class Solution {
//    public int numberOfBoomerangs(int[][] points) {
//    	int sum = 0;
//        for(int i=0; i<points.length; i++){
//        	for(int j=0; j<points.length; j++){
//        		if(j!=i){
//        			int dj = (points[i][0] - points[j][0])*(points[i][0] - points[j][0]) +
//            				(points[i][1] - points[j][1])*(points[i][1] - points[j][1]);
//        			for(int k=0; k<points.length; k++){
//        				if(k!=j && k !=i){
//        					int dk = (points[i][0] - points[k][0])*(points[i][0] - points[k][0]) +
//                    				(points[i][1] - points[k][1])*(points[i][1] - points[k][1]);
//                			if(dj == dk){
//                				sum++;
//                			}
//        				}
//            		}
//        		}
//        	}
//        }
//        return sum;
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
/*
 * 需要在一小时内测试出哪桶水有毒，而每头猪喝下毒药会在15分钟内死去，因此猪就有了五个时间状态，0min,15min,30min,45min,60min.
 * 当测试用例buckets是1时，这桶水就是有毒的水，因此就是需要0头猪；
 * 1头猪1个小时内可以测5桶水，每个状态下喝下一桶，若在某个时间点死去，则就是这桶水有毒。
 * 先看一下2头猪可以测多少桶水呢？将每桶水按二维来编号，由于猪有5个状态，每行每列放5桶水 ：
 *       猪2
 *        |
 *        V
 *       40  41  42  43  44
 *       30  31  32  33  34
 *       20  21  22  23  24
 *       10  11  12  13  14
 * 猪1--> 00  01  02  03  04
 *上述的两个箭头分别代表两个猪测试水的方向。
 *猪1和猪2在0min分别喝第0行和第0列的水，如果两头猪都没事，接着按行按列往下喝，如果某个时间点猪1或猪2死去了，说明猪1或猪2喝的某行某列有水有毒
 *猪1死去，猪2没死，猪1测出了哪行水有毒， 猪2需要在剩下的时间在每个时间点喝下此行剩下的水  ，直到死去，测出哪桶水有毒。猪2死去，猪1没死也是一样的。
 *若猪1和猪2同时死去，那就是他们喝的行列交叉处的水有毒。
 *分析完2头猪可以测25桶水，我们可以得只每个猪可以占一个维度来测试水，即3头猪可以测5^3=125桶水，4头猪可以测5^4=625桶水，5头猪可以测5^5=3125>1000桶水,因此需要5头猪就可以测出来。
 *进阶：
 *先算出有几个时间状态: minutesCount = p/m +1;
 *x头猪各占一个维度：   当    minutesCount^x<n && minutesCount^x>=n时,x就是我们需要的小猪数.  
 */
public class Test_0131 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int buckets = 1000;
		int minutesToDie = 15;
		int minutesToTest = 60;
		System.out.println(So.poorPigs(buckets, minutesToDie, minutesToTest));
	}
}
class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int minutesCount = minutesToTest/minutesToDie +1;
        int poorPigs = 0;
        int maxBuckets = 1;
        while(maxBuckets < buckets){
        	poorPigs++;
        	maxBuckets *= minutesCount;
        }
        return poorPigs;
    }
}