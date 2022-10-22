package typingsJapgolly.mqttPacket.mod

import typingsJapgolly.mqttPacket.anon.AuthenticationData
import typingsJapgolly.mqttPacket.mqttPacketStrings.auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuthPacket
  extends StObject
     with IPacket
     with Packet {
  
  @JSName("cmd")
  var cmd_IAuthPacket: auth
  
  var properties: js.UndefOr[AuthenticationData] = js.undefined
  
  var reasonCode: Double
}
object IAuthPacket {
  
  inline def apply(reasonCode: Double): IAuthPacket = {
    val __obj = js.Dynamic.literal(cmd = "auth", reasonCode = reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthPacket]
  }
  
  extension [Self <: IAuthPacket](x: Self) {
    
    inline def setCmd(value: auth): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AuthenticationData): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReasonCode(value: Double): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
  }
}
