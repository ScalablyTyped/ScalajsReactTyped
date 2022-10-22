package typingsJapgolly.firebaseStorage

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseStorage.distNodeEsmSrcPublicTypesMod.FirebaseStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmTestIntegrationIntegrationDottestMod {
  
  @JSImport("@firebase/storage/dist/node-esm/test/integration/integration.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/test/integration/integration.test", "API_KEY")
  @js.native
  val API_KEY: Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/test/integration/integration.test", "AUTH_DOMAIN")
  @js.native
  val AUTH_DOMAIN: Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/test/integration/integration.test", "PROJECT_ID")
  @js.native
  val PROJECT_ID: Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/test/integration/integration.test", "STORAGE_BUCKET")
  @js.native
  val STORAGE_BUCKET: Any = js.native
  
  inline def createApp(): js.Promise[FirebaseApp] = ^.asInstanceOf[js.Dynamic].applyDynamic("createApp")().asInstanceOf[js.Promise[FirebaseApp]]
  
  inline def createStorage(app: FirebaseApp): FirebaseStorage = ^.asInstanceOf[js.Dynamic].applyDynamic("createStorage")(app.asInstanceOf[js.Any]).asInstanceOf[FirebaseStorage]
}
