package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainsResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about each of the domain entries in the user's account.
    */
  var domains: js.UndefOr[DomainList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDomains request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetDomainsResult {
  
  inline def apply(): GetDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainsResult]
  }
  
  extension [Self <: GetDomainsResult](x: Self) {
    
    inline def setDomains(value: DomainList): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
