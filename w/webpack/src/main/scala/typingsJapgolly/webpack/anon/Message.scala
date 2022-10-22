package typingsJapgolly.webpack.anon

import typingsJapgolly.std.Set
import typingsJapgolly.webpack.mod.AsyncDependenciesBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /**
  		 * the async block
  		 */
  var block: AsyncDependenciesBlock
  
  /**
  		 * the chunk graph
  		 */
  var chunkGraph: typingsJapgolly.webpack.mod.ChunkGraph
  
  /**
  		 * the message
  		 */
  var message: String
  
  /**
  		 * if set, will be filled with runtime requirements
  		 */
  var runtimeRequirements: Set[String]
}
object Message {
  
  inline def apply(
    block: AsyncDependenciesBlock,
    chunkGraph: typingsJapgolly.webpack.mod.ChunkGraph,
    message: String,
    runtimeRequirements: Set[String]
  ): Message = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], runtimeRequirements = runtimeRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setBlock(value: AsyncDependenciesBlock): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: typingsJapgolly.webpack.mod.ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRuntimeRequirements(value: Set[String]): Self = StObject.set(x, "runtimeRequirements", value.asInstanceOf[js.Any])
  }
}
