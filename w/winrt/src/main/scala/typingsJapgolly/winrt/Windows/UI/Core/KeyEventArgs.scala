package typingsJapgolly.winrt.Windows.UI.Core

import typingsJapgolly.winrt.Windows.System.VirtualKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyEventArgs
  extends StObject
     with IKeyEventArgs
object KeyEventArgs {
  
  inline def apply(handled: Boolean, keyStatus: CorePhysicalKeyStatus, virtualKey: VirtualKey): KeyEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyEventArgs]
  }
}
