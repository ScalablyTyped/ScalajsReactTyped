package typingsJapgolly.fancybox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxFullScreen extends StObject {
  
  def enabled(): Boolean
  
  def exit(): Unit
  
  def isFullscreen(): Boolean
  
  def request(elem: HTMLElement): Unit
  
  def toggle(elem: HTMLElement): Unit
}
object FancyBoxFullScreen {
  
  inline def apply(
    enabled: CallbackTo[Boolean],
    exit: Callback,
    isFullscreen: CallbackTo[Boolean],
    request: HTMLElement => Callback,
    toggle: HTMLElement => Callback
  ): FancyBoxFullScreen = {
    val __obj = js.Dynamic.literal(enabled = enabled.toJsFn, exit = exit.toJsFn, isFullscreen = isFullscreen.toJsFn, request = js.Any.fromFunction1((t0: HTMLElement) => request(t0).runNow()), toggle = js.Any.fromFunction1((t0: HTMLElement) => toggle(t0).runNow()))
    __obj.asInstanceOf[FancyBoxFullScreen]
  }
  
  extension [Self <: FancyBoxFullScreen](x: Self) {
    
    inline def setEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "enabled", value.toJsFn)
    
    inline def setExit(value: Callback): Self = StObject.set(x, "exit", value.toJsFn)
    
    inline def setIsFullscreen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFullscreen", value.toJsFn)
    
    inline def setRequest(value: HTMLElement => Callback): Self = StObject.set(x, "request", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    
    inline def setToggle(value: HTMLElement => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
  }
}
