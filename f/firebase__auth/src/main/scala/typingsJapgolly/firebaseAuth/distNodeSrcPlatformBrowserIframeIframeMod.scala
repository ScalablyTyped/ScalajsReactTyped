package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.gapi.iframes.Iframe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSrcPlatformBrowserIframeIframeMod {
  
  @JSImport("@firebase/auth/dist/node/src/platform_browser/iframe/iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def openIframe(auth: AuthInternal): js.Promise[Iframe] = ^.asInstanceOf[js.Dynamic].applyDynamic("_openIframe")(auth.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Iframe]]
}
