package typingsJapgolly.mersennetwister

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mersennetwister", JSImport.Namespace)
  @js.native
  /** Creates a new instance seeded by an unsined 32-bit integer or or array of unsigned 32-bit integers */
  open class ^ ()
    extends StObject
       with MersenneTwister {
    def this(seed: js.Array[Double]) = this()
    def this(seed: Double) = this()
    
    /** Returns a random 32-bit unsigned integer */
    /* CompleteClass */
    override def int(): Double = js.native
    
    /** Returns a random 31-bit unsigned integer */
    /* CompleteClass */
    override def int31(): Double = js.native
    
    /**
      * This is an alias of the `rnd()` method
      * @alias rnd()
      */
    /* CompleteClass */
    override def random(): Double = js.native
    
    /** Returns a random float in the range [0,1] */
    /* CompleteClass */
    override def real(): Double = js.native
    
    /** Returns a random float in the range (0,1) */
    /* CompleteClass */
    override def realx(): Double = js.native
    
    /** Returns a random float in the range [0,1) with 32-bit precision */
    /* CompleteClass */
    override def rnd(): Double = js.native
    
    /** Returns a random float in the range [0,1) with 53-bit precision */
    /* CompleteClass */
    override def rndHiRes(): Double = js.native
    
    /** Reseed the generator with the specified 32-bit unsigned integer */
    /* CompleteClass */
    override def seed(seed: Double): Unit = js.native
    
    /** Reseed the generator's state vector with an array of 32-bit unsigned integers */
    /* CompleteClass */
    override def seedArray(seeds: js.Array[Double]): Unit = js.native
  }
  
  trait MersenneTwister extends StObject {
    
    /** Returns a random 32-bit unsigned integer */
    def int(): Double
    
    /** Returns a random 31-bit unsigned integer */
    def int31(): Double
    
    /**
      * This is an alias of the `rnd()` method
      * @alias rnd()
      */
    def random(): Double
    
    /** Returns a random float in the range [0,1] */
    def real(): Double
    
    /** Returns a random float in the range (0,1) */
    def realx(): Double
    
    /** Returns a random float in the range [0,1) with 32-bit precision */
    def rnd(): Double
    
    /** Returns a random float in the range [0,1) with 53-bit precision */
    def rndHiRes(): Double
    
    /** Reseed the generator with the specified 32-bit unsigned integer */
    def seed(seed: Double): Unit
    
    /** Reseed the generator's state vector with an array of 32-bit unsigned integers */
    def seedArray(seeds: js.Array[Double]): Unit
  }
  object MersenneTwister {
    
    inline def apply(
      int: CallbackTo[Double],
      int31: CallbackTo[Double],
      random: CallbackTo[Double],
      real: CallbackTo[Double],
      realx: CallbackTo[Double],
      rnd: CallbackTo[Double],
      rndHiRes: CallbackTo[Double],
      seed: Double => Callback,
      seedArray: js.Array[Double] => Callback
    ): MersenneTwister = {
      val __obj = js.Dynamic.literal(int = int.toJsFn, int31 = int31.toJsFn, random = random.toJsFn, real = real.toJsFn, realx = realx.toJsFn, rnd = rnd.toJsFn, rndHiRes = rndHiRes.toJsFn, seed = js.Any.fromFunction1((t0: Double) => seed(t0).runNow()), seedArray = js.Any.fromFunction1((t0: js.Array[Double]) => seedArray(t0).runNow()))
      __obj.asInstanceOf[MersenneTwister]
    }
    
    extension [Self <: MersenneTwister](x: Self) {
      
      inline def setInt(value: CallbackTo[Double]): Self = StObject.set(x, "int", value.toJsFn)
      
      inline def setInt31(value: CallbackTo[Double]): Self = StObject.set(x, "int31", value.toJsFn)
      
      inline def setRandom(value: CallbackTo[Double]): Self = StObject.set(x, "random", value.toJsFn)
      
      inline def setReal(value: CallbackTo[Double]): Self = StObject.set(x, "real", value.toJsFn)
      
      inline def setRealx(value: CallbackTo[Double]): Self = StObject.set(x, "realx", value.toJsFn)
      
      inline def setRnd(value: CallbackTo[Double]): Self = StObject.set(x, "rnd", value.toJsFn)
      
      inline def setRndHiRes(value: CallbackTo[Double]): Self = StObject.set(x, "rndHiRes", value.toJsFn)
      
      inline def setSeed(value: Double => Callback): Self = StObject.set(x, "seed", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSeedArray(value: js.Array[Double] => Callback): Self = StObject.set(x, "seedArray", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    }
  }
}
