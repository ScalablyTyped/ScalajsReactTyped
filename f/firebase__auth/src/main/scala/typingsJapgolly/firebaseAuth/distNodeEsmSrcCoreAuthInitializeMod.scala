package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAuth.distNodeEsmSrcCoreAuthAuthImplMod.AuthImpl
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.Auth
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.Dependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreAuthInitializeMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/auth/initialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeAuth(app: FirebaseApp): Auth = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
  inline def initializeAuth(app: FirebaseApp, deps: Dependencies): Auth = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAuth")(app.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Auth]
  
  inline def initializeAuthInstance(auth: AuthImpl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_initializeAuthInstance")(auth.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initializeAuthInstance(auth: AuthImpl, deps: Dependencies): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_initializeAuthInstance")(auth.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
