package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPDialIn extends StObject {
  
  /**
    * The protocol, including SIP, SIPS, and H323.
    */
  var CommsProtocol: typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.CommsProtocol
  
  /**
    * The IP address.
    */
  var Endpoint: typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.Endpoint
}
object IPDialIn {
  
  inline def apply(CommsProtocol: CommsProtocol, Endpoint: Endpoint): IPDialIn = {
    val __obj = js.Dynamic.literal(CommsProtocol = CommsProtocol.asInstanceOf[js.Any], Endpoint = Endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPDialIn]
  }
  
  extension [Self <: IPDialIn](x: Self) {
    
    inline def setCommsProtocol(value: CommsProtocol): Self = StObject.set(x, "CommsProtocol", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
  }
}
