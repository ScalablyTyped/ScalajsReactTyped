package typingsJapgolly.devtoolsProtocol.mod.Protocol.Network

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CancelAuth
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.Default
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ProvideCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthChallengeResponse extends StObject {
  
  /**
    * The password to provide, possibly empty. Should only be set if response is
    * ProvideCredentials.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The decision on what to do in response to the authorization challenge.  Default means
    * deferring to the default behavior of the net stack, which will likely either the Cancel
    * authentication or display a popup dialog box. (AuthChallengeResponseResponse enum)
    */
  var response: Default | CancelAuth | ProvideCredentials
  
  /**
    * The username to provide, possibly empty. Should only be set if response is
    * ProvideCredentials.
    */
  var username: js.UndefOr[String] = js.undefined
}
object AuthChallengeResponse {
  
  inline def apply(response: Default | CancelAuth | ProvideCredentials): AuthChallengeResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthChallengeResponse]
  }
  
  extension [Self <: AuthChallengeResponse](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setResponse(value: Default | CancelAuth | ProvideCredentials): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
