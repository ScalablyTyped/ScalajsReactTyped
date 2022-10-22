package typingsJapgolly.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ssh2Streams.mod.X11ChannelInfo
  - typingsJapgolly.ssh2Streams.mod.ForwardedTcpipChannelInfo
  - typingsJapgolly.ssh2Streams.mod.opensshForwardedStreamLocalChannelInfo
  - typingsJapgolly.ssh2Streams.mod.opensshAuthAgentChannelInfo
  - typingsJapgolly.ssh2Streams.mod.DirectTcpipChannelInfo
  - typingsJapgolly.ssh2Streams.mod.opensshDirectStreamLocalChannelInfo
  - typingsJapgolly.ssh2Streams.mod.SessionChannelInfo
*/
trait ChannelOpenInfo extends StObject
object ChannelOpenInfo {
  
  inline def DirectTcpipChannelInfo(data: TcpipChannelData, packetSize: Double, sender: Double, window: Double): typingsJapgolly.ssh2Streams.mod.DirectTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("direct-tcpip")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.DirectTcpipChannelInfo]
  }
  
  inline def ForwardedTcpipChannelInfo(data: TcpipChannelData, packetSize: Double, sender: Double, window: Double): typingsJapgolly.ssh2Streams.mod.ForwardedTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("forwarded-tcpip")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.ForwardedTcpipChannelInfo]
  }
  
  inline def SessionChannelInfo(packetSize: Double, sender: Double, window: Double): typingsJapgolly.ssh2Streams.mod.SessionChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("session")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.SessionChannelInfo]
  }
  
  inline def X11ChannelInfo(data: X11ChannelData, packetSize: Double, sender: Double, window: Double): typingsJapgolly.ssh2Streams.mod.X11ChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("x11")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.X11ChannelInfo]
  }
  
  inline def opensshAuthAgentChannelInfo(packetSize: Double, sender: Double, window: Double): typingsJapgolly.ssh2Streams.mod.opensshAuthAgentChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("auth-agent@openssh.com")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.opensshAuthAgentChannelInfo]
  }
  
  inline def opensshDirectStreamLocalChannelInfo(data: SocketChannelData, packetSize: Double, sender: Double, window: Double): typingsJapgolly.ssh2Streams.mod.opensshDirectStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("direct-streamlocal@openssh.com")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.opensshDirectStreamLocalChannelInfo]
  }
  
  inline def opensshForwardedStreamLocalChannelInfo(data: SocketChannelData, packetSize: Double, sender: Double, window: Double): typingsJapgolly.ssh2Streams.mod.opensshForwardedStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("forwarded-streamlocal@openssh.com")
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.opensshForwardedStreamLocalChannelInfo]
  }
}
