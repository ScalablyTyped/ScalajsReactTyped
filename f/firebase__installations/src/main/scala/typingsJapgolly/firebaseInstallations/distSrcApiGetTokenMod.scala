package typingsJapgolly.firebaseInstallations

import typingsJapgolly.firebaseInstallations.distSrcInterfacesPublicTypesMod.Installations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiGetTokenMod {
  
  @JSImport("@firebase/installations/dist/src/api/get-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getToken(installations: Installations): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(installations.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getToken(installations: Installations, forceRefresh: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(installations.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
