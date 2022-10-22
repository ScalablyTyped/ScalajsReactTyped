package typingsJapgolly.awsSdk.clientsServicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRequestedServiceQuotaChangeHistoryRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, if any, make another call with the token returned from this call.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsServicequotasMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsServicequotasMod.NextToken] = js.undefined
  
  /**
    * The service identifier.
    */
  var ServiceCode: js.UndefOr[typingsJapgolly.awsSdk.clientsServicequotasMod.ServiceCode] = js.undefined
  
  /**
    * The status of the quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.undefined
}
object ListRequestedServiceQuotaChangeHistoryRequest {
  
  inline def apply(): ListRequestedServiceQuotaChangeHistoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRequestedServiceQuotaChangeHistoryRequest]
  }
  
  extension [Self <: ListRequestedServiceQuotaChangeHistoryRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    
    inline def setStatus(value: RequestStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
