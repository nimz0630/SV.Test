import java.util.*;

public class HW3_201111345 {
	public static void main(String args[])
	{
		
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		int k = r.nextInt(100);
				
		int count = 1;
		int bound_Min = 0;
		int bound_Max = 100;
		boolean outflag = true; //�Է°��� ������ ��� ��� line20�� ��������� �ʰ� �ϱ� ���� ����ϴ� ����.
		outLabel:
		while(true)
		{
			boolean flag = true; //��¹� �����ϱ� ���� ����.
			if(count == 1 && outflag)
			{
				System.out.println("���� ���߾� ������");
				System.out.printf("%d-%d\n",bound_Min, bound_Max);
				//System.out.println(k);
			}
			System.out.print(count + ">>");
			int temp = scan.nextInt();
			if((temp > 99 || temp < 0) || (temp < bound_Min || temp > bound_Max))
			{
				System.out.printf("�ٽ� �Է��� �ּ���. (%d-%d)\n",bound_Min, bound_Max);
				outflag = false; // 18line�� ��������� �ʱ� ���� �̿�.
				continue;
			}
			
			if(temp == k)
			{
				if(flag)						
				{
					System.out.println("�¾ҽ��ϴ�");
					System.out.println("�ٽ��Ͻðڽ��ϱ�? (y/n)");
				}
				while(true)
				{
					String op = scan.next();
					if(op.equals("n")||op.equals("N"))
					{
						System.out.println("Good Bye");
						break outLabel;
					}
					
					else if(op.equals("y")||op.equals("Y"))
					{
						k = r.nextInt(100);
						count = 1; // �����  count �ʱ�ȭ
						op = null; // op�ʱ�ȭ
						outflag = true;// �� ���� ������ line20 ������ϹǷ� ture�� set
						bound_Min = 0;
						bound_Max = 100; // �� ���� �ٿ���� �ʱ�ȭ
						continue outLabel;
					}
					
					else
					{
						System.out.println("�ùٸ� ���� �Է����ּ���. (y/n)");
						op = null; // op�ʱ�ȭ
						flag = false;//���Է½� 34line�� ����µ��� �ʰԲ� �Ѵ�. loop�� ����� outLabel���� true�� �ʱ�ȭ�ȴ�.
						continue;
					}
					
				}
				
			}
			else if(temp > k)
			{
				System.out.println("�� ����");
				bound_Max = temp;
				System.out.printf("%d - %d\n", bound_Min, bound_Max);
			}
			else if(temp < k)
			{
				System.out.println("�� ����");
				bound_Min = temp;
				System.out.printf("%d - %d\n", bound_Min, bound_Max);
			}
			count++;

		}
	}
}