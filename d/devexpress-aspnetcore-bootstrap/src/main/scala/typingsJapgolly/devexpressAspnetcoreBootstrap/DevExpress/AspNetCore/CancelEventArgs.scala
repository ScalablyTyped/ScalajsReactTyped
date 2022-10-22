package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelEventArgs
  extends StObject
     with EventArgs {
  
  var cancel: Boolean
}
object CancelEventArgs {
  
  inline def apply(cancel: Boolean, sender: Control): CancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEventArgs]
  }
  
  extension [Self <: CancelEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
