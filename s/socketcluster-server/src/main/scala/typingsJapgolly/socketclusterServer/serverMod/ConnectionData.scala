package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.ConnectData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionData
  extends StObject
     with ConnectData {
  
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}
object ConnectionData {
  
  inline def apply(
    id: String,
    isAuthenticated: Boolean,
    pingTimeout: Double,
    socket: typingsJapgolly.socketclusterServer.serversocketMod.^
  ): ConnectionData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionData]
  }
  
  extension [Self <: ConnectionData](x: Self) {
    
    inline def setSocket(value: typingsJapgolly.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
