package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleName extends StObject {
  
  var bundleName: String
  
  var inject: Boolean
  
  var paths: js.Array[String]
}
object BundleName {
  
  inline def apply(bundleName: String, inject: Boolean, paths: js.Array[String]): BundleName = {
    val __obj = js.Dynamic.literal(bundleName = bundleName.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleName]
  }
  
  extension [Self <: BundleName](x: Self) {
    
    inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
    
    inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
