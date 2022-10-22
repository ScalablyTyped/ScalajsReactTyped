package typingsJapgolly.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsInput extends StObject {
  
  /**
    * The maximum number of results that are returned per call. Use nextPageToken to obtain further pages of results. 
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  
  /**
    * If NextPageToken is returned there are more results available. The value of NextPageToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after 60 seconds. Using an expired pagination token will return a 400 error: "Specified token has exceeded its maximum lifetime".  The configured maximumPageSize determines how many results can be returned in a single call. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Specifies the registration status of the domains to list.
    */
  var registrationStatus: RegistrationStatus
  
  /**
    * When set to true, returns the results in reverse order. By default, the results are returned in ascending alphabetical order by name of the domains.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
}
object ListDomainsInput {
  
  inline def apply(registrationStatus: RegistrationStatus): ListDomainsInput = {
    val __obj = js.Dynamic.literal(registrationStatus = registrationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsInput]
  }
  
  extension [Self <: ListDomainsInput](x: Self) {
    
    inline def setMaximumPageSize(value: PageSize): Self = StObject.set(x, "maximumPageSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumPageSizeUndefined: Self = StObject.set(x, "maximumPageSize", js.undefined)
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRegistrationStatus(value: RegistrationStatus): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    
    inline def setReverseOrder(value: ReverseOrder): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
    
    inline def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
  }
}
