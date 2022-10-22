package typingsJapgolly.firebaseAuth.distAuthMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthPopup extends StObject {
  
  var associatedEvent: String | Null
  
  def close(): Unit
  
  val window: Window | Null
}
object AuthPopup {
  
  inline def apply(close: Callback): AuthPopup = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, associatedEvent = null, window = null)
    __obj.asInstanceOf[AuthPopup]
  }
  
  extension [Self <: AuthPopup](x: Self) {
    
    inline def setAssociatedEvent(value: String): Self = StObject.set(x, "associatedEvent", value.asInstanceOf[js.Any])
    
    inline def setAssociatedEventNull: Self = StObject.set(x, "associatedEvent", null)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowNull: Self = StObject.set(x, "window", null)
  }
}
