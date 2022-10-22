package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDialRequestedEventArgs extends StObject {
  
  var contact: Any
  
  def handled(): Unit
}
object IDialRequestedEventArgs {
  
  inline def apply(contact: Any, handled: Callback): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = handled.toJsFn)
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
  
  extension [Self <: IDialRequestedEventArgs](x: Self) {
    
    inline def setContact(value: Any): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setHandled(value: Callback): Self = StObject.set(x, "handled", value.toJsFn)
  }
}
