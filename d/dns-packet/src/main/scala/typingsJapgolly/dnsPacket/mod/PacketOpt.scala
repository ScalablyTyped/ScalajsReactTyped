package typingsJapgolly.dnsPacket.mod

import typingsJapgolly.dnsPacket.dnsPacketStrings.CLIENT_SUBNET
import typingsJapgolly.dnsPacket.dnsPacketStrings.KEY_TAG
import typingsJapgolly.dnsPacket.dnsPacketStrings.PADDING
import typingsJapgolly.dnsPacket.dnsPacketStrings.TCP_KEEPALIVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dnsPacket.mod.ClientSubnetOpt
  - typingsJapgolly.dnsPacket.mod.KeepAliveOpt
  - typingsJapgolly.dnsPacket.mod.PaddingOpt
  - typingsJapgolly.dnsPacket.mod.TagOpt
*/
trait PacketOpt extends StObject
object PacketOpt {
  
  inline def ClientSubnetOpt(code: OptCode[CLIENT_SUBNET]): typingsJapgolly.dnsPacket.mod.ClientSubnetOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.dnsPacket.mod.ClientSubnetOpt]
  }
  
  inline def KeepAliveOpt(code: OptCode[TCP_KEEPALIVE]): typingsJapgolly.dnsPacket.mod.KeepAliveOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.dnsPacket.mod.KeepAliveOpt]
  }
  
  inline def PaddingOpt(code: OptCode[PADDING]): typingsJapgolly.dnsPacket.mod.PaddingOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.dnsPacket.mod.PaddingOpt]
  }
  
  inline def TagOpt(code: OptCode[KEY_TAG], tags: js.Array[Double]): typingsJapgolly.dnsPacket.mod.TagOpt = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.dnsPacket.mod.TagOpt]
  }
}
