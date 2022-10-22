package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStorageStorageNamespaceMod {
  
  object storage {
    
    inline def apply(): Storage = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Storage]
    inline def apply(app: App): Storage = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Storage]
    
    @JSImport("firebase-admin/lib/storage/storage-namespace", "storage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.storage#Storage}.
      */
    type Storage = typingsJapgolly.firebaseAdmin.libStorageStorageMod.Storage
  }
}
