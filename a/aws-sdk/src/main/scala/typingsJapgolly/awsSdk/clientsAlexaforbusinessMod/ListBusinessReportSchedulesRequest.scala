package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBusinessReportSchedulesRequest extends StObject {
  
  /**
    * The maximum number of schedules listed in the call.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.MaxResults] = js.undefined
  
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}
object ListBusinessReportSchedulesRequest {
  
  inline def apply(): ListBusinessReportSchedulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBusinessReportSchedulesRequest]
  }
  
  extension [Self <: ListBusinessReportSchedulesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
