package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonClickEventArgs
  extends StObject
     with ProcessingModeEventArgs {
  
  val cancelEventAndBubble: Boolean
}
object ButtonClickEventArgs {
  
  inline def apply(cancelEventAndBubble: Boolean, processOnServer: Boolean, sender: Control): ButtonClickEventArgs = {
    val __obj = js.Dynamic.literal(cancelEventAndBubble = cancelEventAndBubble.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonClickEventArgs]
  }
  
  extension [Self <: ButtonClickEventArgs](x: Self) {
    
    inline def setCancelEventAndBubble(value: Boolean): Self = StObject.set(x, "cancelEventAndBubble", value.asInstanceOf[js.Any])
  }
}
