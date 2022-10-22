package typingsJapgolly.googleCloudStorage.buildSrcFileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileMetadataOptions extends StObject {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object GetFileMetadataOptions {
  
  inline def apply(): GetFileMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileMetadataOptions]
  }
  
  extension [Self <: GetFileMetadataOptions](x: Self) {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
