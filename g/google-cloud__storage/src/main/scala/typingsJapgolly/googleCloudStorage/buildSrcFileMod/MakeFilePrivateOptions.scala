package typingsJapgolly.googleCloudStorage.buildSrcFileMod

import typingsJapgolly.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.Metadata
import typingsJapgolly.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeFilePrivateOptions extends StObject {
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var preconditionOpts: js.UndefOr[PreconditionOptions] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var userProject: js.UndefOr[String] = js.undefined
}
object MakeFilePrivateOptions {
  
  inline def apply(): MakeFilePrivateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeFilePrivateOptions]
  }
  
  extension [Self <: MakeFilePrivateOptions](x: Self) {
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPreconditionOpts(value: PreconditionOptions): Self = StObject.set(x, "preconditionOpts", value.asInstanceOf[js.Any])
    
    inline def setPreconditionOptsUndefined: Self = StObject.set(x, "preconditionOpts", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
