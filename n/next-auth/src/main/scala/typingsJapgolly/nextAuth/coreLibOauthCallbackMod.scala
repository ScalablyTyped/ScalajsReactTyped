package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.anon.Body
import typingsJapgolly.nextAuth.anon.OAuthProfile
import typingsJapgolly.nextAuth.coreTypesMod.Profile
import typingsJapgolly.nextAuth.providersOauthMod.OAuthConfig
import typingsJapgolly.nextAuth.utilsLoggerMod.LoggerInstance
import typingsJapgolly.openidClient.mod.TokenSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibOauthCallbackMod {
  
  @JSImport("next-auth/core/lib/oauth/callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: Body): js.Promise[OAuthProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OAuthProfile]]
  
  trait GetProfileParams extends StObject {
    
    var logger: LoggerInstance
    
    var profile: Profile
    
    var provider: OAuthConfig[Any]
    
    var tokens: TokenSet
  }
  object GetProfileParams {
    
    inline def apply(logger: LoggerInstance, profile: Profile, provider: OAuthConfig[Any], tokens: TokenSet): GetProfileParams = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProfileParams]
    }
    
    extension [Self <: GetProfileParams](x: Self) {
      
      inline def setLogger(value: LoggerInstance): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: OAuthConfig[Any]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: TokenSet): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
}
