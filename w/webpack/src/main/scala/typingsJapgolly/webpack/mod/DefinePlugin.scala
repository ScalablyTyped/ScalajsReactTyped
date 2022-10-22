package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefinePlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var definitions: Record[String, CodeValue]
}
object DefinePlugin {
  
  inline def apply(apply: Compiler => Callback, definitions: Record[String, CodeValue]): DefinePlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinePlugin]
  }
  
  extension [Self <: DefinePlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    
    inline def setDefinitions(value: Record[String, CodeValue]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
  }
}
