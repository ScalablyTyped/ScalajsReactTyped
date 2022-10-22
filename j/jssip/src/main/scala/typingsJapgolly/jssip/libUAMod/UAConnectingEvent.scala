package typingsJapgolly.jssip.libUAMod

import typingsJapgolly.jssip.libWebSocketInterfaceMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UAConnectingEvent extends StObject {
  
  var attempts: Double
  
  var socket: Socket
}
object UAConnectingEvent {
  
  inline def apply(attempts: Double, socket: Socket): UAConnectingEvent = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UAConnectingEvent]
  }
  
  extension [Self <: UAConnectingEvent](x: Self) {
    
    inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
    
    inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
