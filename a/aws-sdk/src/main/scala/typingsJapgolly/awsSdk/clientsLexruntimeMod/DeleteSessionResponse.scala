package typingsJapgolly.awsSdk.clientsLexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSessionResponse extends StObject {
  
  /**
    * The alias in use for the bot associated with the session data.
    */
  var botAlias: js.UndefOr[BotAlias] = js.undefined
  
  /**
    * The name of the bot associated with the session data.
    */
  var botName: js.UndefOr[BotName] = js.undefined
  
  /**
    * The unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the client application user.
    */
  var userId: js.UndefOr[UserId] = js.undefined
}
object DeleteSessionResponse {
  
  inline def apply(): DeleteSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSessionResponse]
  }
  
  extension [Self <: DeleteSessionResponse](x: Self) {
    
    inline def setBotAlias(value: BotAlias): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    inline def setBotAliasUndefined: Self = StObject.set(x, "botAlias", js.undefined)
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
