package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm2017SrcModelUserMod.UserInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm2017SrcCoreUserInvalidationMod {
  
  @JSImport("@firebase/auth/dist/esm2017/src/core/user/invalidation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logoutIfInvalidated[T](user: UserInternal, promise: js.Promise[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_logoutIfInvalidated")(user.asInstanceOf[js.Any], promise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def logoutIfInvalidated[T](user: UserInternal, promise: js.Promise[T], bypassAuthState: Boolean): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_logoutIfInvalidated")(user.asInstanceOf[js.Any], promise.asInstanceOf[js.Any], bypassAuthState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
