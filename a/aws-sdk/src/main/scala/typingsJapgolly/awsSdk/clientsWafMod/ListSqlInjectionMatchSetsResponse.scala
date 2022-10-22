package typingsJapgolly.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSqlInjectionMatchSetsResponse extends StObject {
  
  /**
    * If you have more SqlInjectionMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SqlInjectionMatchSet objects, submit another ListSqlInjectionMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typingsJapgolly.awsSdk.clientsWafMod.NextMarker] = js.undefined
  
  /**
    * An array of SqlInjectionMatchSetSummary objects.
    */
  var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries] = js.undefined
}
object ListSqlInjectionMatchSetsResponse {
  
  inline def apply(): ListSqlInjectionMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSqlInjectionMatchSetsResponse]
  }
  
  extension [Self <: ListSqlInjectionMatchSetsResponse](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setSqlInjectionMatchSets(value: SqlInjectionMatchSetSummaries): Self = StObject.set(x, "SqlInjectionMatchSets", value.asInstanceOf[js.Any])
    
    inline def setSqlInjectionMatchSetsUndefined: Self = StObject.set(x, "SqlInjectionMatchSets", js.undefined)
    
    inline def setSqlInjectionMatchSetsVarargs(value: SqlInjectionMatchSetSummary*): Self = StObject.set(x, "SqlInjectionMatchSets", js.Array(value*))
  }
}
