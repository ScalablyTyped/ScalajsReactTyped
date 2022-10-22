package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HystrixSSEStream_ extends StObject {
  
  def toCommandJson(metrics: Any): String
  
  def toObservable(): Observable[Any]
}
object HystrixSSEStream_ {
  
  inline def apply(toCommandJson: Any => String, toObservable: CallbackTo[Observable[Any]]): HystrixSSEStream_ = {
    val __obj = js.Dynamic.literal(toCommandJson = js.Any.fromFunction1(toCommandJson), toObservable = toObservable.toJsFn)
    __obj.asInstanceOf[HystrixSSEStream_]
  }
  
  extension [Self <: HystrixSSEStream_](x: Self) {
    
    inline def setToCommandJson(value: Any => String): Self = StObject.set(x, "toCommandJson", js.Any.fromFunction1(value))
    
    inline def setToObservable(value: CallbackTo[Observable[Any]]): Self = StObject.set(x, "toObservable", value.toJsFn)
  }
}
