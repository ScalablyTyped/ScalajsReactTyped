package typingsJapgolly.firebaseAuth.mod

import typingsJapgolly.firebaseAuth.firebaseAuthStrings.emailLink
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth", "EmailAuthProvider")
@js.native
open class EmailAuthProvider ()
  extends StObject
     with AuthProvider {
  
  /**
    * Provider for which credentials can be constructed.
    */
  /* CompleteClass */
  override val providerId: String = js.native
  /**
    * Always set to {@link ProviderId}.PASSWORD, even for email link.
    */
  @JSName("providerId")
  val providerId_EmailAuthProvider: password = js.native
}
/* static members */
object EmailAuthProvider {
  
  @JSImport("@firebase/auth", "EmailAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Always set to {@link SignInMethod}.EMAIL_LINK.
    */
  @JSImport("@firebase/auth", "EmailAuthProvider.EMAIL_LINK_SIGN_IN_METHOD")
  @js.native
  val EMAIL_LINK_SIGN_IN_METHOD: emailLink = js.native
  
  /**
    * Always set to {@link SignInMethod}.EMAIL_PASSWORD.
    */
  @JSImport("@firebase/auth", "EmailAuthProvider.EMAIL_PASSWORD_SIGN_IN_METHOD")
  @js.native
  val EMAIL_PASSWORD_SIGN_IN_METHOD: password = js.native
  
  /**
    * Always set to {@link ProviderId}.PASSWORD, even for email link.
    */
  @JSImport("@firebase/auth", "EmailAuthProvider.PROVIDER_ID")
  @js.native
  val PROVIDER_ID: password = js.native
  
  /**
    * Initialize an {@link AuthCredential} using an email and password.
    *
    * @example
    * ```javascript
    * const authCredential = EmailAuthProvider.credential(email, password);
    * const userCredential = await signInWithCredential(auth, authCredential);
    * ```
    *
    * @example
    * ```javascript
    * const userCredential = await signInWithEmailAndPassword(auth, email, password);
    * ```
    *
    * @param email - Email address.
    * @param password - User account password.
    * @returns The auth provider credential.
    */
  inline def credential(email: String, password: String): EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credential")(email.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[EmailAuthCredential]
  
  /**
    * Initialize an {@link AuthCredential} using an email and an email link after a sign in with
    * email link operation.
    *
    * @example
    * ```javascript
    * const authCredential = EmailAuthProvider.credentialWithLink(auth, email, emailLink);
    * const userCredential = await signInWithCredential(auth, authCredential);
    * ```
    *
    * @example
    * ```javascript
    * await sendSignInLinkToEmail(auth, email);
    * // Obtain emailLink from user.
    * const userCredential = await signInWithEmailLink(auth, email, emailLink);
    * ```
    *
    * @param auth - The {@link Auth} instance used to verify the link.
    * @param email - Email address.
    * @param emailLink - Sign-in email link.
    * @returns - The auth provider credential.
    */
  inline def credentialWithLink(email: String, emailLink: String): EmailAuthCredential = (^.asInstanceOf[js.Dynamic].applyDynamic("credentialWithLink")(email.asInstanceOf[js.Any], emailLink.asInstanceOf[js.Any])).asInstanceOf[EmailAuthCredential]
}
