package typingsJapgolly.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastFailedEventArgs
  extends StObject
     with IToastFailedEventArgs
object ToastFailedEventArgs {
  
  inline def apply(errorCode: Double): ToastFailedEventArgs = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastFailedEventArgs]
  }
}
