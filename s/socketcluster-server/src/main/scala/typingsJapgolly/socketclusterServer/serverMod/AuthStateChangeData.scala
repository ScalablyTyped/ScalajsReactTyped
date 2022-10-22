package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.StateChangeData
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.authenticated
import typingsJapgolly.socketclusterServer.socketclusterServerStrings.unauthenticated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthStateChangeData
  extends StObject
     with StateChangeData {
  
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}
object AuthStateChangeData {
  
  inline def apply(
    newState: authenticated | unauthenticated,
    oldState: authenticated | unauthenticated,
    socket: typingsJapgolly.socketclusterServer.serversocketMod.^
  ): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
  
  extension [Self <: AuthStateChangeData](x: Self) {
    
    inline def setSocket(value: typingsJapgolly.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
