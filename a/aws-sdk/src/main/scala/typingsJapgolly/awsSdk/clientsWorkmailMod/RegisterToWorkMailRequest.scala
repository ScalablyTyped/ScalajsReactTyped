package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterToWorkMailRequest extends StObject {
  
  /**
    * The email for the user, group, or resource to be updated.
    */
  var Email: EmailAddress
  
  /**
    * The identifier for the user, group, or resource to be updated.
    */
  var EntityId: WorkMailIdentifier
  
  /**
    * The identifier for the organization under which the user, group, or resource exists.
    */
  var OrganizationId: typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId
}
object RegisterToWorkMailRequest {
  
  inline def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): RegisterToWorkMailRequest = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterToWorkMailRequest]
  }
  
  extension [Self <: RegisterToWorkMailRequest](x: Self) {
    
    inline def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
