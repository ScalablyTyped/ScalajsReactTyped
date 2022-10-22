package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.BadAuthTokenData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BadSocketAuthTokenData
  extends StObject
     with BadAuthTokenData {
  
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}
object BadSocketAuthTokenData {
  
  inline def apply(
    authError: js.Error,
    signedAuthToken: String,
    socket: typingsJapgolly.socketclusterServer.serversocketMod.^
  ): BadSocketAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadSocketAuthTokenData]
  }
  
  extension [Self <: BadSocketAuthTokenData](x: Self) {
    
    inline def setSocket(value: typingsJapgolly.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
