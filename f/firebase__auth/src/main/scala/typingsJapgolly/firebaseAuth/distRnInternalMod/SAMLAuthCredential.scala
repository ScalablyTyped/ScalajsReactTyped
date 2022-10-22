package typingsJapgolly.firebaseAuth.distRnInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/rn/internal", "SAMLAuthCredential")
@js.native
/** @internal */
/* private */ open class SAMLAuthCredential ()
  extends typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsSamlMod.SAMLAuthCredential
/* static members */
object SAMLAuthCredential {
  
  @JSImport("@firebase/auth/dist/rn/internal", "SAMLAuthCredential")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper static method to avoid exposing the constructor to end users.
    *
    * @internal
    */
  inline def _create(providerId: String, pendingToken: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsSamlMod.SAMLAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("_create")(providerId.asInstanceOf[js.Any], pendingToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsSamlMod.SAMLAuthCredential]
  
  /**
    * Static method to deserialize a JSON representation of an object into an
    * {@link  AuthCredential}.
    *
    * @param json - Input can be either Object or the stringified representation of the object.
    * When string is provided, JSON.parse would be called first.
    *
    * @returns If the JSON input does not represent an {@link  AuthCredential}, null is returned.
    */
  inline def fromJSON(json: String): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsSamlMod.SAMLAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsSamlMod.SAMLAuthCredential | Null]
  inline def fromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsSamlMod.SAMLAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distRnSrcCoreCredentialsSamlMod.SAMLAuthCredential | Null]
}
