package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.Slashv1Slashtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiAuthenticationTokenMod {
  
  @JSImport("@firebase/auth/dist/src/api/authentication/token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requestStsToken(auth: Auth, refreshToken: String): js.Promise[RequestStsTokenResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestStsToken")(auth.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RequestStsTokenResponse]]
  
  object Endpoint {
    
    inline def TOKEN: Slashv1Slashtoken = "/v1/token".asInstanceOf[Slashv1Slashtoken]
  }
  type Endpoint = Slashv1Slashtoken
  
  trait RequestStsTokenResponse extends StObject {
    
    var accessToken: String
    
    var expiresIn: String
    
    var refreshToken: String
  }
  object RequestStsTokenResponse {
    
    inline def apply(accessToken: String, expiresIn: String, refreshToken: String): RequestStsTokenResponse = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestStsTokenResponse]
    }
    
    extension [Self <: RequestStsTokenResponse](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
}
