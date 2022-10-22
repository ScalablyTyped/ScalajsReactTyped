package typingsJapgolly.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListElasticsearchVersionsRequest extends StObject {
  
  /**
    *  Set this value to limit the number of results returned. Value provided must be greater than 10 else it wont be honored. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.NextToken] = js.undefined
}
object ListElasticsearchVersionsRequest {
  
  inline def apply(): ListElasticsearchVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElasticsearchVersionsRequest]
  }
  
  extension [Self <: ListElasticsearchVersionsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
