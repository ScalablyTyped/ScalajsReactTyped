package typingsJapgolly.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficControl extends StObject {
  
  def hide(): Unit
  
  def setPanelOffset(offset: Size): Unit
  
  def show(): Unit
}
object TrafficControl {
  
  inline def apply(
    hide: japgolly.scalajs.react.Callback,
    setPanelOffset: Size => japgolly.scalajs.react.Callback,
    show: japgolly.scalajs.react.Callback
  ): TrafficControl = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, setPanelOffset = js.Any.fromFunction1((t0: Size) => setPanelOffset(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[TrafficControl]
  }
  
  extension [Self <: TrafficControl](x: Self) {
    
    inline def setHide(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setSetPanelOffset(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPanelOffset", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setShow(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
