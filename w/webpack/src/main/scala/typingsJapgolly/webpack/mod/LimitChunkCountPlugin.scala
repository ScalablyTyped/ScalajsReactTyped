package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitChunkCountPlugin extends StObject {
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: js.UndefOr[LimitChunkCountPluginOptions] = js.undefined
}
object LimitChunkCountPlugin {
  
  inline def apply(apply: Compiler => Callback): LimitChunkCountPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
    __obj.asInstanceOf[LimitChunkCountPlugin]
  }
  
  extension [Self <: LimitChunkCountPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    
    inline def setOptions(value: LimitChunkCountPluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
