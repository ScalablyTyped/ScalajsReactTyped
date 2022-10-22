package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventArgs extends StObject {
  
  val sender: Control
}
object EventArgs {
  
  inline def apply(sender: Control): EventArgs = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventArgs]
  }
  
  extension [Self <: EventArgs](x: Self) {
    
    inline def setSender(value: Control): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
