interface A {
public int display();
}
abstract class B implements A {
}
public class Example extends B {
public int display() {
return 0;
}
}