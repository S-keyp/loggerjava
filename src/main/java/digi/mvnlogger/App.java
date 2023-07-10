package digi.mvnlogger;

import digi.appservice.AppService;

public class App {
	public static void main(String[] args) {
		AppService app = new AppService();
		app.executer("test");
	}
}
