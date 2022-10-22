package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkPrefetchPreloadPlugin extends StObject {
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit
}
object ChunkPrefetchPreloadPlugin {
  
  inline def apply(apply: Compiler => Callback): ChunkPrefetchPreloadPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
    __obj.asInstanceOf[ChunkPrefetchPreloadPlugin]
  }
  
  extension [Self <: ChunkPrefetchPreloadPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
  }
}
