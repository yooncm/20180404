import javax.swing.JOptionPane;

public class Ex01 {
	
		//숫자로 이루어져있으면 true 문자섞여있으면 false
		public static boolean isNumber(String str){
			boolean rtnValue=true;
			for(int i=0;i<str.length();i++){
				str.charAt(i);
				System.out.println("str.charAt("+i+")"+str.charAt(i));
				if(!(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'))
					//if가 아니면
					return false;
			}
			return false;
		}
		public static void main(String[] args){
			String str=JOptionPane.showInputDialog("입력하세요");
			System.out.println("입력받은문자는숫자입니다"+isNumber(str));
		}
	}


