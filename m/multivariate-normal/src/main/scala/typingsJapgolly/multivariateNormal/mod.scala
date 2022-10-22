package typingsJapgolly.multivariateNormal

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multivariate-normal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(mean: js.Array[Double], cov: js.Array[js.Array[Double]]): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mean.asInstanceOf[js.Any], cov.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  
  trait Distribution extends StObject {
    
    def getCov(): js.Array[js.Array[Double]]
    
    def getMean(): js.Array[Double]
    
    def sample(): js.Array[Double]
    
    def setCov(newCov: js.Array[js.Array[Double]]): Distribution
    
    def setMean(newMean: js.Array[Double]): Distribution
  }
  object Distribution {
    
    inline def apply(
      getCov: CallbackTo[js.Array[js.Array[Double]]],
      getMean: CallbackTo[js.Array[Double]],
      sample: CallbackTo[js.Array[Double]],
      setCov: js.Array[js.Array[Double]] => Distribution,
      setMean: js.Array[Double] => Distribution
    ): Distribution = {
      val __obj = js.Dynamic.literal(getCov = getCov.toJsFn, getMean = getMean.toJsFn, sample = sample.toJsFn, setCov = js.Any.fromFunction1(setCov), setMean = js.Any.fromFunction1(setMean))
      __obj.asInstanceOf[Distribution]
    }
    
    extension [Self <: Distribution](x: Self) {
      
      inline def setGetCov(value: CallbackTo[js.Array[js.Array[Double]]]): Self = StObject.set(x, "getCov", value.toJsFn)
      
      inline def setGetMean(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getMean", value.toJsFn)
      
      inline def setSample(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "sample", value.toJsFn)
      
      inline def setSetCov(value: js.Array[js.Array[Double]] => Distribution): Self = StObject.set(x, "setCov", js.Any.fromFunction1(value))
      
      inline def setSetMean(value: js.Array[Double] => Distribution): Self = StObject.set(x, "setMean", js.Any.fromFunction1(value))
    }
  }
}
