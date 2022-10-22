package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedChunkIdsPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var context: Any
  
  var delimiter: Any
}
object NamedChunkIdsPlugin {
  
  inline def apply(apply: Compiler => Callback, context: Any, delimiter: Any): NamedChunkIdsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), context = context.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedChunkIdsPlugin]
  }
  
  extension [Self <: NamedChunkIdsPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: Any): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
  }
}
