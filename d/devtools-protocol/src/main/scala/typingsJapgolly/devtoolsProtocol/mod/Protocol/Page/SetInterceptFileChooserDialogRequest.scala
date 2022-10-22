package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInterceptFileChooserDialogRequest extends StObject {
  
  var enabled: Boolean
}
object SetInterceptFileChooserDialogRequest {
  
  inline def apply(enabled: Boolean): SetInterceptFileChooserDialogRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInterceptFileChooserDialogRequest]
  }
  
  extension [Self <: SetInterceptFileChooserDialogRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
