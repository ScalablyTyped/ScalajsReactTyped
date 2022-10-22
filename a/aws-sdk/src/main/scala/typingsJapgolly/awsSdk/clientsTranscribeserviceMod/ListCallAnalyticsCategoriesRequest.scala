package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCallAnalyticsCategoriesRequest extends StObject {
  
  /**
    * The maximum number of Call Analytics categories to return in each page of results. If there are fewer results than the value you specify, only the actual results are returned. If you don't specify a value, a default of 5 is used.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.MaxResults] = js.undefined
  
  /**
    * If your ListCallAnalyticsCategories request returns more results than can be displayed, NextToken is displayed in the response with an associated string. To get the next page of results, copy this string and repeat your request, including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
}
object ListCallAnalyticsCategoriesRequest {
  
  inline def apply(): ListCallAnalyticsCategoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCallAnalyticsCategoriesRequest]
  }
  
  extension [Self <: ListCallAnalyticsCategoriesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
