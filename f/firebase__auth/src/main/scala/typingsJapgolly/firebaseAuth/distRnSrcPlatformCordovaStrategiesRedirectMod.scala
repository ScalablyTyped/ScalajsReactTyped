package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.PopupRedirectResolver
import typingsJapgolly.firebaseAuth.distRnSrcModelPublicTypesMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRnSrcPlatformCordovaStrategiesRedirectMod {
  
  @JSImport("@firebase/auth/dist/rn/src/platform_cordova/strategies/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linkWithRedirect(user: User, provider: AuthProvider): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def linkWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def reauthenticateWithRedirect(user: User, provider: AuthProvider): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reauthenticateWithRedirect(user: User, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reauthenticateWithRedirect")(user.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def signInWithRedirect(auth: Auth, provider: AuthProvider): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def signInWithRedirect(auth: Auth, provider: AuthProvider, resolver: PopupRedirectResolver): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("signInWithRedirect")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
