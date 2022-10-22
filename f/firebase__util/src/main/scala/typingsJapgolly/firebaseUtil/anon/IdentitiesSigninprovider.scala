package typingsJapgolly.firebaseUtil.anon

import typingsJapgolly.firebaseUtil.distSrcEmulatorMod.FirebaseSignInProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitiesSigninprovider extends StObject {
  
  var identities: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ provider in @firebase/util.@firebase/util/dist/src/emulator.FirebaseSignInProvider ]:? std.Array<string>} */ js.Any
  ] = js.undefined
  
  var sign_in_provider: FirebaseSignInProvider
}
object IdentitiesSigninprovider {
  
  inline def apply(sign_in_provider: FirebaseSignInProvider): IdentitiesSigninprovider = {
    val __obj = js.Dynamic.literal(sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitiesSigninprovider]
  }
  
  extension [Self <: IdentitiesSigninprovider](x: Self) {
    
    inline def setIdentities(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ provider in @firebase/util.@firebase/util/dist/src/emulator.FirebaseSignInProvider ]:? std.Array<string>} */ js.Any
    ): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setSign_in_provider(value: FirebaseSignInProvider): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
  }
}
