package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.anon.DisplayName
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreUserAccountInfoMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/user/account_info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateEmail(user: User, newEmail: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEmail")(user.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updatePassword(user: User, newPassword: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePassword")(user.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def updateProfile(user: User, hasDisplayNamePhotoUrl: DisplayName): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProfile")(user.asInstanceOf[js.Any], hasDisplayNamePhotoUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
