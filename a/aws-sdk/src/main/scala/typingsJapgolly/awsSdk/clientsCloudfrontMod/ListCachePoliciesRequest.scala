package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCachePoliciesRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of cache policies. The response includes cache policies in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of cache policies that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
  
  /**
    * A filter to return only the specified kinds of cache policies. Valid values are:    managed – Returns only the managed policies created by Amazon Web Services.    custom – Returns only the custom policies created in your Amazon Web Services account.  
    */
  var Type: js.UndefOr[CachePolicyType] = js.undefined
}
object ListCachePoliciesRequest {
  
  inline def apply(): ListCachePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCachePoliciesRequest]
  }
  
  extension [Self <: ListCachePoliciesRequest](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setType(value: CachePolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
