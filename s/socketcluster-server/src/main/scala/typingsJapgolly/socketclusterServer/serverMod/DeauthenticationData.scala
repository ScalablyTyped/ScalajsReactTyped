package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.DeauthenticateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeauthenticationData
  extends StObject
     with DeauthenticateData {
  
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}
object DeauthenticationData {
  
  inline def apply(socket: typingsJapgolly.socketclusterServer.serversocketMod.^): DeauthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthenticationData]
  }
  
  extension [Self <: DeauthenticationData](x: Self) {
    
    inline def setSocket(value: typingsJapgolly.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
