/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joak
 */
import java.util.Scanner;

public class Reader {
    private Scanner scanner;

    public Reader() {
        this.scanner = new Scanner(System.in);
    }
    
    public String readString() {
        return this.scanner.nextLine();
    }
    
    public int readInteger() {
        return Integer.parseInt(this.scanner.nextLine());
    }
}
