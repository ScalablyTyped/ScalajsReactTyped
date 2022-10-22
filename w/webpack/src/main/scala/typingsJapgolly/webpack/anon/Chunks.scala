package typingsJapgolly.webpack.anon

import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunks extends StObject {
  
  var chunks: Set[typingsJapgolly.webpack.mod.Chunk]
  
  var onChunks: js.Array[typingsJapgolly.webpack.mod.Chunk]
}
object Chunks {
  
  inline def apply(
    chunks: Set[typingsJapgolly.webpack.mod.Chunk],
    onChunks: js.Array[typingsJapgolly.webpack.mod.Chunk]
  ): Chunks = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], onChunks = onChunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunks]
  }
  
  extension [Self <: Chunks](x: Self) {
    
    inline def setChunks(value: Set[typingsJapgolly.webpack.mod.Chunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setOnChunks(value: js.Array[typingsJapgolly.webpack.mod.Chunk]): Self = StObject.set(x, "onChunks", value.asInstanceOf[js.Any])
    
    inline def setOnChunksVarargs(value: typingsJapgolly.webpack.mod.Chunk*): Self = StObject.set(x, "onChunks", js.Array(value*))
  }
}
