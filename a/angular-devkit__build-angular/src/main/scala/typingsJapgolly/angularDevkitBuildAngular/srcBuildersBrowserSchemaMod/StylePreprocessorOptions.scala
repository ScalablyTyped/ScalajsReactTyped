package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StylePreprocessorOptions extends StObject {
  
  /**
    * Paths to include. Paths will be resolved to workspace root.
    */
  var includePaths: js.UndefOr[js.Array[String]] = js.undefined
}
object StylePreprocessorOptions {
  
  inline def apply(): StylePreprocessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylePreprocessorOptions]
  }
  
  extension [Self <: StylePreprocessorOptions](x: Self) {
    
    inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
    
    inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
    
    inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value*))
  }
}
