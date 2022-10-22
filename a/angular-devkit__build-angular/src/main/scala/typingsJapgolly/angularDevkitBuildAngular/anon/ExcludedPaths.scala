package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludedPaths extends StObject {
  
  /** node_modules and test files are always excluded. */
  var excludedPaths: Set[String]
  
  var includedBasePath: String
}
object ExcludedPaths {
  
  inline def apply(excludedPaths: Set[String], includedBasePath: String): ExcludedPaths = {
    val __obj = js.Dynamic.literal(excludedPaths = excludedPaths.asInstanceOf[js.Any], includedBasePath = includedBasePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludedPaths]
  }
  
  extension [Self <: ExcludedPaths](x: Self) {
    
    inline def setExcludedPaths(value: Set[String]): Self = StObject.set(x, "excludedPaths", value.asInstanceOf[js.Any])
    
    inline def setIncludedBasePath(value: String): Self = StObject.set(x, "includedBasePath", value.asInstanceOf[js.Any])
  }
}
