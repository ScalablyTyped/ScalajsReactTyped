package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntentVersionsResponse extends StObject {
  
  /**
    * An array of IntentMetadata objects, one for each numbered version of the intent plus one for the $LATEST version.
    */
  var intents: js.UndefOr[IntentMetadataList] = js.undefined
  
  /**
    * A pagination token for fetching the next page of intent versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetIntentVersionsResponse {
  
  inline def apply(): GetIntentVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntentVersionsResponse]
  }
  
  extension [Self <: GetIntentVersionsResponse](x: Self) {
    
    inline def setIntents(value: IntentMetadataList): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: IntentMetadata*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
