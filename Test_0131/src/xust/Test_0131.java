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
3. ѹ���ַ���
����һ���ַ���ʹ��ԭ���㷨����ѹ����
ѹ����ĳ��ȱ���ʼ��С�ڻ����ԭ���鳤�ȡ�
�����ÿ��Ԫ��Ӧ���ǳ���Ϊ1 ���ַ������� int �������ͣ���
�����ԭ���޸���������󣬷���������³��ȡ�
���ף�
���ܷ��ʹ��O(1) �ռ������⣿

ʾ�� 1��
���룺
["a","a","b","b","c","c","c"]
�����
����6�����������ǰ6���ַ�Ӧ���ǣ�["a","2","b","2","c","3"]
˵����
"aa"��"a2"�����"bb"��"b2"�����"ccc"��"c3"�����

ʾ�� 2��
���룺
["a"]
�����
����1�����������ǰ1���ַ�Ӧ���ǣ�["a"]
˵����
û���κ��ַ����������

ʾ�� 3��
���룺
["a","b","b","b","b","b","b","b","b","b","b","b","b"]
�����
����4�����������ǰ4���ַ�Ӧ���ǣ�["a","b","1","2"]��
˵����
�����ַ�"a"���ظ������Բ��ᱻѹ����"bbbbbbbbbbbb"����b12�������
ע��ÿ�������������ж������Լ���λ�á�
ע�⣺
�����ַ�����һ��ASCIIֵ��[35, 126]�����ڡ�
1 <= len(chars) <= 1000��
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
4. ������С��
��1000ֻˮͰ����������ֻ��һͰװ�ĺ��ж�ҩ������װ�Ķ���ˮ�����Ǵ���ۿ�������һ�������С����˶�ҩ��������15��������ȥ��
�������ˣ������Ҫ����һСʱ�ڣ�Ū�����ֻˮͰ���ж�ҩ����������Ҫ����ֻ��
�ش�������⣬��Ϊ���еĽ��������дһ��ͨ���㷨��
����:
������ n ֻˮͰ������ˮ�ж������ m ����������������Ҫ������x�������� p �������ҳ����ж���ˮͰ��nֻˮͰ�����ҽ���һֻ�ж���Ͱ��
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