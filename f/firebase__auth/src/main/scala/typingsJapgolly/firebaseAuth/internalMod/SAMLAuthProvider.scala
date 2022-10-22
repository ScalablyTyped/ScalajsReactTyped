package typingsJapgolly.firebaseAuth.internalMod

import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.UserCredential
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/internal", "SAMLAuthProvider")
@js.native
open class SAMLAuthProvider protected ()
  extends typingsJapgolly.firebaseAuth.distInternalMod.SAMLAuthProvider {
  /**
    * Constructor. The providerId must start with "saml."
    * @param providerId - SAML provider ID.
    */
  def this(providerId: String) = this()
}
/* static members */
object SAMLAuthProvider {
  
  @JSImport("@firebase/auth/internal", "SAMLAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
    * thrown during a sign-in, link, or reauthenticate operation.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential | Null]
  
  /**
    * Creates an {@link AuthCredential} from a JSON string or a plain object.
    * @param json - A plain object or a JSON string
    */
  inline def credentialFromJSON(json: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential]
  inline def credentialFromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential]
  
  /**
    * Generates an {@link AuthCredential} from a {@link UserCredential} after a
    * successful SAML flow completes.
    *
    * @remarks
    *
    * For example, to get an {@link AuthCredential}, you could write the
    * following code:
    *
    * ```js
    * const userCredential = await signInWithPopup(auth, samlProvider);
    * const credential = SAMLAuthProvider.credentialFromResult(userCredential);
    * ```
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsMod.AuthCredential | Null]
  
  @JSImport("@firebase/auth/internal", "SAMLAuthProvider.samlCredentialFromTaggedObject")
  @js.native
  def samlCredentialFromTaggedObject: Any = js.native
  inline def samlCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("samlCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
