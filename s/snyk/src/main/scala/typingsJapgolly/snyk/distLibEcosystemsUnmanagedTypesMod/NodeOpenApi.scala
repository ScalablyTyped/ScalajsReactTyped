package typingsJapgolly.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeOpenApi extends StObject {
  
  var deps: js.Array[DepOpenApi]
  
  var node_id: String
  
  var pkg_id: String
}
object NodeOpenApi {
  
  inline def apply(deps: js.Array[DepOpenApi], node_id: String, pkg_id: String): NodeOpenApi = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], pkg_id = pkg_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOpenApi]
  }
  
  extension [Self <: NodeOpenApi](x: Self) {
    
    inline def setDeps(value: js.Array[DepOpenApi]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: DepOpenApi*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPkg_id(value: String): Self = StObject.set(x, "pkg_id", value.asInstanceOf[js.Any])
  }
}
