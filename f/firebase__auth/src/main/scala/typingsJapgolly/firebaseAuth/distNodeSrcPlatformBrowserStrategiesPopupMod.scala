package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcCoreUtilDelayMod.Delay
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.PopupRedirectResolver
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.User
import typingsJapgolly.firebaseAuth.distNodeSrcModelPublicTypesMod.UserCredential
import typingsJapgolly.firebaseAuth.firebaseAuthInts.`2000`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcPlatformBrowserStrategiesPopupMod {
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/strategies/popup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/strategies/popup", "_POLL_WINDOW_CLOSE_TIMEOUT")
  @js.native
  val _POLL_WINDOW_CLOSE_TIMEOUT: Delay = js.native
  
  inline def linkWithPopup(user: User, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def linkWithPopup(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def reauthenticateWithPopup(user: User, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def reauthenticateWithPopup(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithPopup")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  inline def signInWithPopup(auth: Auth, provider: AuthProvider): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPopup")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  inline def signInWithPopup(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[UserCredential] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithPopup")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserCredential]]
  
  object Timeout {
    
    inline def AUTH_EVENT: `2000` = 2000.asInstanceOf[`2000`]
  }
  type Timeout = `2000`
}
