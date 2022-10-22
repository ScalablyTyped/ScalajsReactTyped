package typingsJapgolly.winrtUwp.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the DialRequested event. */
trait DialRequestedEventArgs extends StObject {
  
  /** Returns the contact that was dialed. */
  var contact: Any
  
  /** Indicates that the DialRequested event has been handled. */
  def handled(): Unit
}
object DialRequestedEventArgs {
  
  inline def apply(contact: Any, handled: Callback): DialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = handled.toJsFn)
    __obj.asInstanceOf[DialRequestedEventArgs]
  }
  
  extension [Self <: DialRequestedEventArgs](x: Self) {
    
    inline def setContact(value: Any): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Callback): Self = StObject.set(x, "handled", value.toJsFn)
  }
}
