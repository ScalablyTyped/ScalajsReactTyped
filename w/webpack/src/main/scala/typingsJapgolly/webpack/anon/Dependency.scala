package typingsJapgolly.webpack.anon

import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependency extends StObject {
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: typingsJapgolly.webpack.mod.ChunkGraph
  
  /**
  		 * the dependency
  		 */
  var dependency: typingsJapgolly.webpack.mod.Dependency
  
  /**
  		 * request string used originally
  		 */
  var request: js.UndefOr[String] = js.undefined
  
  /**
  		 * if set, will be filled with runtime requirements
  		 */
  var runtimeRequirements: Set[String]
}
object Dependency {
  
  inline def apply(
    chunkGraph: typingsJapgolly.webpack.mod.ChunkGraph,
    dependency: typingsJapgolly.webpack.mod.Dependency,
    runtimeRequirements: Set[String]
  ): Dependency = {
    val __obj = js.Dynamic.literal(chunkGraph = chunkGraph.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
  
  extension [Self <: Dependency](x: Self) {
    
    inline def setChunkGraph(value: typingsJapgolly.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: typingsJapgolly.webpack.mod.Dependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
  }
}
