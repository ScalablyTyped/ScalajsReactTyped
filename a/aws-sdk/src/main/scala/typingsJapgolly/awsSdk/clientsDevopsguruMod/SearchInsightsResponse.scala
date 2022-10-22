package typingsJapgolly.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInsightsResponse extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[UuidNextToken] = js.undefined
  
  /**
    *  The returned proactive insights. 
    */
  var ProactiveInsights: js.UndefOr[typingsJapgolly.awsSdk.clientsDevopsguruMod.ProactiveInsights] = js.undefined
  
  /**
    *  The returned reactive insights. 
    */
  var ReactiveInsights: js.UndefOr[typingsJapgolly.awsSdk.clientsDevopsguruMod.ReactiveInsights] = js.undefined
}
object SearchInsightsResponse {
  
  inline def apply(): SearchInsightsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchInsightsResponse]
  }
  
  extension [Self <: SearchInsightsResponse](x: Self) {
    
    inline def setNextToken(value: UuidNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProactiveInsights(value: ProactiveInsights): Self = StObject.set(x, "ProactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setProactiveInsightsUndefined: Self = StObject.set(x, "ProactiveInsights", js.undefined)
    
    inline def setProactiveInsightsVarargs(value: ProactiveInsightSummary*): Self = StObject.set(x, "ProactiveInsights", js.Array(value*))
    
    inline def setReactiveInsights(value: ReactiveInsights): Self = StObject.set(x, "ReactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setReactiveInsightsUndefined: Self = StObject.set(x, "ReactiveInsights", js.undefined)
    
    inline def setReactiveInsightsVarargs(value: ReactiveInsightSummary*): Self = StObject.set(x, "ReactiveInsights", js.Array(value*))
  }
}
