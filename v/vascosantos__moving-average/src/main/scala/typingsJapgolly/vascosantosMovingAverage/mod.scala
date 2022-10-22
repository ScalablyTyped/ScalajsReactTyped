package typingsJapgolly.vascosantosMovingAverage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(timespan: Double): IMovingAverage = ^.asInstanceOf[js.Dynamic].apply(timespan.asInstanceOf[js.Any]).asInstanceOf[IMovingAverage]
  
  @JSImport("@vascosantos/moving-average", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IMovingAverage extends StObject {
    
    def deviation(): Double
    
    def forecast(): Double
    
    def movingAverage(): Double
    
    def push(time: Double, value: Double): Unit
    
    def variance(): Double
  }
  object IMovingAverage {
    
    inline def apply(
      deviation: CallbackTo[Double],
      forecast: CallbackTo[Double],
      movingAverage: CallbackTo[Double],
      push: (Double, Double) => Callback,
      variance: CallbackTo[Double]
    ): IMovingAverage = {
      val __obj = js.Dynamic.literal(deviation = deviation.toJsFn, forecast = forecast.toJsFn, movingAverage = movingAverage.toJsFn, push = js.Any.fromFunction2((t0: Double, t1: Double) => (push(t0, t1)).runNow()), variance = variance.toJsFn)
      __obj.asInstanceOf[IMovingAverage]
    }
    
    extension [Self <: IMovingAverage](x: Self) {
      
      inline def setDeviation(value: CallbackTo[Double]): Self = StObject.set(x, "deviation", value.toJsFn)
      
      inline def setForecast(value: CallbackTo[Double]): Self = StObject.set(x, "forecast", value.toJsFn)
      
      inline def setMovingAverage(value: CallbackTo[Double]): Self = StObject.set(x, "movingAverage", value.toJsFn)
      
      inline def setPush(value: (Double, Double) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setVariance(value: CallbackTo[Double]): Self = StObject.set(x, "variance", value.toJsFn)
    }
  }
}
