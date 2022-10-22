package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadPaths extends StObject {
  
  var loadPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  var sourcemap: Boolean
}
object LoadPaths {
  
  inline def apply(sourcemap: Boolean): LoadPaths = {
    val __obj = js.Dynamic.literal(sourcemap = sourcemap.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadPaths]
  }
  
  extension [Self <: LoadPaths](x: Self) {
    
    inline def setLoadPaths(value: js.Array[String]): Self = StObject.set(x, "loadPaths", value.asInstanceOf[js.Any])
    
    inline def setLoadPathsUndefined: Self = StObject.set(x, "loadPaths", js.undefined)
    
    inline def setLoadPathsVarargs(value: String*): Self = StObject.set(x, "loadPaths", js.Array(value*))
    
    inline def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
  }
}
