package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.anon.FailOnConflict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeterministicModuleIdsPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: FailOnConflict
}
object DeterministicModuleIdsPlugin {
  
  inline def apply(apply: Compiler => Callback, options: FailOnConflict): DeterministicModuleIdsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeterministicModuleIdsPlugin]
  }
  
  extension [Self <: DeterministicModuleIdsPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    
    inline def setOptions(value: FailOnConflict): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
