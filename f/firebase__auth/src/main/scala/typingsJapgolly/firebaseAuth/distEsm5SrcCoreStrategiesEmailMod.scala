package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.ActionCodeSettings
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreStrategiesEmailMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/strategies/email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchSignInMethodsForEmail(auth: Auth, email: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchSignInMethodsForEmail")(auth.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def sendEmailVerification(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def sendEmailVerification(user: User, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEmailVerification")(user.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def verifyBeforeUpdateEmail(user: User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def verifyBeforeUpdateEmail(user: User, newEmail: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyBeforeUpdateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any], actionCodeSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
