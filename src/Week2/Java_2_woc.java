package Week2;

interface WorkeCommunication {
	public void person();

	public void greet();

	public void talk();

}

class WorkplaceCommunication implements WorkeCommunication {
	String name;
	String post;
	String report; //上司への報連相
	String contact;
	String advice;

	WorkplaceCommunication() {
		this.name = "鈴木";
		this.post = "上司";
		this.report = "先月の売上は100万円でした。";
		this.contact = "本日15時から戸部Bank社とMTGです。";
		this.advice = "接待に使用できるの良いお店教えてください。"
				+ "";
	}

	public void person() {
		System.out.println(this.post + ": " + this.name + "さん");

	}

	public void greet() {
		System.out.println("お疲れ様です。");

	}

	public void talk() {
		System.out.println("報告事項:" + " " + this.report);
		System.out.println("連絡事項:" + " " + this.contact);
		System.out.println("相談事項:" + " " + this.advice);

	}

}

public class Java_2_woc {
	public static void main(String[] args) {
		WorkeCommunication wc = new WorkplaceCommunication();
		wc.person();
		wc.greet();
		wc.talk();

	}

}
