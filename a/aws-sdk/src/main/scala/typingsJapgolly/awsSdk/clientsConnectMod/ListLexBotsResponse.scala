package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLexBotsResponse extends StObject {
  
  /**
    * The names and Regions of the Amazon Lex bots associated with the specified instance.
    */
  var LexBots: js.UndefOr[LexBotsList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListLexBotsResponse {
  
  inline def apply(): ListLexBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexBotsResponse]
  }
  
  extension [Self <: ListLexBotsResponse](x: Self) {
    
    inline def setLexBots(value: LexBotsList): Self = StObject.set(x, "LexBots", value.asInstanceOf[js.Any])
    
    inline def setLexBotsUndefined: Self = StObject.set(x, "LexBots", js.undefined)
    
    inline def setLexBotsVarargs(value: LexBot*): Self = StObject.set(x, "LexBots", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
