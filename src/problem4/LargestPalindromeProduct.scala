package problem4
import scala.util.control.Breaks._
object LargestPalindromeProduct {
	def main(args: Array[String]) {
	  var largestProduct = -1
	  for(i <- 100 to 1000 ){
	    for( j <- 100 to 1000 ){
	      var product = i * j
	      var prodInStr = product.toString
	      var prodLastindex = prodInStr.length - 1
	      var isPalindromic = true
	      println(prodInStr)
	      for( k <- 0 to (prodInStr.length/2)){	    	  
	    	  println("prodInStr.charAt("+k+") : "+prodInStr.charAt(k))
	    	  println("prodInStr.charAt(prodLastindex-"+k+") : "+prodInStr.charAt(prodLastindex-k))
	    	  isPalindromic &= (prodInStr.charAt(k) == prodInStr.charAt(prodLastindex-k))
	      }
	      if(isPalindromic){
	        println("Palindromic product : "+product)
	        if(largestProduct < product){
	          largestProduct = product
	        }
	      }
	    }
	  }
	  
	  println(" largest Palindromic product : "+largestProduct)
	  
	}
}