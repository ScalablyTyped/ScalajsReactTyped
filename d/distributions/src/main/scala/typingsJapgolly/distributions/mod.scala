package typingsJapgolly.distributions

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("distributions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Binomial(properbility: Double, size: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Binomial")(properbility.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  
  inline def Normal(): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Normal")().asInstanceOf[Distribution]
  inline def Normal(mean: Double): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Normal")(mean.asInstanceOf[js.Any]).asInstanceOf[Distribution]
  inline def Normal(mean: Double, sd: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Normal")(mean.asInstanceOf[js.Any], sd.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  inline def Normal(mean: Unit, sd: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Normal")(mean.asInstanceOf[js.Any], sd.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  
  inline def Studentt(df: Double): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Studentt")(df.asInstanceOf[js.Any]).asInstanceOf[Distribution]
  
  inline def Uniform(): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Uniform")().asInstanceOf[Distribution]
  inline def Uniform(a: Double): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Uniform")(a.asInstanceOf[js.Any]).asInstanceOf[Distribution]
  inline def Uniform(a: Double, b: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Uniform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  inline def Uniform(a: Unit, b: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Uniform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  
  trait Distribution extends StObject {
    
    def cdf(x: Double): Double
    
    def inv(p: Double): Double
    
    def mean(): Double
    
    def median(): Double
    
    def pdf(x: Double): Double
    
    def variance(): Double
  }
  object Distribution {
    
    inline def apply(
      cdf: Double => Double,
      inv: Double => Double,
      mean: CallbackTo[Double],
      median: CallbackTo[Double],
      pdf: Double => Double,
      variance: CallbackTo[Double]
    ): Distribution = {
      val __obj = js.Dynamic.literal(cdf = js.Any.fromFunction1(cdf), inv = js.Any.fromFunction1(inv), mean = mean.toJsFn, median = median.toJsFn, pdf = js.Any.fromFunction1(pdf), variance = variance.toJsFn)
      __obj.asInstanceOf[Distribution]
    }
    
    extension [Self <: Distribution](x: Self) {
      
      inline def setCdf(value: Double => Double): Self = StObject.set(x, "cdf", js.Any.fromFunction1(value))
      
      inline def setInv(value: Double => Double): Self = StObject.set(x, "inv", js.Any.fromFunction1(value))
      
      inline def setMean(value: CallbackTo[Double]): Self = StObject.set(x, "mean", value.toJsFn)
      
      inline def setMedian(value: CallbackTo[Double]): Self = StObject.set(x, "median", value.toJsFn)
      
      inline def setPdf(value: Double => Double): Self = StObject.set(x, "pdf", js.Any.fromFunction1(value))
      
      inline def setVariance(value: CallbackTo[Double]): Self = StObject.set(x, "variance", value.toJsFn)
    }
  }
}
