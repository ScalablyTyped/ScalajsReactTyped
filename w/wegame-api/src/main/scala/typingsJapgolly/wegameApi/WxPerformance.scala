package typingsJapgolly.wegameApi

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WxPerformance extends StObject {
  
  /**
    * 时间戳
    */
  def now(): Double
}
object WxPerformance {
  
  inline def apply(now: CallbackTo[Double]): WxPerformance = {
    val __obj = js.Dynamic.literal(now = now.toJsFn)
    __obj.asInstanceOf[WxPerformance]
  }
  
  extension [Self <: WxPerformance](x: Self) {
    
    inline def setNow(value: CallbackTo[Double]): Self = StObject.set(x, "now", value.toJsFn)
  }
}
