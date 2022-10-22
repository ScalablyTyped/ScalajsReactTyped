package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectMitigationActionsTasksResponse extends StObject {
  
  /**
    *  A token that can be used to retrieve the next set of results, or null if there are no additional results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  The collection of ML Detect mitigation tasks that matched the filter criteria. 
    */
  var tasks: js.UndefOr[DetectMitigationActionsTaskSummaryList] = js.undefined
}
object ListDetectMitigationActionsTasksResponse {
  
  inline def apply(): ListDetectMitigationActionsTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectMitigationActionsTasksResponse]
  }
  
  extension [Self <: ListDetectMitigationActionsTasksResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTasks(value: DetectMitigationActionsTaskSummaryList): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: DetectMitigationActionsTaskSummary*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
