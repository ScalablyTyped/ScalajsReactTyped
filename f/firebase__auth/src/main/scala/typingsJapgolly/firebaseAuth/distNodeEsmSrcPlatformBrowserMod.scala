package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.Auth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcPlatformBrowserMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/platform_browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAuth(): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")().asInstanceOf[Auth]
  inline def getAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
}
