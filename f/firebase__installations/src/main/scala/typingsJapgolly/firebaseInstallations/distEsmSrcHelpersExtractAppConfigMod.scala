package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesInstallationImplMod.AppConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcHelpersExtractAppConfigMod {
  
  @JSImport("@firebase/installations/dist/esm/src/helpers/extract-app-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractAppConfig(app: FirebaseApp): AppConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAppConfig")(app.asInstanceOf[js.Any]).asInstanceOf[AppConfig]
}
