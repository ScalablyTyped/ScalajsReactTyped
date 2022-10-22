package typingsJapgolly.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkChatEventArgs
  extends StObject
     with NetworkEventArgs {
  
  var message: String
}
object NetworkChatEventArgs {
  
  inline def apply(message: String, player: Double): NetworkChatEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkChatEventArgs]
  }
  
  extension [Self <: NetworkChatEventArgs](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
