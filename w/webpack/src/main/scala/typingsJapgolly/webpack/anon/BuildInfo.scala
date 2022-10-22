package typingsJapgolly.webpack.anon

import typingsJapgolly.std.WeakMap
import typingsJapgolly.webpack.mod.WeakTupleMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildInfo extends StObject {
  
  var buildInfo: js.Object
  
  var memCache: WeakTupleMap[Any, Any]
  
  var references: WeakMap[typingsJapgolly.webpack.mod.Dependency, typingsJapgolly.webpack.mod.Module]
}
object BuildInfo {
  
  inline def apply(
    buildInfo: js.Object,
    memCache: WeakTupleMap[Any, Any],
    references: WeakMap[typingsJapgolly.webpack.mod.Dependency, typingsJapgolly.webpack.mod.Module]
  ): BuildInfo = {
    val __obj = js.Dynamic.literal(buildInfo = buildInfo.asInstanceOf[js.Any], memCache = memCache.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildInfo]
  }
  
  extension [Self <: BuildInfo](x: Self) {
    
    inline def setBuildInfo(value: js.Object): Self = StObject.set(x, "buildInfo", value.asInstanceOf[js.Any])
    
    inline def setMemCache(value: WeakTupleMap[Any, Any]): Self = StObject.set(x, "memCache", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: WeakMap[typingsJapgolly.webpack.mod.Dependency, typingsJapgolly.webpack.mod.Module]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
  }
}
