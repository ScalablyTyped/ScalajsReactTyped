package typingsJapgolly.firebaseAuthCompat

import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.ConfirmationResult
import typingsJapgolly.firebaseAuth.distSrcModelPublicTypesMod.UserCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAuthCompatSrcUserCredentialMod {
  
  @JSImport("@firebase/auth-compat/dist/auth-compat/src/user_credential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertConfirmationResult(auth: Auth, confirmationResultPromise: js.Promise[ConfirmationResult]): js.Promise[typingsJapgolly.firebaseAuthTypes.mod.ConfirmationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertConfirmationResult")(auth.asInstanceOf[js.Any], confirmationResultPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseAuthTypes.mod.ConfirmationResult]]
  
  inline def convertCredential(auth: Auth, credentialPromise: js.Promise[UserCredential]): js.Promise[typingsJapgolly.firebaseAuthTypes.mod.UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertCredential")(auth.asInstanceOf[js.Any], credentialPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseAuthTypes.mod.UserCredential]]
}
