package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserHierarchyGroupNameRequest extends StObject {
  
  /**
    * The identifier of the hierarchy group.
    */
  var HierarchyGroupId: typingsJapgolly.awsSdk.clientsConnectMod.HierarchyGroupId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the hierarchy group. Must not be more than 100 characters.
    */
  var Name: HierarchyGroupName
}
object UpdateUserHierarchyGroupNameRequest {
  
  inline def apply(HierarchyGroupId: HierarchyGroupId, InstanceId: InstanceId, Name: HierarchyGroupName): UpdateUserHierarchyGroupNameRequest = {
    val __obj = js.Dynamic.literal(HierarchyGroupId = HierarchyGroupId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserHierarchyGroupNameRequest]
  }
  
  extension [Self <: UpdateUserHierarchyGroupNameRequest](x: Self) {
    
    inline def setHierarchyGroupId(value: HierarchyGroupId): Self = StObject.set(x, "HierarchyGroupId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: HierarchyGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
