package typingsJapgolly.nextAuth.anon

import typingsJapgolly.nextAuth.adaptersMod.AdapterUser
import typingsJapgolly.nextAuth.nextAuthStrings.jwt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Profile extends StObject {
  
  var account: typingsJapgolly.nextAuth.coreTypesMod.Account | Null
  
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
  
  var profile: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser | Email
  
  var sessionToken: js.UndefOr[typingsJapgolly.nextAuth.coreLibCookieMod.SessionToken[jwt]] = js.undefined
}
object Profile {
  
  inline def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any,
    profile: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser | Email
  ): Profile = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], account = null)
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setAccount(value: typingsJapgolly.nextAuth.coreTypesMod.Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountNull: Self = StObject.set(x, "account", null)
    
    inline def setOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalOptions */ Any
    ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: typingsJapgolly.nextAuth.coreTypesMod.User | AdapterUser | Email): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setSessionToken(value: typingsJapgolly.nextAuth.coreLibCookieMod.SessionToken[jwt]): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
