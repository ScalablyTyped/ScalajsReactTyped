package typingsJapgolly.webpack.mod

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteModuleContext extends StObject {
  
  var __webpack_require__ : js.UndefOr[js.Function1[/* arg0 */ String, Any]] = js.undefined
  
  var assets: Map[String, typingsJapgolly.webpack.anon.Source]
  
  var chunk: Chunk
  
  var chunkGraph: ChunkGraph
}
object ExecuteModuleContext {
  
  inline def apply(assets: Map[String, typingsJapgolly.webpack.anon.Source], chunk: Chunk, chunkGraph: ChunkGraph): ExecuteModuleContext = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], chunk = chunk.asInstanceOf[js.Any], chunkGraph = chunkGraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteModuleContext]
  }
  
  extension [Self <: ExecuteModuleContext](x: Self) {
    
    inline def setAssets(value: Map[String, typingsJapgolly.webpack.anon.Source]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
    
    inline def set__webpack_require__(value: /* arg0 */ String => Any): Self = StObject.set(x, "__webpack_require__", js.Any.fromFunction1(value))
    
    inline def set__webpack_require__Undefined: Self = StObject.set(x, "__webpack_require__", js.undefined)
  }
}
