package typingsJapgolly.firebaseAuth.internalMod

import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.UserCredential
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/internal", "OAuthProvider")
@js.native
open class OAuthProvider protected ()
  extends typingsJapgolly.firebaseAuth.distInternalMod.OAuthProvider {
  /**
    * Constructor for generic OAuth providers.
    *
    * @param providerId - Provider for which credentials should be generated.
    */
  def this(providerId: String) = this()
}
/* static members */
object OAuthProvider {
  
  @JSImport("@firebase/auth/internal", "OAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
    * thrown during a sign-in, link, or reauthenticate operation.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  
  inline def credentialFromJSON(json: String): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
  /**
    * Creates an {@link OAuthCredential} from a JSON string or a plain object.
    * @param json - A plain object or a JSON string
    */
  inline def credentialFromJSON(json: js.Object): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  
  @JSImport("@firebase/auth/internal", "OAuthProvider.oauthCredentialFromTaggedObject")
  @js.native
  def oauthCredentialFromTaggedObject: Any = js.native
  inline def oauthCredentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oauthCredentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
