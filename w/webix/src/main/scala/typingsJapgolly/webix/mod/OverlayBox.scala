package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayBox extends StObject {
  
  def hideOverlay(): Unit
  
  def showOverlay(): Unit
}
object OverlayBox {
  
  @JSImport("webix", "OverlayBox")
  @js.native
  val ^ : OverlayBox = js.native
  
  extension [Self <: OverlayBox](x: Self) {
    
    inline def setHideOverlay(value: Callback): Self = StObject.set(x, "hideOverlay", value.toJsFn)
    
    inline def setShowOverlay(value: Callback): Self = StObject.set(x, "showOverlay", value.toJsFn)
  }
}
