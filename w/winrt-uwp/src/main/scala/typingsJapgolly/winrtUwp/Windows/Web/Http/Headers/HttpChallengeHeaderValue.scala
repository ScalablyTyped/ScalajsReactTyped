package typingsJapgolly.winrtUwp.Windows.Web.Http.Headers

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents authentication information used in the Proxy-Authenticate and WWW-Authenticate HTTP header values. */
trait HttpChallengeHeaderValue extends StObject {
  
  /** Gets the credentials that contain the authentication information of the user agent for the resource being requested. */
  var parameters: IVector[HttpNameValueHeaderValue]
  
  /** Gets the scheme to use for authentication. */
  var scheme: String
  
  /** The SPNEGO token to use with the Negotiate protocol scheme. */
  var token: String
}
object HttpChallengeHeaderValue {
  
  inline def apply(parameters: IVector[HttpNameValueHeaderValue], scheme: String, token: String): HttpChallengeHeaderValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpChallengeHeaderValue]
  }
  
  extension [Self <: HttpChallengeHeaderValue](x: Self) {
    
    inline def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
