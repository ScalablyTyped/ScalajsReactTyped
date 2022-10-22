package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEWindow
  extends StObject
     with GEEventEmitter {
  
  /**
    * Removes focus from the Google Earth object.
    */
  def blur(): Unit
  
  /**
    * Gives the Google Earth object focus.
    */
  def focus(): Unit
  
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def getVisibility(): Boolean
  
  /**
    * Toggles the overall visibility of Google Earth inside the browser.
    */
  def setVisibility(visibility: Boolean): Unit
}
object GEWindow {
  
  inline def apply(
    blur: Callback,
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    focus: Callback,
    getVisibility: CallbackTo[Boolean],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    setVisibility: Boolean => Callback
  ): GEWindow = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), focus = focus.toJsFn, getVisibility = getVisibility.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), setVisibility = js.Any.fromFunction1((t0: Boolean) => setVisibility(t0).runNow()))
    __obj.asInstanceOf[GEWindow]
  }
  
  extension [Self <: GEWindow](x: Self) {
    
    inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setGetVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisibility", value.toJsFn)
    
    inline def setSetVisibility(value: Boolean => Callback): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
