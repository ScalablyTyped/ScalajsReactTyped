package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm2017SrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distEsm2017SrcModelUserMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcCoreUserReloadMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/user/reload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reload(user: User): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def reloadWithoutSaving(user: UserInternal): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_reloadWithoutSaving")(user.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
