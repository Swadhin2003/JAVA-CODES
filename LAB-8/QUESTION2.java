interface Motor
{ 
   void run(); 
   void consume();
}
class WashingMachine implements Motor
{
  int capacity; 
  public WashingMachine(int capacity)
  {
     this.capacity = capacity; 
  }
  public void run()
  {
     System.out.println("Run");
  }
  public void consume()
  { 
     System.out.println("Consume");
  }
}
class QUESTION2
{
  public static void main(String[] args)
  {
    WashingMachine wm = new WashingMachine(100000);
    System.out.println(wm.capacity);
    wm.run();
    wm.consume(); 
  } 
}