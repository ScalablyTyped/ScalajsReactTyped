package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrialsResponse extends StObject {
  
  /**
    * A token for getting the next set of trials, if there are any.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * A list of the summaries of your trials.
    */
  var TrialSummaries: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.TrialSummaries] = js.undefined
}
object ListTrialsResponse {
  
  inline def apply(): ListTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrialsResponse]
  }
  
  extension [Self <: ListTrialsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrialSummaries(value: TrialSummaries): Self = StObject.set(x, "TrialSummaries", value.asInstanceOf[js.Any])
    
    inline def setTrialSummariesUndefined: Self = StObject.set(x, "TrialSummaries", js.undefined)
    
    inline def setTrialSummariesVarargs(value: TrialSummary*): Self = StObject.set(x, "TrialSummaries", js.Array(value*))
  }
}
