package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestExpIntegrationDottestMod {
  
  @JSImport("@firebase/database/dist/test/exp/integration.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTestApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestApp")().asInstanceOf[FirebaseApp]
}
