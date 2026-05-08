
public class Pattern {

	static void pattern1_15() {
        int num = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		Pattern p = new Pattern();
		p.pattern1_15();
	}
}
