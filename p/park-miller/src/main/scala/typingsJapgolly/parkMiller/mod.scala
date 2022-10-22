package typingsJapgolly.parkMiller

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("park-miller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ParkMiller {
    /**
    	[Park-Miller](https://en.wikipedia.org/wiki/Lehmer_random_number_generator) pseudorandom number generator (PRNG).
    	@param seed - [Initialization seed.](https://en.wikipedia.org/wiki/Random_seed)
    	@example
    	```
    	import ParkMiller from 'park-miller';
    	const random = new ParkMiller(10);
    	random.integer();
    	//=> 2027521326
    	```
    	*/
    def this(seed: Double) = this()
    
    /* CompleteClass */
    override def boolean(): Boolean = js.native
    
    /* CompleteClass */
    override def float(): Double = js.native
    
    /* CompleteClass */
    override def floatInRange(min: Double, max: Double): Double = js.native
    
    /* CompleteClass */
    override def integer(): Double = js.native
    
    /* CompleteClass */
    override def integerInRange(min: Double, max: Double): Double = js.native
  }
  
  trait ParkMiller extends StObject {
    
    def boolean(): Boolean
    
    def float(): Double
    
    def floatInRange(min: Double, max: Double): Double
    
    def integer(): Double
    
    def integerInRange(min: Double, max: Double): Double
  }
  object ParkMiller {
    
    inline def apply(
      boolean: CallbackTo[Boolean],
      float: CallbackTo[Double],
      floatInRange: (Double, Double) => Double,
      integer: CallbackTo[Double],
      integerInRange: (Double, Double) => Double
    ): ParkMiller = {
      val __obj = js.Dynamic.literal(boolean = boolean.toJsFn, float = float.toJsFn, floatInRange = js.Any.fromFunction2(floatInRange), integer = integer.toJsFn, integerInRange = js.Any.fromFunction2(integerInRange))
      __obj.asInstanceOf[ParkMiller]
    }
    
    extension [Self <: ParkMiller](x: Self) {
      
      inline def setBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "boolean", value.toJsFn)
      
      inline def setFloat(value: CallbackTo[Double]): Self = StObject.set(x, "float", value.toJsFn)
      
      inline def setFloatInRange(value: (Double, Double) => Double): Self = StObject.set(x, "floatInRange", js.Any.fromFunction2(value))
      
      inline def setInteger(value: CallbackTo[Double]): Self = StObject.set(x, "integer", value.toJsFn)
      
      inline def setIntegerInRange(value: (Double, Double) => Double): Self = StObject.set(x, "integerInRange", js.Any.fromFunction2(value))
    }
  }
}
