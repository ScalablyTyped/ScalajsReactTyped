package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEEventEmitter extends StObject {
  
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  def click(event: KmlMouseEvent): Unit
  
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  def dblclick(event: KmlMouseEvent): Unit
  
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  def mousedown(event: KmlMouseEvent): Unit
  
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  def mousemove(event: KmlMouseEvent): Unit
  
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  def mouseout(event: KmlMouseEvent): Unit
  
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  def mouseover(event: KmlMouseEvent): Unit
  
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  def mouseup(event: KmlMouseEvent): Unit
}
object GEEventEmitter {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback
  ): GEEventEmitter = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()))
    __obj.asInstanceOf[GEEventEmitter]
  }
  
  extension [Self <: GEEventEmitter](x: Self) {
    
    inline def setClick(value: KmlMouseEvent => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: KmlMouseEvent) => value(t0).runNow()))
    
    inline def setDblclick(value: KmlMouseEvent => Callback): Self = StObject.set(x, "dblclick", js.Any.fromFunction1((t0: KmlMouseEvent) => value(t0).runNow()))
    
    inline def setMousedown(value: KmlMouseEvent => Callback): Self = StObject.set(x, "mousedown", js.Any.fromFunction1((t0: KmlMouseEvent) => value(t0).runNow()))
    
    inline def setMousemove(value: KmlMouseEvent => Callback): Self = StObject.set(x, "mousemove", js.Any.fromFunction1((t0: KmlMouseEvent) => value(t0).runNow()))
    
    inline def setMouseout(value: KmlMouseEvent => Callback): Self = StObject.set(x, "mouseout", js.Any.fromFunction1((t0: KmlMouseEvent) => value(t0).runNow()))
    
    inline def setMouseover(value: KmlMouseEvent => Callback): Self = StObject.set(x, "mouseover", js.Any.fromFunction1((t0: KmlMouseEvent) => value(t0).runNow()))
    
    inline def setMouseup(value: KmlMouseEvent => Callback): Self = StObject.set(x, "mouseup", js.Any.fromFunction1((t0: KmlMouseEvent) => value(t0).runNow()))
  }
}
