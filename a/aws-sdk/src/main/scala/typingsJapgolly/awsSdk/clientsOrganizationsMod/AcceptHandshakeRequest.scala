package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptHandshakeRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the handshake that you want to accept. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lowercase letters or digits.
    */
  var HandshakeId: typingsJapgolly.awsSdk.clientsOrganizationsMod.HandshakeId
}
object AcceptHandshakeRequest {
  
  inline def apply(HandshakeId: HandshakeId): AcceptHandshakeRequest = {
    val __obj = js.Dynamic.literal(HandshakeId = HandshakeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptHandshakeRequest]
  }
  
  extension [Self <: AcceptHandshakeRequest](x: Self) {
    
    inline def setHandshakeId(value: HandshakeId): Self = StObject.set(x, "HandshakeId", value.asInstanceOf[js.Any])
  }
}
