package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseInstallations.distEsmSrcInterfacesPublicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcApiGetInstallationsMod {
  
  @JSImport("@firebase/installations/dist/esm/src/api/get-installations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstallations(): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")().asInstanceOf[Installations]
  inline def getInstallations(app: FirebaseApp): Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")(app.asInstanceOf[js.Any]).asInstanceOf[Installations]
}
