package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object storageMod {
  
  @JSImport("firebase-admin/storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/storage", "Storage")
  @js.native
  open class Storage ()
    extends typingsJapgolly.firebaseAdmin.libStorageMod.Storage
  
  inline def getStorage(): typingsJapgolly.firebaseAdmin.libStorageStorageMod.Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")().asInstanceOf[typingsJapgolly.firebaseAdmin.libStorageStorageMod.Storage]
  inline def getStorage(app: App): typingsJapgolly.firebaseAdmin.libStorageStorageMod.Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libStorageStorageMod.Storage]
}
