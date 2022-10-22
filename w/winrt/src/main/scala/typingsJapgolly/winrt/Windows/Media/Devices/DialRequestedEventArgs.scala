package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialRequestedEventArgs
  extends StObject
     with IDialRequestedEventArgs
object DialRequestedEventArgs {
  
  inline def apply(contact: Any, handled: Callback): DialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = handled.toJsFn)
    __obj.asInstanceOf[DialRequestedEventArgs]
  }
}
