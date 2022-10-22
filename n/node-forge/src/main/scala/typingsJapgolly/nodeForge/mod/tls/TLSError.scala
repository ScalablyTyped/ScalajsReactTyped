package typingsJapgolly.nodeForge.mod.tls

import typingsJapgolly.nodeForge.nodeForgeStrings.client
import typingsJapgolly.nodeForge.nodeForgeStrings.server
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLSError
  extends StObject
     with Error {
  
  var alert: Alert
  
  var origin: server | client
  
  var send: Boolean
}
object TLSError {
  
  inline def apply(alert: Alert, message: String, name: String, origin: server | client, send: Boolean): TLSError = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[TLSError]
  }
  
  extension [Self <: TLSError](x: Self) {
    
    inline def setAlert(value: Alert): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: server | client): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setSend(value: Boolean): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
  }
}
