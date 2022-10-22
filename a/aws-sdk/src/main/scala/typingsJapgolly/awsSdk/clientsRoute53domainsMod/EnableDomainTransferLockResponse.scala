package typingsJapgolly.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableDomainTransferLockResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To use this ID to query the operation status, use GetOperationDetail.
    */
  var OperationId: typingsJapgolly.awsSdk.clientsRoute53domainsMod.OperationId
}
object EnableDomainTransferLockResponse {
  
  inline def apply(OperationId: OperationId): EnableDomainTransferLockResponse = {
    val __obj = js.Dynamic.literal(OperationId = OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDomainTransferLockResponse]
  }
  
  extension [Self <: EnableDomainTransferLockResponse](x: Self) {
    
    inline def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
  }
}
