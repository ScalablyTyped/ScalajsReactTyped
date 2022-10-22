package typingsJapgolly.googleCloudStorage.buildSrcFileMod

import typingsJapgolly.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionKeyOptions extends StObject {
  
  var encryptionKey: js.UndefOr[String | Buffer] = js.undefined
  
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  var preconditionOpts: js.UndefOr[PreconditionOptions] = js.undefined
}
object EncryptionKeyOptions {
  
  inline def apply(): EncryptionKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionKeyOptions]
  }
  
  extension [Self <: EncryptionKeyOptions](x: Self) {
    
    inline def setEncryptionKey(value: String | Buffer): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setPreconditionOpts(value: PreconditionOptions): Self = StObject.set(x, "preconditionOpts", value.asInstanceOf[js.Any])
    
    inline def setPreconditionOptsUndefined: Self = StObject.set(x, "preconditionOpts", js.undefined)
  }
}
