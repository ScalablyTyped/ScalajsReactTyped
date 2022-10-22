package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkloadShareInput extends StObject {
  
  var ClientRequestToken: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ClientRequestToken
  
  var ShareId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ShareId
  
  var WorkloadId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object DeleteWorkloadShareInput {
  
  inline def apply(ClientRequestToken: ClientRequestToken, ShareId: ShareId, WorkloadId: WorkloadId): DeleteWorkloadShareInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], ShareId = ShareId.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkloadShareInput]
  }
  
  extension [Self <: DeleteWorkloadShareInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
