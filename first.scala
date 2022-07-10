package assignment1

object first {
  
  def main(args:Array[String])
  {
    // 01,02,03
    
    var k = 2
    var i = 2
    var j = 2
    var m = 5
    var n = 5
    var f = 12.0f
    var g = 4.0f
    val c = 'X'
    
    var x = k+12*m
    var y = m/j;
    var z = n%j
    var t = f+ 10*5 +g
    var w = (i+1)*n
    
     
  }
  
  // 03
  
  def main(args:Array[String])
  {
    var a :Int = 2
    var b :Int = 3
    var c :Int = 4
    var d :Int = 5
    var k :Float = 4.3f
    
    println((b-1)*a + c*(d-1))
    println((a+1))
    println((-2)*(g-k) +c)
    println(c = c + 1)
    println(c = (1+c)*(a+1))
    
    
    
    
  }
  
  // 04(a)
  
  def main(args: Array[String]): Unit = {    
    
    println("Q4 (a)");
    print("a)")
    def TakeHomeSalary(normal:Int,ot:Int) : Int = 
    {
        var tax=(normal*250+ot*85)*(12/100);
        return ((normal*250+ot*85)-tax);
    }
    print("Enter Normal hours :")
    var normal=readInt();
    print("Enter OT hours :");
    var ot=readInt();
    println(TakeHomeSalary(normal,ot));
  }
  
}