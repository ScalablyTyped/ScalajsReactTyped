package typingsJapgolly.xterm.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITerminalAddon
  extends StObject
     with IDisposable {
  
  /**
    * This is called when the addon is activated.
    */
  def activate(terminal: Terminal): Unit
}
object ITerminalAddon {
  
  inline def apply(activate: Terminal => Callback, dispose: Callback): ITerminalAddon = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1((t0: Terminal) => activate(t0).runNow()), dispose = dispose.toJsFn)
    __obj.asInstanceOf[ITerminalAddon]
  }
  
  extension [Self <: ITerminalAddon](x: Self) {
    
    inline def setActivate(value: Terminal => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction1((t0: Terminal) => value(t0).runNow()))
  }
}
