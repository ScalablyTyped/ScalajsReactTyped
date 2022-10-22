package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.DisconnectData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectionData
  extends StObject
     with DisconnectData {
  
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}
object DisconnectionData {
  
  inline def apply(code: Double, reason: String, socket: typingsJapgolly.socketclusterServer.serversocketMod.^): DisconnectionData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectionData]
  }
  
  extension [Self <: DisconnectionData](x: Self) {
    
    inline def setSocket(value: typingsJapgolly.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
