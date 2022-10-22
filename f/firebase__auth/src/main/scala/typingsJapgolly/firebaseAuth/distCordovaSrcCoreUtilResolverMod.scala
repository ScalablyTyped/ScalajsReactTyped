package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distCordovaSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distCordovaSrcModelPopupRedirectMod.PopupRedirectResolverInternal
import typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.PopupRedirectResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcCoreUtilResolverMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/util/resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDefaultResolver(auth: AuthInternal): PopupRedirectResolverInternal = ^.asInstanceOf[js.Dynamic].applyDynamic("_withDefaultResolver")(auth.asInstanceOf[js.Any]).asInstanceOf[PopupRedirectResolverInternal]
  inline def withDefaultResolver(auth: AuthInternal, resolverOverride: PopupRedirectResolver): PopupRedirectResolverInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("_withDefaultResolver")(auth.asInstanceOf[js.Any], resolverOverride.asInstanceOf[js.Any])).asInstanceOf[PopupRedirectResolverInternal]
}
