package typingsJapgolly.feflowCli

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook extends StObject {
  
  /**
    * Hook will execute befor any command
    * Hook registration command method parameter description
    * @param type  Hook name eg：report
    * @param fn  Hook callback function eg：report
    */
  def hook(`type`: String, fn: js.Function0[Unit]): Unit
}
object Hook {
  
  inline def apply(hook: (String, js.Function0[Unit]) => Callback): Hook = {
    val __obj = js.Dynamic.literal(hook = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (hook(t0, t1)).runNow()))
    __obj.asInstanceOf[Hook]
  }
  
  extension [Self <: Hook](x: Self) {
    
    inline def setHook(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "hook", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
  }
}
