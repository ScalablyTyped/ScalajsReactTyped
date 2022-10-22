package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOrganizationResponse extends StObject {
  
  /**
    * The organization ID.
    */
  var OrganizationId: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId] = js.undefined
  
  /**
    * The state of the organization.
    */
  var State: js.UndefOr[String] = js.undefined
}
object DeleteOrganizationResponse {
  
  inline def apply(): DeleteOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteOrganizationResponse]
  }
  
  extension [Self <: DeleteOrganizationResponse](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
