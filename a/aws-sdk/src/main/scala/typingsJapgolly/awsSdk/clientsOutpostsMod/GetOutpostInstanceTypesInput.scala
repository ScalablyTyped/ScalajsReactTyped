package typingsJapgolly.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOutpostInstanceTypesInput extends StObject {
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost. 
    */
  var OutpostId: typingsJapgolly.awsSdk.clientsOutpostsMod.OutpostId
}
object GetOutpostInstanceTypesInput {
  
  inline def apply(OutpostId: OutpostId): GetOutpostInstanceTypesInput = {
    val __obj = js.Dynamic.literal(OutpostId = OutpostId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInstanceTypesInput]
  }
  
  extension [Self <: GetOutpostInstanceTypesInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
  }
}
