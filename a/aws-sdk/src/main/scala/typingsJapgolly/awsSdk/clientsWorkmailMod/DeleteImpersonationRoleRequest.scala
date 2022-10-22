package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteImpersonationRoleRequest extends StObject {
  
  /**
    * The ID of the impersonation role to delete.
    */
  var ImpersonationRoleId: typingsJapgolly.awsSdk.clientsWorkmailMod.ImpersonationRoleId
  
  /**
    * The WorkMail organization from which to delete the impersonation role.
    */
  var OrganizationId: typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId
}
object DeleteImpersonationRoleRequest {
  
  inline def apply(ImpersonationRoleId: ImpersonationRoleId, OrganizationId: OrganizationId): DeleteImpersonationRoleRequest = {
    val __obj = js.Dynamic.literal(ImpersonationRoleId = ImpersonationRoleId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteImpersonationRoleRequest]
  }
  
  extension [Self <: DeleteImpersonationRoleRequest](x: Self) {
    
    inline def setImpersonationRoleId(value: ImpersonationRoleId): Self = StObject.set(x, "ImpersonationRoleId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
