package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupRequest extends StObject {
  
  /**
    * The identifier of the group to be deleted.
    */
  var GroupId: WorkMailIdentifier
  
  /**
    * The organization that contains the group.
    */
  var OrganizationId: typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId
}
object DeleteGroupRequest {
  
  inline def apply(GroupId: WorkMailIdentifier, OrganizationId: OrganizationId): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupRequest]
  }
  
  extension [Self <: DeleteGroupRequest](x: Self) {
    
    inline def setGroupId(value: WorkMailIdentifier): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
