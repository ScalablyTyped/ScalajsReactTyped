package typingsJapgolly.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWebsiteAuthorizationProvidersRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsJapgolly.awsSdk.clientsWorklinkMod.FleetArn
  
  /**
    * The maximum number of results to be included in the next page.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsWorklinkMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsWorklinkMod.NextToken] = js.undefined
}
object ListWebsiteAuthorizationProvidersRequest {
  
  inline def apply(FleetArn: FleetArn): ListWebsiteAuthorizationProvidersRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebsiteAuthorizationProvidersRequest]
  }
  
  extension [Self <: ListWebsiteAuthorizationProvidersRequest](x: Self) {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
