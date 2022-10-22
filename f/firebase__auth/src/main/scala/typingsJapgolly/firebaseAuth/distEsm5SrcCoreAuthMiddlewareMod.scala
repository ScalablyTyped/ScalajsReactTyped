package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm5SrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distEsm5SrcModelPublicTypesMod.User
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcCoreAuthMiddlewareMod {
  
  @JSImport("@firebase/auth/dist/esm5/src/core/auth/middleware", "AuthMiddlewareQueue")
  @js.native
  open class AuthMiddlewareQueue protected () extends StObject {
    def this(auth: AuthInternal) = this()
    
    /* private */ val auth: Any = js.native
    
    def pushCallback(callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]]): Unsubscribe = js.native
    def pushCallback(
      callback: js.Function1[/* user */ User | Null, Unit | js.Promise[Unit]],
      onAbort: js.Function0[Unit]
    ): Unsubscribe = js.native
    
    /* private */ val queue: Any = js.native
    
    def runMiddleware(): js.Promise[Unit] = js.native
    def runMiddleware(nextUser: User): js.Promise[Unit] = js.native
  }
}
