package typingsJapgolly.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudStorageSink extends StObject {
  
  /** Output only. The exported files in Cloud Storage. */
  var files: js.UndefOr[js.Array[CloudStorageFile]] = js.undefined
}
object CloudStorageSink {
  
  inline def apply(): CloudStorageSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudStorageSink]
  }
  
  extension [Self <: CloudStorageSink](x: Self) {
    
    inline def setFiles(value: js.Array[CloudStorageFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: CloudStorageFile*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
