package typingsJapgolly.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthProfile extends StObject {
  
  var OAuthProfile: js.UndefOr[typingsJapgolly.nextAuth.coreTypesMod.Profile] = js.undefined
  
  var account: js.UndefOr[Accesstoken] = js.undefined
  
  var cookies: js.Array[typingsJapgolly.nextAuth.coreLibCookieMod.Cookie]
  
  var profile: js.UndefOr[typingsJapgolly.nextAuth.coreTypesMod.User] = js.undefined
}
object OAuthProfile {
  
  inline def apply(cookies: js.Array[typingsJapgolly.nextAuth.coreLibCookieMod.Cookie]): OAuthProfile = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthProfile]
  }
  
  extension [Self <: OAuthProfile](x: Self) {
    
    inline def setAccount(value: Accesstoken): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setCookies(value: js.Array[typingsJapgolly.nextAuth.coreLibCookieMod.Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesVarargs(value: typingsJapgolly.nextAuth.coreLibCookieMod.Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
    
    inline def setOAuthProfile(value: typingsJapgolly.nextAuth.coreTypesMod.Profile): Self = StObject.set(x, "OAuthProfile", value.asInstanceOf[js.Any])
    
    inline def setOAuthProfileUndefined: Self = StObject.set(x, "OAuthProfile", js.undefined)
    
    inline def setProfile(value: typingsJapgolly.nextAuth.coreTypesMod.User): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
  }
}
