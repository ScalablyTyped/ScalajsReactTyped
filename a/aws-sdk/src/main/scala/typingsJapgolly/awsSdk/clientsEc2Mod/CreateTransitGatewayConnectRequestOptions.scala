package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayConnectRequestOptions extends StObject {
  
  /**
    * The tunnel protocol.
    */
  var Protocol: ProtocolValue
}
object CreateTransitGatewayConnectRequestOptions {
  
  inline def apply(Protocol: ProtocolValue): CreateTransitGatewayConnectRequestOptions = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayConnectRequestOptions]
  }
  
  extension [Self <: CreateTransitGatewayConnectRequestOptions](x: Self) {
    
    inline def setProtocol(value: ProtocolValue): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
  }
}
