package typingsJapgolly.axeCore.mod

import typingsJapgolly.axeCore.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxePlugin extends StObject {
  
  var cleanup: js.UndefOr[js.Function1[/* callback */ js.Function, Unit]] = js.undefined
  
  var commands: js.Array[Callback]
  
  var id: String
  
  def run(args: Any*): Any
}
object AxePlugin {
  
  inline def apply(commands: js.Array[Callback], id: String, run: /* repeated */ Any => Any): AxePlugin = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[AxePlugin]
  }
  
  extension [Self <: AxePlugin](x: Self) {
    
    inline def setCleanup(value: /* callback */ js.Function => japgolly.scalajs.react.Callback): Self = StObject.set(x, "cleanup", js.Any.fromFunction1((t0: /* callback */ js.Function) => value(t0).runNow()))
    
    inline def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
    
    inline def setCommands(value: js.Array[Callback]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: Callback*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRun(value: /* repeated */ Any => Any): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
