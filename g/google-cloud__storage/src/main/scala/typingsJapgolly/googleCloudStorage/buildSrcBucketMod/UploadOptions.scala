package typingsJapgolly.googleCloudStorage.buildSrcBucketMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleCloudStorage.buildSrcFileMod.CreateWriteStreamOptions
import typingsJapgolly.googleCloudStorage.buildSrcFileMod.File
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadOptions
  extends StObject
     with CreateWriteStreamOptions {
  
  var destination: js.UndefOr[String | File] = js.undefined
  
  var encryptionKey: js.UndefOr[String | Buffer] = js.undefined
  
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ Any, Unit]] = js.undefined
}
object UploadOptions {
  
  inline def apply(): UploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOptions]
  }
  
  extension [Self <: UploadOptions](x: Self) {
    
    inline def setDestination(value: String | File): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setEncryptionKey(value: String | Buffer): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setOnUploadProgress(value: /* progressEvent */ Any => Callback): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1((t0: /* progressEvent */ Any) => value(t0).runNow()))
    
    inline def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
  }
}
