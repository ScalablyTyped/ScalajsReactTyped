package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scrollable extends StObject {
  
  def getScrollState(): Any
  
  def scrollTo(x: Double, y: Double): Unit
}
object Scrollable {
  
  @JSImport("webix", "Scrollable")
  @js.native
  val ^ : Scrollable = js.native
  
  extension [Self <: Scrollable](x: Self) {
    
    inline def setGetScrollState(value: CallbackTo[Any]): Self = StObject.set(x, "getScrollState", value.toJsFn)
    
    inline def setScrollTo(value: (Double, Double) => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
