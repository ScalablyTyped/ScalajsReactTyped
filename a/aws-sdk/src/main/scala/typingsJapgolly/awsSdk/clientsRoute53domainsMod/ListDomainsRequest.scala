package typingsJapgolly.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsRequest extends StObject {
  
  /**
    * A complex type that contains information about the filters applied during the ListDomains request. The filter conditions can include domain name and domain expiration.
    */
  var FilterConditions: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53domainsMod.FilterConditions] = js.undefined
  
  /**
    * For an initial request for a list of domains, omit this element. If the number of domains that are associated with the current Amazon Web Services account is greater than the value that you specified for MaxItems, you can use Marker to return additional domains. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element. Constraints: The marker must match the value specified in the previous request.
    */
  var Marker: js.UndefOr[PageMarker] = js.undefined
  
  /**
    * Number of domains to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  
  /**
    * A complex type that contains information about the requested ordering of domains in the returned list.
    */
  var SortCondition: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53domainsMod.SortCondition] = js.undefined
}
object ListDomainsRequest {
  
  inline def apply(): ListDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsRequest]
  }
  
  extension [Self <: ListDomainsRequest](x: Self) {
    
    inline def setFilterConditions(value: FilterConditions): Self = StObject.set(x, "FilterConditions", value.asInstanceOf[js.Any])
    
    inline def setFilterConditionsUndefined: Self = StObject.set(x, "FilterConditions", js.undefined)
    
    inline def setFilterConditionsVarargs(value: FilterCondition*): Self = StObject.set(x, "FilterConditions", js.Array(value*))
    
    inline def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setSortCondition(value: SortCondition): Self = StObject.set(x, "SortCondition", value.asInstanceOf[js.Any])
    
    inline def setSortConditionUndefined: Self = StObject.set(x, "SortCondition", js.undefined)
  }
}
