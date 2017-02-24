package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(8089);
		Socket socket = s.accept();
		BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String rs;
		while ((rs = r.readLine()) != null && rs.length() > 0) {
			System.out.println(rs);
		}
		socket.close();
		s.close();
	}
}
