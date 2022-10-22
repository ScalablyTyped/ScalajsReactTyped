package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySnapshotAttributeRequest extends StObject {
  
  /**
    * The snapshot attribute to modify. Only volume creation permissions can be modified.
    */
  var Attribute: js.UndefOr[SnapshotAttributeName] = js.undefined
  
  /**
    * A JSON representation of the snapshot attribute modification.
    */
  var CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The group to modify for the snapshot.
    */
  var GroupNames: js.UndefOr[GroupNameStringList] = js.undefined
  
  /**
    * The type of operation to perform to the attribute.
    */
  var OperationType: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.OperationType] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typingsJapgolly.awsSdk.clientsEc2Mod.SnapshotId
  
  /**
    * The account ID to modify for the snapshot.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.undefined
}
object ModifySnapshotAttributeRequest {
  
  inline def apply(SnapshotId: SnapshotId): ModifySnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotAttributeRequest]
  }
  
  extension [Self <: ModifySnapshotAttributeRequest](x: Self) {
    
    inline def setAttribute(value: SnapshotAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setCreateVolumePermission(value: CreateVolumePermissionModifications): Self = StObject.set(x, "CreateVolumePermission", value.asInstanceOf[js.Any])
    
    inline def setCreateVolumePermissionUndefined: Self = StObject.set(x, "CreateVolumePermission", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupNames(value: GroupNameStringList): Self = StObject.set(x, "GroupNames", value.asInstanceOf[js.Any])
    
    inline def setGroupNamesUndefined: Self = StObject.set(x, "GroupNames", js.undefined)
    
    inline def setGroupNamesVarargs(value: SecurityGroupName*): Self = StObject.set(x, "GroupNames", js.Array(value*))
    
    inline def setOperationType(value: OperationType): Self = StObject.set(x, "OperationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "OperationType", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setUserIds(value: UserIdStringList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    inline def setUserIdsVarargs(value: String*): Self = StObject.set(x, "UserIds", js.Array(value*))
  }
}
