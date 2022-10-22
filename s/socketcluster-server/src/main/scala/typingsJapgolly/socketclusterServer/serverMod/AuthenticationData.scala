package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.AuthenticateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationData
  extends StObject
     with AuthenticateData {
  
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}
object AuthenticationData {
  
  inline def apply(socket: typingsJapgolly.socketclusterServer.serversocketMod.^): AuthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
  
  extension [Self <: AuthenticationData](x: Self) {
    
    inline def setSocket(value: typingsJapgolly.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
