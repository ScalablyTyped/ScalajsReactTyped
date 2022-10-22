package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingAggregatorsResponse extends StObject {
  
  /**
    * The list of finding aggregators. This operation currently only returns a single result.
    */
  var FindingAggregators: js.UndefOr[FindingAggregatorList] = js.undefined
  
  /**
    * If there are more results, this is the token to provide in the next call to ListFindingAggregators. This operation currently only returns a single result. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
}
object ListFindingAggregatorsResponse {
  
  inline def apply(): ListFindingAggregatorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingAggregatorsResponse]
  }
  
  extension [Self <: ListFindingAggregatorsResponse](x: Self) {
    
    inline def setFindingAggregators(value: FindingAggregatorList): Self = StObject.set(x, "FindingAggregators", value.asInstanceOf[js.Any])
    
    inline def setFindingAggregatorsUndefined: Self = StObject.set(x, "FindingAggregators", js.undefined)
    
    inline def setFindingAggregatorsVarargs(value: FindingAggregator*): Self = StObject.set(x, "FindingAggregators", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
