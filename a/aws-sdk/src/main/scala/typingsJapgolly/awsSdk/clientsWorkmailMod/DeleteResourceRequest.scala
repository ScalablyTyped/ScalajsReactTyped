package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourceRequest extends StObject {
  
  /**
    * The identifier associated with the organization from which the resource is deleted.
    */
  var OrganizationId: typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId
  
  /**
    * The identifier of the resource to be deleted.
    */
  var ResourceId: typingsJapgolly.awsSdk.clientsWorkmailMod.ResourceId
}
object DeleteResourceRequest {
  
  inline def apply(OrganizationId: OrganizationId, ResourceId: ResourceId): DeleteResourceRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceRequest]
  }
  
  extension [Self <: DeleteResourceRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
