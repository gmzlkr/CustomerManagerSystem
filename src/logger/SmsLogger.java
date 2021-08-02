package logger;

public class SmsLogger extends Logger{

	@Override
	public void log(String message) {
		System.out.println("SMS logged." +message);
		
	}

}
