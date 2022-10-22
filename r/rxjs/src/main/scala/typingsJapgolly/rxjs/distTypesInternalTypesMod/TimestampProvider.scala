package typingsJapgolly.rxjs.distTypesInternalTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampProvider extends StObject {
  
  /**
    * Returns a timestamp as a number.
    *
    * This is used by types like `ReplaySubject` or operators like `timestamp` to calculate
    * the amount of time passed between events.
    */
  def now(): Double
}
object TimestampProvider {
  
  inline def apply(now: CallbackTo[Double]): TimestampProvider = {
    val __obj = js.Dynamic.literal(now = now.toJsFn)
    __obj.asInstanceOf[TimestampProvider]
  }
  
  extension [Self <: TimestampProvider](x: Self) {
    
    inline def setNow(value: CallbackTo[Double]): Self = StObject.set(x, "now", value.toJsFn)
  }
}
