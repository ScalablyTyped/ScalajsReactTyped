package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkloadShareInput extends StObject {
  
  var PermissionType: typingsJapgolly.awsSdk.clientsWellarchitectedMod.PermissionType
  
  var ShareId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.ShareId
  
  var WorkloadId: typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object UpdateWorkloadShareInput {
  
  inline def apply(PermissionType: PermissionType, ShareId: ShareId, WorkloadId: WorkloadId): UpdateWorkloadShareInput = {
    val __obj = js.Dynamic.literal(PermissionType = PermissionType.asInstanceOf[js.Any], ShareId = ShareId.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkloadShareInput]
  }
  
  extension [Self <: UpdateWorkloadShareInput](x: Self) {
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
    
    inline def setShareId(value: ShareId): Self = StObject.set(x, "ShareId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
