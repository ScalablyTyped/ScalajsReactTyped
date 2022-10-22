package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationRequest extends StObject {
  
  /**
    * The identifier for the organization to be described.
    */
  var OrganizationId: typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId
}
object DescribeOrganizationRequest {
  
  inline def apply(OrganizationId: OrganizationId): DescribeOrganizationRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationRequest]
  }
  
  extension [Self <: DescribeOrganizationRequest](x: Self) {
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
