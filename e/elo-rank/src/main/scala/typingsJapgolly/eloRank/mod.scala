package typingsJapgolly.eloRank

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("elo-rank", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EloRank {
    def this(kFactor: Double) = this()
    
    /* CompleteClass */
    override def getExpected(a: Double, b: Double): Double = js.native
    
    /* CompleteClass */
    override def getKFactor(): Double = js.native
    
    /* CompleteClass */
    override def setKFactor(kFactor: Double): Unit = js.native
    
    /* CompleteClass */
    override def updateRating(expected: Double, actual: Double, current: Double): Double = js.native
  }
  
  trait EloRank extends StObject {
    
    def getExpected(a: Double, b: Double): Double
    
    def getKFactor(): Double
    
    def setKFactor(kFactor: Double): Unit
    
    def updateRating(expected: Double, actual: Double, current: Double): Double
  }
  object EloRank {
    
    inline def apply(
      getExpected: (Double, Double) => Double,
      getKFactor: CallbackTo[Double],
      setKFactor: Double => Callback,
      updateRating: (Double, Double, Double) => Double
    ): EloRank = {
      val __obj = js.Dynamic.literal(getExpected = js.Any.fromFunction2(getExpected), getKFactor = getKFactor.toJsFn, setKFactor = js.Any.fromFunction1((t0: Double) => setKFactor(t0).runNow()), updateRating = js.Any.fromFunction3(updateRating))
      __obj.asInstanceOf[EloRank]
    }
    
    extension [Self <: EloRank](x: Self) {
      
      inline def setGetExpected(value: (Double, Double) => Double): Self = StObject.set(x, "getExpected", js.Any.fromFunction2(value))
      
      inline def setGetKFactor(value: CallbackTo[Double]): Self = StObject.set(x, "getKFactor", value.toJsFn)
      
      inline def setSetKFactor(value: Double => Callback): Self = StObject.set(x, "setKFactor", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setUpdateRating(value: (Double, Double, Double) => Double): Self = StObject.set(x, "updateRating", js.Any.fromFunction3(value))
    }
  }
}
