package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptReservedNodeExchangeInputMessage extends StObject {
  
  /**
    * A string representing the node identifier of the DC1 Reserved Node to be exchanged.
    */
  var ReservedNodeId: String
  
  /**
    * The unique identifier of the DC2 Reserved Node offering to be used for the exchange. You can obtain the value for the parameter by calling GetReservedNodeExchangeOfferings 
    */
  var TargetReservedNodeOfferingId: String
}
object AcceptReservedNodeExchangeInputMessage {
  
  inline def apply(ReservedNodeId: String, TargetReservedNodeOfferingId: String): AcceptReservedNodeExchangeInputMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeId = ReservedNodeId.asInstanceOf[js.Any], TargetReservedNodeOfferingId = TargetReservedNodeOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptReservedNodeExchangeInputMessage]
  }
  
  extension [Self <: AcceptReservedNodeExchangeInputMessage](x: Self) {
    
    inline def setReservedNodeId(value: String): Self = StObject.set(x, "ReservedNodeId", value.asInstanceOf[js.Any])
    
    inline def setTargetReservedNodeOfferingId(value: String): Self = StObject.set(x, "TargetReservedNodeOfferingId", value.asInstanceOf[js.Any])
  }
}
