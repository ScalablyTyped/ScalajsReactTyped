package typingsJapgolly.firebase.anon

import typingsJapgolly.firebase.compatMod.firebase.FirebaseSignInProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identities extends StObject {
  
  /** A map of providers to the user's list of unique identifiers from each provider */
  var identities: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ provider in firebase.firebase/compat.firebase.FirebaseSignInProvider ]:? std.Array<string>} */ js.Any
  ] = js.undefined
  
  /** The primary sign-in provider */
  var sign_in_provider: FirebaseSignInProvider
}
object Identities {
  
  inline def apply(sign_in_provider: FirebaseSignInProvider): Identities = {
    val __obj = js.Dynamic.literal(sign_in_provider = sign_in_provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identities]
  }
  
  extension [Self <: Identities](x: Self) {
    
    inline def setIdentities(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ provider in firebase.firebase/compat.firebase.FirebaseSignInProvider ]:? std.Array<string>} */ js.Any
    ): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "identities", js.undefined)
    
    inline def setSign_in_provider(value: FirebaseSignInProvider): Self = StObject.set(x, "sign_in_provider", value.asInstanceOf[js.Any])
  }
}
