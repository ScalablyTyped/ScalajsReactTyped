package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var context: String
  
  var entry: String
  
  var options: String | EntryOptions
}
object EntryPlugin {
  
  inline def apply(apply: Compiler => Callback, context: String, entry: String, options: String | EntryOptions): EntryPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), context = context.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPlugin]
  }
  
  extension [Self <: EntryPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: String | EntryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
