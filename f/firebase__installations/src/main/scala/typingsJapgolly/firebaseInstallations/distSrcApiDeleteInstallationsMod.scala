package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.distSrcInterfacesPublicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiDeleteInstallationsMod {
  
  @JSImport("@firebase/installations/dist/src/api/delete-installations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteInstallations(installations: Installations): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteInstallations")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
