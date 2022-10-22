package typingsJapgolly.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlarmModelVersionsRequest extends StObject {
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: AlarmModelName
  
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token that you can use to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAlarmModelVersionsRequest {
  
  inline def apply(alarmModelName: AlarmModelName): ListAlarmModelVersionsRequest = {
    val __obj = js.Dynamic.literal(alarmModelName = alarmModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAlarmModelVersionsRequest]
  }
  
  extension [Self <: ListAlarmModelVersionsRequest](x: Self) {
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
