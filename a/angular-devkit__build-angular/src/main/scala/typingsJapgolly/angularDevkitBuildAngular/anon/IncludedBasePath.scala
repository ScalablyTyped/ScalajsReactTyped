package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludedBasePath extends StObject {
  
  var includedBasePath: String
  
  var inputSourceMap: Any
}
object IncludedBasePath {
  
  inline def apply(includedBasePath: String, inputSourceMap: Any): IncludedBasePath = {
    val __obj = js.Dynamic.literal(includedBasePath = includedBasePath.asInstanceOf[js.Any], inputSourceMap = inputSourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedBasePath]
  }
  
  extension [Self <: IncludedBasePath](x: Self) {
    
    inline def setIncludedBasePath(value: String): Self = StObject.set(x, "includedBasePath", value.asInstanceOf[js.Any])
    
    inline def setInputSourceMap(value: Any): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
  }
}
