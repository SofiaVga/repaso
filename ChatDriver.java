public class ChatDriver{
	public static void main (String [] args){
	ChatBot chat1 = new ChatBot ();
	System.out.println(chat1);
	System.out.println("__________CHATGPT_______");
	ChatBot chat2= new ChatBot("CHATGPT", "OpenAI", true, false);
	System.out.println(chat2);
	}
}
