package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectorResponse extends StObject {
  
  /**
    * Returns the identifier of the connector object that you are updating.
    */
  var ConnectorId: typingsJapgolly.awsSdk.clientsTransferMod.ConnectorId
}
object UpdateConnectorResponse {
  
  inline def apply(ConnectorId: ConnectorId): UpdateConnectorResponse = {
    val __obj = js.Dynamic.literal(ConnectorId = ConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectorResponse]
  }
  
  extension [Self <: UpdateConnectorResponse](x: Self) {
    
    inline def setConnectorId(value: ConnectorId): Self = StObject.set(x, "ConnectorId", value.asInstanceOf[js.Any])
  }
}
