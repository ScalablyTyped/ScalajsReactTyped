package typingsJapgolly.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImpersonationRolesRequest extends StObject {
  
  /**
    * The maximum number of results returned in a single call.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.MaxResults] = js.undefined
  
  /**
    * The token used to retrieve the next page of results. The first call doesn't require a token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
  
  /**
    * The WorkMail organization to which the listed impersonation roles belong.
    */
  var OrganizationId: typingsJapgolly.awsSdk.clientsWorkmailMod.OrganizationId
}
object ListImpersonationRolesRequest {
  
  inline def apply(OrganizationId: OrganizationId): ListImpersonationRolesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImpersonationRolesRequest]
  }
  
  extension [Self <: ListImpersonationRolesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
