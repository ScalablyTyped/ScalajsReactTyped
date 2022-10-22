package typingsJapgolly.request.mod

import typingsJapgolly.request.requestBooleans.`true`
import typingsJapgolly.request.requestStrings.body
import typingsJapgolly.request.requestStrings.header
import typingsJapgolly.request.requestStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthOptions extends StObject {
  
  var body_hash: js.UndefOr[`true` | String] = js.undefined
  
  var callback: js.UndefOr[String] = js.undefined
  
  var consumer_key: js.UndefOr[String] = js.undefined
  
  var consumer_secret: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var token_secret: js.UndefOr[String] = js.undefined
  
  var transport_method: js.UndefOr[body | header | query] = js.undefined
  
  var verifier: js.UndefOr[String] = js.undefined
}
object OAuthOptions {
  
  inline def apply(): OAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthOptions]
  }
  
  extension [Self <: OAuthOptions](x: Self) {
    
    inline def setBody_hash(value: `true` | String): Self = StObject.set(x, "body_hash", value.asInstanceOf[js.Any])
    
    inline def setBody_hashUndefined: Self = StObject.set(x, "body_hash", js.undefined)
    
    inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
    
    inline def setConsumer_keyUndefined: Self = StObject.set(x, "consumer_key", js.undefined)
    
    inline def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
    
    inline def setConsumer_secretUndefined: Self = StObject.set(x, "consumer_secret", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setToken_secret(value: String): Self = StObject.set(x, "token_secret", value.asInstanceOf[js.Any])
    
    inline def setToken_secretUndefined: Self = StObject.set(x, "token_secret", js.undefined)
    
    inline def setTransport_method(value: body | header | query): Self = StObject.set(x, "transport_method", value.asInstanceOf[js.Any])
    
    inline def setTransport_methodUndefined: Self = StObject.set(x, "transport_method", js.undefined)
    
    inline def setVerifier(value: String): Self = StObject.set(x, "verifier", value.asInstanceOf[js.Any])
    
    inline def setVerifierUndefined: Self = StObject.set(x, "verifier", js.undefined)
  }
}
