package typingsJapgolly.firebaseAuth.distNodeInternalMod

import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.UserCredential
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.githubDotcom
import typingsJapgolly.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/node/internal", "GithubAuthProvider")
@js.native
open class GithubAuthProvider ()
  extends typingsJapgolly.firebaseAuth.distNodeMod.GithubAuthProvider
/* static members */
object GithubAuthProvider {
  
  @JSImport("@firebase/auth/dist/node/internal", "GithubAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /** Always set to {@link SignInMethod}.GITHUB. */
  @JSImport("@firebase/auth/dist/node/internal", "GithubAuthProvider.GITHUB_SIGN_IN_METHOD")
  @js.native
  val GITHUB_SIGN_IN_METHOD: githubDotcom = js.native
  
  /** Always set to {@link ProviderId}.GITHUB. */
  @JSImport("@firebase/auth/dist/node/internal", "GithubAuthProvider.PROVIDER_ID")
  @js.native
  val PROVIDER_ID: githubDotcom = js.native
  
  /**
    * Creates a credential for Github.
    *
    * @param accessToken - Github access token.
    */
  inline def credential(accessToken: String): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential = ^.asInstanceOf[js.Dynamic].applyDynamic("credential")(accessToken.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link AuthError} which was
    * thrown during a sign-in, link, or reauthenticate operation.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromError(error: FirebaseError): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromError")(error.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  
  /**
    * Used to extract the underlying {@link OAuthCredential} from a {@link UserCredential}.
    *
    * @param userCredential - The user credential.
    */
  inline def credentialFromResult(userCredential: UserCredential): typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("credentialFromResult")(userCredential.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAuth.distNodeSrcCoreCredentialsOauthMod.OAuthCredential | Null]
  
  @JSImport("@firebase/auth/dist/node/internal", "GithubAuthProvider.credentialFromTaggedObject")
  @js.native
  def credentialFromTaggedObject: Any = js.native
  inline def credentialFromTaggedObject_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("credentialFromTaggedObject")(x.asInstanceOf[js.Any])
}
