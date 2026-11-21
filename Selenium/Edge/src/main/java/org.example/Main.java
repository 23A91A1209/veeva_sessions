package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://maya.adityauniversity.in/");
    }
}