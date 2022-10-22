package typingsJapgolly.feflowCli

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  /**
    * Plugin registration command method parameter description
    * @param cmd  Plugin command name eg：devtool
    * @param desc Plugin command description eg： Feflow devtool for better develop a devkit or plugin
    * @param fn   Plugin callback function
    */
  def register(cmd: String, desc: String, fn: js.Function0[Unit]): Unit
}
object Command {
  
  inline def apply(register: (String, String, js.Function0[Unit]) => Callback): Command = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function0[Unit]) => (register(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setRegister(value: (String, String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "register", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
