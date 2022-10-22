package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayBox extends StObject {
  
  def hideOverlay(): Unit
  
  def showOverlay(): Unit
}
object OverlayBox {
  
  inline def apply(hideOverlay: Callback, showOverlay: Callback): OverlayBox = {
    val __obj = js.Dynamic.literal(hideOverlay = hideOverlay.toJsFn, showOverlay = showOverlay.toJsFn)
    __obj.asInstanceOf[OverlayBox]
  }
  
  extension [Self <: OverlayBox](x: Self) {
    
    inline def setHideOverlay(value: Callback): Self = StObject.set(x, "hideOverlay", value.toJsFn)
    
    inline def setShowOverlay(value: Callback): Self = StObject.set(x, "showOverlay", value.toJsFn)
  }
}
