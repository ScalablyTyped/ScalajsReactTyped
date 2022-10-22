package typingsJapgolly.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTokenResponse extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[string] = js.undefined
  
  /**
    * One-time challenge code for authenticating into the Amplify Admin UI.
    */
  var ChallengeCode: js.UndefOr[string] = js.undefined
  
  /**
    * A unique ID provided when creating a new challenge token.
    */
  var SessionId: js.UndefOr[string] = js.undefined
  
  /**
    * The expiry time for the one-time generated token code.
    */
  var Ttl: js.UndefOr[string] = js.undefined
}
object CreateTokenResponse {
  
  inline def apply(): CreateTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTokenResponse]
  }
  
  extension [Self <: CreateTokenResponse](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    inline def setChallengeCode(value: string): Self = StObject.set(x, "ChallengeCode", value.asInstanceOf[js.Any])
    
    inline def setChallengeCodeUndefined: Self = StObject.set(x, "ChallengeCode", js.undefined)
    
    inline def setSessionId(value: string): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setTtl(value: string): Self = StObject.set(x, "Ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "Ttl", js.undefined)
  }
}
