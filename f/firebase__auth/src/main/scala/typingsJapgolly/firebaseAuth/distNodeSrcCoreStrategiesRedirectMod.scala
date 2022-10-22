package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcCoreStrategiesAbstractPopupRedirectOperationMod.AbstractPopupRedirectOperation
import typingsJapgolly.firebaseAuth.distNodeSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distNodeSrcModelPopupRedirectMod.PopupRedirectResolverInternal
import typingsJapgolly.firebaseAuth.distNodeSrcModelUserMod.UserCredentialInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcCoreStrategiesRedirectMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/strategies/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/node/src/core/strategies/redirect", "RedirectAction")
  @js.native
  open class RedirectAction protected () extends AbstractPopupRedirectOperation {
    def this(auth: AuthInternal, resolver: PopupRedirectResolverInternal) = this()
    def this(auth: AuthInternal, resolver: PopupRedirectResolverInternal, bypassAuthState: Boolean) = this()
    
    @JSName("eventId")
    var eventId_RedirectAction: Null = js.native
  }
  
  inline def clearRedirectOutcomes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_clearRedirectOutcomes")().asInstanceOf[Unit]
  
  inline def getAndClearPendingRedirectStatus(resolver: PopupRedirectResolverInternal, auth: AuthInternal): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getAndClearPendingRedirectStatus")(resolver.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def overrideRedirectResult(auth: AuthInternal, result: js.Function0[js.Promise[UserCredentialInternal | Null]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_overrideRedirectResult")(auth.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPendingRedirectStatus(resolver: PopupRedirectResolverInternal, auth: AuthInternal): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("_setPendingRedirectStatus")(resolver.asInstanceOf[js.Any], auth.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
