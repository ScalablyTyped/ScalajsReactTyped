package typingsJapgolly.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoverersResponse extends StObject {
  
  /**
    * An array of DiscovererSummary information.
    */
  var Discoverers: js.UndefOr[listOfDiscovererSummary] = js.undefined
  
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListDiscoverersResponse {
  
  inline def apply(): ListDiscoverersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoverersResponse]
  }
  
  extension [Self <: ListDiscoverersResponse](x: Self) {
    
    inline def setDiscoverers(value: listOfDiscovererSummary): Self = StObject.set(x, "Discoverers", value.asInstanceOf[js.Any])
    
    inline def setDiscoverersUndefined: Self = StObject.set(x, "Discoverers", js.undefined)
    
    inline def setDiscoverersVarargs(value: DiscovererSummary*): Self = StObject.set(x, "Discoverers", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
