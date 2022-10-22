package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHumanTaskUisResponse extends StObject {
  
  /**
    * An array of objects describing the human task user interfaces.
    */
  var HumanTaskUiSummaries: typingsJapgolly.awsSdk.clientsSagemakerMod.HumanTaskUiSummaries
  
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListHumanTaskUisResponse {
  
  inline def apply(HumanTaskUiSummaries: HumanTaskUiSummaries): ListHumanTaskUisResponse = {
    val __obj = js.Dynamic.literal(HumanTaskUiSummaries = HumanTaskUiSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanTaskUisResponse]
  }
  
  extension [Self <: ListHumanTaskUisResponse](x: Self) {
    
    inline def setHumanTaskUiSummaries(value: HumanTaskUiSummaries): Self = StObject.set(x, "HumanTaskUiSummaries", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiSummariesVarargs(value: HumanTaskUiSummary*): Self = StObject.set(x, "HumanTaskUiSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
