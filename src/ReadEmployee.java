import java.util.Scanner;
public class ReadEmployee
{
    public static void main(String[] args)
    {
        String watchDoramaToday;
        String word = " Day  ";
        watchDoramaToday = " 2 Day ";
        final int Num = 2;
        word = Num + word ;
        System.out.println( word );
        if (Num < 0) {
            System.out.println("�� ��������� ������������� �����");
        } else if (Num > 0) {
            System.out.println("�� ��������� ������������� �����");
        } else {
            System.out.println("�� ��������� ����");
        }
        String name;
        char Hello;
        Scanner console = new Scanner(System.in);
        System.out.println("������� ���� ���:");
        name = console.nextLine();
        System.out.println("������!!! �����");
        Hello = console.next().charAt(0);
        System.out.println("���" + name + Hello + "�����" );
    }
}

