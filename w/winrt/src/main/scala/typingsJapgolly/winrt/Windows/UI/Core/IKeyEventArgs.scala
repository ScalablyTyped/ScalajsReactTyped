package typingsJapgolly.winrt.Windows.UI.Core

import typingsJapgolly.winrt.Windows.System.VirtualKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyEventArgs
  extends StObject
     with ICoreWindowEventArgs {
  
  var keyStatus: CorePhysicalKeyStatus
  
  var virtualKey: VirtualKey
}
object IKeyEventArgs {
  
  inline def apply(handled: Boolean, keyStatus: CorePhysicalKeyStatus, virtualKey: VirtualKey): IKeyEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any], virtualKey = virtualKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyEventArgs]
  }
  
  extension [Self <: IKeyEventArgs](x: Self) {
    
    inline def setKeyStatus(value: CorePhysicalKeyStatus): Self = StObject.set(x, "keyStatus", value.asInstanceOf[js.Any])
    
    inline def setVirtualKey(value: VirtualKey): Self = StObject.set(x, "virtualKey", value.asInstanceOf[js.Any])
  }
}
