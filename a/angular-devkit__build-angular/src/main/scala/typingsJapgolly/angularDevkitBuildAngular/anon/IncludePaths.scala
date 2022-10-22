package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludePaths extends StObject {
  
  var includePaths: js.Array[String]
}
object IncludePaths {
  
  inline def apply(includePaths: js.Array[String]): IncludePaths = {
    val __obj = js.Dynamic.literal(includePaths = includePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludePaths]
  }
  
  extension [Self <: IncludePaths](x: Self) {
    
    inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
    
    inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value*))
  }
}
