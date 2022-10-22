package typingsJapgolly.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListXssMatchSetsRequest extends StObject {
  
  /**
    * Specifies the number of XssMatchSet objects that you want AWS WAF to return for this request. If you have more XssMatchSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of Rules.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * If you specify a value for Limit and you have more XssMatchSet objects than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of XssMatchSets. For the second and subsequent ListXssMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of XssMatchSets.
    */
  var NextMarker: js.UndefOr[typingsJapgolly.awsSdk.clientsWafregionalMod.NextMarker] = js.undefined
}
object ListXssMatchSetsRequest {
  
  inline def apply(): ListXssMatchSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListXssMatchSetsRequest]
  }
  
  extension [Self <: ListXssMatchSetsRequest](x: Self) {
    
    inline def setLimit(value: PaginationLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
