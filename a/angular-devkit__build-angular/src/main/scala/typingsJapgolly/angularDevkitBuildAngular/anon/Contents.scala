package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.esbuild.mod.OutputFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents extends StObject {
  
  var contents: String
  
  var errors: js.Array[typingsJapgolly.esbuild.mod.Message]
  
  var map: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var resourceFiles: js.Array[OutputFile]
  
  var warnings: js.Array[typingsJapgolly.esbuild.mod.Message]
}
object Contents {
  
  inline def apply(
    contents: String,
    errors: js.Array[typingsJapgolly.esbuild.mod.Message],
    resourceFiles: js.Array[OutputFile],
    warnings: js.Array[typingsJapgolly.esbuild.mod.Message]
  ): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], resourceFiles = resourceFiles.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  extension [Self <: Contents](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[typingsJapgolly.esbuild.mod.Message]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: typingsJapgolly.esbuild.mod.Message*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResourceFiles(value: js.Array[OutputFile]): Self = StObject.set(x, "resourceFiles", value.asInstanceOf[js.Any])
    
    inline def setResourceFilesVarargs(value: OutputFile*): Self = StObject.set(x, "resourceFiles", js.Array(value*))
    
    inline def setWarnings(value: js.Array[typingsJapgolly.esbuild.mod.Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: typingsJapgolly.esbuild.mod.Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
