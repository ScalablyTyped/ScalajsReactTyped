package typingsJapgolly.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: typingsJapgolly.webpack.mod.ChunkGraph
  
  /**
  		 * the module
  		 */
  var module: typingsJapgolly.webpack.mod.Module
  
  /**
  		 * the request that should be printed as comment
  		 */
  var request: String
  
  /**
  		 * if the dependency is weak (will create a nice error message)
  		 */
  var weak: js.UndefOr[Boolean] = js.undefined
}
object Module {
  
  inline def apply(
    chunkGraph: typingsJapgolly.webpack.mod.ChunkGraph,
    module: typingsJapgolly.webpack.mod.Module,
    request: String
  ): Module = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setChunkGraph(value: typingsJapgolly.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setModule(value: typingsJapgolly.webpack.mod.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
