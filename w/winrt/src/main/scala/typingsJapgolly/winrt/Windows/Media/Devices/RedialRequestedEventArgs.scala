package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedialRequestedEventArgs
  extends StObject
     with IRedialRequestedEventArgs
object RedialRequestedEventArgs {
  
  inline def apply(handled: Callback): RedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.toJsFn)
    __obj.asInstanceOf[RedialRequestedEventArgs]
  }
}
