package typingsJapgolly.socketclusterServer.serverMod

import typingsJapgolly.socketclusterServer.serversocketMod.CloseData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosureData
  extends StObject
     with CloseData {
  
  var socket: typingsJapgolly.socketclusterServer.serversocketMod.^
}
object ClosureData {
  
  inline def apply(code: Double, reason: String, socket: typingsJapgolly.socketclusterServer.serversocketMod.^): ClosureData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosureData]
  }
  
  extension [Self <: ClosureData](x: Self) {
    
    inline def setSocket(value: typingsJapgolly.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
