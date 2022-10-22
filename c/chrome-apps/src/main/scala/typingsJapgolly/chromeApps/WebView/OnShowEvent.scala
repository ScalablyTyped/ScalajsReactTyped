package typingsJapgolly.chromeApps.WebView

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnShowEvent extends StObject {
  
  /** Call this to prevent showing the context menu. */
  def preventDefault(): Unit
}
object OnShowEvent {
  
  inline def apply(preventDefault: Callback): OnShowEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.toJsFn)
    __obj.asInstanceOf[OnShowEvent]
  }
  
  extension [Self <: OnShowEvent](x: Self) {
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
  }
}
