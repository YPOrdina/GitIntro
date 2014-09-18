package nl.ordina.yp.git;

public class EchoService {

    public String echo(String name) {
        return "hello, John!";
    }
    
    public String echo(String name, boolean isMorning) {
		if (isMorning) {
			return "Good morning, " + name + "!";
		} else {
			return "Good afternoon, " + name + "!";

		}
	}

}
