package typingsJapgolly.waypoints

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.waypoints.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaypointAdapter extends StObject {
  
  def innerHeight(): Double
  
  def innerWidth(): Double
  
  def off(event: String): Unit
  
  def offset(): Left
  
  def on(event: String, handler: js.Function0[Unit]): Unit
  
  def outerHeight(includeMargin: Boolean): Double
  
  def outerWidth(includeMargin: Boolean): Double
  
  def scrollLeft(): Double
  
  def scrollTop(): Double
}
object WaypointAdapter {
  
  inline def apply(
    innerHeight: CallbackTo[Double],
    innerWidth: CallbackTo[Double],
    off: String => Callback,
    offset: CallbackTo[Left],
    on: (String, js.Function0[Unit]) => Callback,
    outerHeight: Boolean => Double,
    outerWidth: Boolean => Double,
    scrollLeft: CallbackTo[Double],
    scrollTop: CallbackTo[Double]
  ): WaypointAdapter = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight.toJsFn, innerWidth = innerWidth.toJsFn, off = js.Any.fromFunction1((t0: String) => off(t0).runNow()), offset = offset.toJsFn, on = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), outerHeight = js.Any.fromFunction1(outerHeight), outerWidth = js.Any.fromFunction1(outerWidth), scrollLeft = scrollLeft.toJsFn, scrollTop = scrollTop.toJsFn)
    __obj.asInstanceOf[WaypointAdapter]
  }
  
  extension [Self <: WaypointAdapter](x: Self) {
    
    inline def setInnerHeight(value: CallbackTo[Double]): Self = StObject.set(x, "innerHeight", value.toJsFn)
    
    inline def setInnerWidth(value: CallbackTo[Double]): Self = StObject.set(x, "innerWidth", value.toJsFn)
    
    inline def setOff(value: String => Callback): Self = StObject.set(x, "off", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOffset(value: CallbackTo[Left]): Self = StObject.set(x, "offset", value.toJsFn)
    
    inline def setOn(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setOuterHeight(value: Boolean => Double): Self = StObject.set(x, "outerHeight", js.Any.fromFunction1(value))
    
    inline def setOuterWidth(value: Boolean => Double): Self = StObject.set(x, "outerWidth", js.Any.fromFunction1(value))
    
    inline def setScrollLeft(value: CallbackTo[Double]): Self = StObject.set(x, "scrollLeft", value.toJsFn)
    
    inline def setScrollTop(value: CallbackTo[Double]): Self = StObject.set(x, "scrollTop", value.toJsFn)
  }
}
