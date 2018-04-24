package helloworld;

import com.google.common.base.Joiner;
import moomin.Moomin;

public class HelloWorld {

  public static void main(String[] args) {
    Moomin moomin = new Moomin();
    Joiner joiner = Joiner.on(" * ");
    System.out.println("moomin says " + joiner.join(moomin.sayHello(), moomin.sayHello()));
  }
}
