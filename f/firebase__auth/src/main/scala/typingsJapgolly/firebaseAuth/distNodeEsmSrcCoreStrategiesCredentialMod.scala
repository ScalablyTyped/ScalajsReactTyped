package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreCredentialsMod.AuthCredential
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreStrategiesCredentialMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/strategies/credential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _signInWithCredential(auth: AuthInternal, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("_signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def _signInWithCredential(auth: AuthInternal, credential: AuthCredential, bypassAuthState: Boolean): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("_signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def linkWithCredential(user: User, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithCredential(user: User, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithCredential")(user.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithCredential(auth: Auth, credential: AuthCredential): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithCredential")(auth.asInstanceOf[js.Any], credential.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
}
