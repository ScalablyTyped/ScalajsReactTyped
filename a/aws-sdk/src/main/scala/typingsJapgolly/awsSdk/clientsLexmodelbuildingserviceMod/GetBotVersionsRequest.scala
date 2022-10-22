package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotVersionsRequest extends StObject {
  
  /**
    * The maximum number of bot versions to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The name of the bot for which versions should be returned.
    */
  var name: BotName
  
  /**
    * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBotVersionsRequest {
  
  inline def apply(name: BotName): GetBotVersionsRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotVersionsRequest]
  }
  
  extension [Self <: GetBotVersionsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
