package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeEnvironmentPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: typingsJapgolly.webpack.anon.InfrastructureLogging
}
object NodeEnvironmentPlugin {
  
  inline def apply(apply: Compiler => Callback, options: typingsJapgolly.webpack.anon.InfrastructureLogging): NodeEnvironmentPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeEnvironmentPlugin]
  }
  
  extension [Self <: NodeEnvironmentPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    
    inline def setOptions(value: typingsJapgolly.webpack.anon.InfrastructureLogging): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
