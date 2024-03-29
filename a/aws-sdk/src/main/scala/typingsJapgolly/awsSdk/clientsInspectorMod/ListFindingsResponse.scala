package typingsJapgolly.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFindingsResponse extends StObject {
  
  /**
    * A list of ARNs that specifies the findings returned by the action.
    */
  var findingArns: ListReturnedArnList
  
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListFindingsResponse {
  
  inline def apply(findingArns: ListReturnedArnList): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(findingArns = findingArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsResponse]
  }
  
  extension [Self <: ListFindingsResponse](x: Self) {
    
    inline def setFindingArns(value: ListReturnedArnList): Self = StObject.set(x, "findingArns", value.asInstanceOf[js.Any])
    
    inline def setFindingArnsVarargs(value: Arn*): Self = StObject.set(x, "findingArns", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
