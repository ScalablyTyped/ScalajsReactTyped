package typingsJapgolly.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlarmModelsRequest extends StObject {
  
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token that you can use to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAlarmModelsRequest {
  
  inline def apply(): ListAlarmModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlarmModelsRequest]
  }
  
  extension [Self <: ListAlarmModelsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
