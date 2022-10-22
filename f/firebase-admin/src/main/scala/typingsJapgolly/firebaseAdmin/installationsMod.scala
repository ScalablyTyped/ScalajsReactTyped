package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object installationsMod {
  
  @JSImport("firebase-admin/installations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/installations", "Installations")
  @js.native
  open class Installations ()
    extends typingsJapgolly.firebaseAdmin.libInstallationsMod.Installations
  
  inline def getInstallations(): typingsJapgolly.firebaseAdmin.libInstallationsInstallationsMod.Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")().asInstanceOf[typingsJapgolly.firebaseAdmin.libInstallationsInstallationsMod.Installations]
  inline def getInstallations(app: App): typingsJapgolly.firebaseAdmin.libInstallationsInstallationsMod.Installations = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstallations")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libInstallationsInstallationsMod.Installations]
}
