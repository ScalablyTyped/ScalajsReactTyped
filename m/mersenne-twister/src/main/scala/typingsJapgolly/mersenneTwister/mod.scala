package typingsJapgolly.mersenneTwister

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mersenne-twister", JSImport.Namespace)
  @js.native
  /**
    * constructs mt with a number
    * @params seed
    */
  open class ^ ()
    extends StObject
       with MersenneTwister {
    def this(seed: js.Array[Double]) = this()
    def this(seed: Double) = this()
    
    /**
      * initializes mt with a number
      */
    /* CompleteClass */
    override def init_seed(seed: Double): Unit = js.native
    
    /**
      * generates a random number on [0,1)-real-interval
      */
    /* CompleteClass */
    override def random(): Double = js.native
    
    /**
      * generates a random number on (0,1)-real-interval
      */
    /* CompleteClass */
    override def random_excl(): Double = js.native
    
    /**
      * generates a random number on [0,1]-real-interval
      */
    /* CompleteClass */
    override def random_incl(): Double = js.native
    
    /**
      * generates a random number on [0,0xffffffff]-interval
      */
    /* CompleteClass */
    override def random_int(): Double = js.native
    
    /**
      * generates a random number on [0,0x7fffffff]-interval
      */
    /* CompleteClass */
    override def random_int31(): Double = js.native
    
    /**
      * generates a random number on [0,1) with 53-bit resolution
      */
    /* CompleteClass */
    override def random_long(): Double = js.native
  }
  
  trait MersenneTwister extends StObject {
    
    /**
      * initializes mt with a number
      */
    def init_seed(seed: Double): Unit
    
    /**
      * generates a random number on [0,1)-real-interval
      */
    def random(): Double
    
    /**
      * generates a random number on (0,1)-real-interval
      */
    def random_excl(): Double
    
    /**
      * generates a random number on [0,1]-real-interval
      */
    def random_incl(): Double
    
    /**
      * generates a random number on [0,0xffffffff]-interval
      */
    def random_int(): Double
    
    /**
      * generates a random number on [0,0x7fffffff]-interval
      */
    def random_int31(): Double
    
    /**
      * generates a random number on [0,1) with 53-bit resolution
      */
    def random_long(): Double
  }
  object MersenneTwister {
    
    inline def apply(
      init_seed: Double => Callback,
      random: CallbackTo[Double],
      random_excl: CallbackTo[Double],
      random_incl: CallbackTo[Double],
      random_int: CallbackTo[Double],
      random_int31: CallbackTo[Double],
      random_long: CallbackTo[Double]
    ): MersenneTwister = {
      val __obj = js.Dynamic.literal(init_seed = js.Any.fromFunction1((t0: Double) => init_seed(t0).runNow()), random = random.toJsFn, random_excl = random_excl.toJsFn, random_incl = random_incl.toJsFn, random_int = random_int.toJsFn, random_int31 = random_int31.toJsFn, random_long = random_long.toJsFn)
      __obj.asInstanceOf[MersenneTwister]
    }
    
    extension [Self <: MersenneTwister](x: Self) {
      
      inline def setInit_seed(value: Double => Callback): Self = StObject.set(x, "init_seed", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setRandom(value: CallbackTo[Double]): Self = StObject.set(x, "random", value.toJsFn)
      
      inline def setRandom_excl(value: CallbackTo[Double]): Self = StObject.set(x, "random_excl", value.toJsFn)
      
      inline def setRandom_incl(value: CallbackTo[Double]): Self = StObject.set(x, "random_incl", value.toJsFn)
      
      inline def setRandom_int(value: CallbackTo[Double]): Self = StObject.set(x, "random_int", value.toJsFn)
      
      inline def setRandom_int31(value: CallbackTo[Double]): Self = StObject.set(x, "random_int31", value.toJsFn)
      
      inline def setRandom_long(value: CallbackTo[Double]): Self = StObject.set(x, "random_long", value.toJsFn)
    }
  }
}
