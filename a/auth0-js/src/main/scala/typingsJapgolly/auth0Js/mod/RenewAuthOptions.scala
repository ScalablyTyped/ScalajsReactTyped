package typingsJapgolly.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenewAuthOptions extends StObject {
  
  /**
    * identifier of the resource server who will consume the access token issued after Auth
    */
  var audience: js.UndefOr[String] = js.undefined
  
  /**
    * your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard
    */
  var clientID: js.UndefOr[String] = js.undefined
  
  /**
    * your Auth0 domain
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * value used to mitigate replay attacks when using Implicit Grant.
    * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
    */
  var nonce: js.UndefOr[String] = js.undefined
  
  /**
    * identifier data type to look for in postMessage event data, where events are initiated
    * from silent callback urls, before accepting a message event is the event expected.
    * A value of false means any postMessage event will trigger a callback.
    */
  var postMessageDataType: js.UndefOr[String] = js.undefined
  
  /**
    * origin of redirectUri to expect postMessage response from.
    * Defaults to the origin of the receiving window. Only used if usePostMessage is truthy.
    */
  var postMessageOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * url that the Auth0 will redirect after Auth with the Authorization Response
    */
  var redirectUri: js.UndefOr[String] = js.undefined
  
  /**
    * how the Auth response is encoded and redirected back to the client.
    * Supported values are `query`, `fragment` and `form_post`.
    * The `query` value is only supported when `responseType` is `code`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
    */
  var responseMode: js.UndefOr[String] = js.undefined
  
  /**
    * type of the response used by OAuth 2.0 flow. It can be any space separated
    * list of the values `code`, `token`, `id_token`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html}
    */
  var responseType: js.UndefOr[String] = js.undefined
  
  /**
    * scopes to be requested during Auth. e.g. `openid email`
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * value used to mitigate XSRF attacks.
    * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * value in milliseconds used to timeout when the `/authorize` call is failing
    * as part of the silent authentication with postmessage enabled due to a configuration.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * use postMessage to communicate between the silent callback and the SPA.
    * When false the SDK will attempt to parse the url hash should ignore the url hash
    * and no extra behaviour is needed
    * @default false
    */
  var usePostMessage: js.UndefOr[Boolean] = js.undefined
}
object RenewAuthOptions {
  
  inline def apply(): RenewAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewAuthOptions]
  }
  
  extension [Self <: RenewAuthOptions](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setPostMessageDataType(value: String): Self = StObject.set(x, "postMessageDataType", value.asInstanceOf[js.Any])
    
    inline def setPostMessageDataTypeUndefined: Self = StObject.set(x, "postMessageDataType", js.undefined)
    
    inline def setPostMessageOrigin(value: String): Self = StObject.set(x, "postMessageOrigin", value.asInstanceOf[js.Any])
    
    inline def setPostMessageOriginUndefined: Self = StObject.set(x, "postMessageOrigin", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUsePostMessage(value: Boolean): Self = StObject.set(x, "usePostMessage", value.asInstanceOf[js.Any])
    
    inline def setUsePostMessageUndefined: Self = StObject.set(x, "usePostMessage", js.undefined)
  }
}
