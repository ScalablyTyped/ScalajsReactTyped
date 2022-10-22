package typingsJapgolly.uikit.distJsUikitMod.UIkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitLightboxElement extends StObject {
  
  def hide(): Unit
  
  def show(index: Double): Unit
}
object UIkitLightboxElement {
  
  inline def apply(hide: Callback, show: Double => Callback): UIkitLightboxElement = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = js.Any.fromFunction1((t0: Double) => show(t0).runNow()))
    __obj.asInstanceOf[UIkitLightboxElement]
  }
  
  extension [Self <: UIkitLightboxElement](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Double => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
