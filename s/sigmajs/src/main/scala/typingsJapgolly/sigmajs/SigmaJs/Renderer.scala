package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Renderer extends StObject {
  
  var container: HTMLElement
  
  def refresh(): Sigma
  
  def render(): Sigma
  
  def resize(): Sigma
  
  def settings(settings: Settings): Unit
}
object Renderer {
  
  inline def apply(
    container: HTMLElement,
    refresh: CallbackTo[Sigma],
    render: CallbackTo[Sigma],
    resize: CallbackTo[Sigma],
    settings: Settings => Callback
  ): Renderer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], refresh = refresh.toJsFn, render = render.toJsFn, resize = resize.toJsFn, settings = js.Any.fromFunction1((t0: Settings) => settings(t0).runNow()))
    __obj.asInstanceOf[Renderer]
  }
  
  extension [Self <: Renderer](x: Self) {
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: CallbackTo[Sigma]): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setRender(value: CallbackTo[Sigma]): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setResize(value: CallbackTo[Sigma]): Self = StObject.set(x, "resize", value.toJsFn)
    
    inline def setSettings(value: Settings => Callback): Self = StObject.set(x, "settings", js.Any.fromFunction1((t0: Settings) => value(t0).runNow()))
  }
}
