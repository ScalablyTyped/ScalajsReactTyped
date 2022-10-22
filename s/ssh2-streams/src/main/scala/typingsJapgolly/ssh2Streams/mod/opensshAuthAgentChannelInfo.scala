package typingsJapgolly.ssh2Streams.mod

import typingsJapgolly.ssh2Streams.ssh2StreamsStrings.`auth-agent@opensshDotcom`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opensshAuthAgentChannelInfo
  extends StObject
     with ChannelOpenInfo {
  
  var packetSize: Double
  
  var sender: Double
  
  var `type`: `auth-agent@opensshDotcom`
  
  var window: Double
}
object opensshAuthAgentChannelInfo {
  
  inline def apply(packetSize: Double, sender: Double, window: Double): opensshAuthAgentChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("auth-agent@openssh.com")
    __obj.asInstanceOf[opensshAuthAgentChannelInfo]
  }
  
  extension [Self <: opensshAuthAgentChannelInfo](x: Self) {
    
    inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: `auth-agent@opensshDotcom`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
