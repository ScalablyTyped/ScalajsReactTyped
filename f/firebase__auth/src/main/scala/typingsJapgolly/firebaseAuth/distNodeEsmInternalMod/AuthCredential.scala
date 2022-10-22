package typingsJapgolly.firebaseAuth.distNodeEsmInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/node-esm/internal", "AuthCredential")
@js.native
open class AuthCredential protected ()
  extends typingsJapgolly.firebaseAuth.distNodeEsmMod.AuthCredential {
  /** @internal */
  /* protected */ def this(
    /**
    * The authentication provider ID for the credential.
    *
    * @remarks
    * For example, 'facebook.com', or 'google.com'.
    */
  providerId: String,
    /**
    * The authentication sign in method for the credential.
    *
    * @remarks
    * For example, {@link SignInMethod}.EMAIL_PASSWORD, or
    * {@link SignInMethod}.EMAIL_LINK. This corresponds to the sign-in method
    * identifier as returned in {@link fetchSignInMethodsForEmail}.
    */
  signInMethod: String
  ) = this()
}
