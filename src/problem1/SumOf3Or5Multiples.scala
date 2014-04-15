package problem1

object SumOf3Or5Multiples {
	def main(args:Array[String]){
	  var sum = 0;
	  var x = 0;
	   for( x <- 1 to 999){
	     if( x % 3 == 0 || x % 5 ==0 ){
	       sum += x;
	     }
	   }
	   println(sum);
	 }
}