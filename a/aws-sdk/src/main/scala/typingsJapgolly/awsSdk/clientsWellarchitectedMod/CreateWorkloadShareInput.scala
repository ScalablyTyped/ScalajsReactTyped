package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkloadShareInput extends StObject {
  
  var ClientRequestToken: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ClientRequestToken
  
  var PermissionType: typingsJapgolly.awsSdk.clientsWellarchitectedMod.PermissionType
  
  var SharedWith: typingsJapgolly.awsSdk.clientsWellarchitectedMod.SharedWith
  
  var WorkloadId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object CreateWorkloadShareInput {
  
  inline def apply(
    ClientRequestToken: ClientRequestToken,
    PermissionType: PermissionType,
    SharedWith: SharedWith,
    WorkloadId: WorkloadId
  ): CreateWorkloadShareInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any], SharedWith = SharedWith.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkloadShareInput]
  }
  
  extension [Self <: CreateWorkloadShareInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
    
    inline def setSharedWith(value: SharedWith): Self = StObject.set(x, "SharedWith", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
