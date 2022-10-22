package typingsJapgolly.googleCloudStorage.buildSrcFileMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidator
import typingsJapgolly.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidatorGenerator
import typingsJapgolly.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileOptions extends StObject {
  
  var crc32cGenerator: js.UndefOr[CRC32CValidatorGenerator] = js.undefined
  
  var encryptionKey: js.UndefOr[String | Buffer] = js.undefined
  
  var generation: js.UndefOr[Double | String] = js.undefined
  
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  var preconditionOpts: js.UndefOr[PreconditionOptions] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object FileOptions {
  
  inline def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  
  extension [Self <: FileOptions](x: Self) {
    
    inline def setCrc32cGenerator(value: CallbackTo[CRC32CValidator]): Self = StObject.set(x, "crc32cGenerator", value.toJsFn)
    
    inline def setCrc32cGeneratorUndefined: Self = StObject.set(x, "crc32cGenerator", js.undefined)
    
    inline def setEncryptionKey(value: String | Buffer): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setGeneration(value: Double | String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setPreconditionOpts(value: PreconditionOptions): Self = StObject.set(x, "preconditionOpts", value.asInstanceOf[js.Any])
    
    inline def setPreconditionOptsUndefined: Self = StObject.set(x, "preconditionOpts", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
