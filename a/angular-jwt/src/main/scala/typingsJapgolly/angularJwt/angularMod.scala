package typingsJapgolly.angularJwt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object jwt {
    
    trait IAuthManagerServiceProvider extends StObject {
      
      def authenticate(): Unit
      
      def checkAuthOnRefresh(): Unit
      
      def redirectWhenUnauthenticated(): Unit
      
      def unauthenticate(): Unit
    }
    object IAuthManagerServiceProvider {
      
      inline def apply(
        authenticate: Callback,
        checkAuthOnRefresh: Callback,
        redirectWhenUnauthenticated: Callback,
        unauthenticate: Callback
      ): IAuthManagerServiceProvider = {
        val __obj = js.Dynamic.literal(authenticate = authenticate.toJsFn, checkAuthOnRefresh = checkAuthOnRefresh.toJsFn, redirectWhenUnauthenticated = redirectWhenUnauthenticated.toJsFn, unauthenticate = unauthenticate.toJsFn)
        __obj.asInstanceOf[IAuthManagerServiceProvider]
      }
      
      extension [Self <: IAuthManagerServiceProvider](x: Self) {
        
        inline def setAuthenticate(value: Callback): Self = StObject.set(x, "authenticate", value.toJsFn)
        
        inline def setCheckAuthOnRefresh(value: Callback): Self = StObject.set(x, "checkAuthOnRefresh", value.toJsFn)
        
        inline def setRedirectWhenUnauthenticated(value: Callback): Self = StObject.set(x, "redirectWhenUnauthenticated", value.toJsFn)
        
        inline def setUnauthenticate(value: Callback): Self = StObject.set(x, "unauthenticate", value.toJsFn)
      }
    }
    
    @js.native
    trait IJwtHelper extends StObject {
      
      def decodeToken(token: String): JwtToken = js.native
      
      def getTokenExpirationDate(token: Any): js.Date = js.native
      
      def isTokenExpired(token: Any): Boolean = js.native
      def isTokenExpired(token: Any, offsetSeconds: Double): Boolean = js.native
    }
    
    trait IJwtInterceptor extends StObject {
      
      def tokenGetter(params: Any*): String
    }
    object IJwtInterceptor {
      
      inline def apply(tokenGetter: /* repeated */ Any => String): IJwtInterceptor = {
        val __obj = js.Dynamic.literal(tokenGetter = js.Any.fromFunction1(tokenGetter))
        __obj.asInstanceOf[IJwtInterceptor]
      }
      
      extension [Self <: IJwtInterceptor](x: Self) {
        
        inline def setTokenGetter(value: /* repeated */ Any => String): Self = StObject.set(x, "tokenGetter", js.Any.fromFunction1(value))
      }
    }
    
    trait JwtToken extends StObject {
      
      var aud: js.UndefOr[String] = js.undefined
      
      var exp: js.UndefOr[Double] = js.undefined
      
      var iat: js.UndefOr[Double] = js.undefined
      
      var iss: js.UndefOr[String] = js.undefined
      
      var jti: js.UndefOr[String] = js.undefined
      
      var nbf: js.UndefOr[Double] = js.undefined
      
      var sub: js.UndefOr[String] = js.undefined
      
      var unique_name: js.UndefOr[String] = js.undefined
    }
    object JwtToken {
      
      inline def apply(): JwtToken = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JwtToken]
      }
      
      extension [Self <: JwtToken](x: Self) {
        
        inline def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
        
        inline def setAudUndefined: Self = StObject.set(x, "aud", js.undefined)
        
        inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
        
        inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
        
        inline def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
        
        inline def setIatUndefined: Self = StObject.set(x, "iat", js.undefined)
        
        inline def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
        
        inline def setIssUndefined: Self = StObject.set(x, "iss", js.undefined)
        
        inline def setJti(value: String): Self = StObject.set(x, "jti", value.asInstanceOf[js.Any])
        
        inline def setJtiUndefined: Self = StObject.set(x, "jti", js.undefined)
        
        inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
        
        inline def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
        
        inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
        
        inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
        
        inline def setUnique_nameUndefined: Self = StObject.set(x, "unique_name", js.undefined)
      }
    }
  }
}
