package xust;

/*
1. �ַ����еĵ�����
ͳ���ַ����еĵ��ʸ���������ĵ���ָ���������Ĳ��ǿո���ַ���
��ע�⣬����Լٶ��ַ����ﲻ�����κβ��ɴ�ӡ���ַ���
ʾ��:
����: "Hello, my name is John"
���: 5
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
2. ����Ӳ��
���ܹ��� n öӲ�ң�����Ҫ�����ǰڳ�һ��������״���� k �оͱ��������� k öӲ�ҡ�
����һ������ n���ҳ����γ����������е���������
n ��һ���Ǹ�������������32λ�з������͵ķ�Χ�ڡ�

ʾ�� 1:
n = 5
Ӳ�ҿ����г����¼���:
��
�� ��
�� ��
��Ϊ�����в����������Է���2.

ʾ�� 2:
n = 8
Ӳ�ҿ����г����¼���:
��
�� ��
�� �� ��
�� ��
��Ϊ�����в����������Է���3.
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
3. �����ڵ�����
����ƽ���� n �Բ�ͬ�ĵ㣬�������ڡ� ���ɵ��ʾ��Ԫ�� (i, j, k) ������ i �� j ֮��ľ���� i �� k ֮��ľ�����ȣ���Ҫ����Ԫ���˳�򣩡�
�ҵ����л����ڵ�����������Լ��� n ���Ϊ 500�����е�������ڱ����� [-10000, 10000] �С�

ʾ��:
����:
[[0,0],[1,0],[2,0]]
���:
2
����:
����������Ϊ [[1,0],[0,0],[2,0]] �� [[1,0],[2,0],[0,0]]
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
4. ������С��
��1000ֻˮͰ����������ֻ��һͰװ�ĺ��ж�ҩ������װ�Ķ���ˮ�����Ǵ���ۿ�������һ�������С����˶�ҩ��������15��������ȥ��
�������ˣ������Ҫ����һСʱ�ڣ�Ū�����ֻˮͰ���ж�ҩ����������Ҫ����ֻ��
�ش�������⣬��Ϊ���еĽ��������дһ��ͨ���㷨��
����:
������ n ֻˮͰ������ˮ�ж������ m ����������������Ҫ������x�������� p �������ҳ����ж���ˮͰ��nֻˮͰ�����ҽ���һֻ�ж���Ͱ��
 */
/*
 * ��Ҫ��һСʱ�ڲ��Գ���Ͱˮ�ж�����ÿͷ����¶�ҩ����15��������ȥ���������������ʱ��״̬��0min,15min,30min,45min,60min.
 * ����������buckets��1ʱ����Ͱˮ�����ж���ˮ����˾�����Ҫ0ͷ��
 * 1ͷ��1��Сʱ�ڿ��Բ�5Ͱˮ��ÿ��״̬�º���һͰ������ĳ��ʱ�����ȥ���������Ͱˮ�ж���
 * �ȿ�һ��2ͷ����Բ����Ͱˮ�أ���ÿͰˮ����ά����ţ���������5��״̬��ÿ��ÿ�з�5Ͱˮ ��
 *       ��2
 *        |
 *        V
 *       40  41  42  43  44
 *       30  31  32  33  34
 *       20  21  22  23  24
 *       10  11  12  13  14
 * ��1--> 00  01  02  03  04
 *������������ͷ�ֱ�������������ˮ�ķ���
 *��1����2��0min�ֱ�ȵ�0�к͵�0�е�ˮ�������ͷ��û�£����Ű��а������ºȣ����ĳ��ʱ�����1����2��ȥ�ˣ�˵����1����2�ȵ�ĳ��ĳ����ˮ�ж�
 *��1��ȥ����2û������1���������ˮ�ж��� ��2��Ҫ��ʣ�µ�ʱ����ÿ��ʱ�����´���ʣ�µ�ˮ  ��ֱ����ȥ�������Ͱˮ�ж�����2��ȥ����1û��Ҳ��һ���ġ�
 *����1����2ͬʱ��ȥ���Ǿ������Ǻȵ����н��洦��ˮ�ж���
 *������2ͷ����Բ�25Ͱˮ�����ǿ��Ե�ֻÿ�������ռһ��ά��������ˮ����3ͷ����Բ�5^3=125Ͱˮ��4ͷ����Բ�5^4=625Ͱˮ��5ͷ����Բ�5^5=3125>1000Ͱˮ,�����Ҫ5ͷ��Ϳ��Բ������
 *���ף�
 *������м���ʱ��״̬: minutesCount = p/m +1;
 *xͷ���ռһ��ά�ȣ�   ��    minutesCount^x<n && minutesCount^x>=nʱ,x����������Ҫ��С����.  
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