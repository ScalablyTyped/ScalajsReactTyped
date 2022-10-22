package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.commands.Command
import typingsJapgolly.chromeApps.chrome.commands.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcommands extends StObject {
  
  /**
    * Returns all the registered commands for this app and their shortcut (if active).
    * @param callback Called to return the registered commands.
    */
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit
  
  /** Fired when a registered command is activated using a keyboard shortcut. */
  val onCommand: CommandEvent
}
object Typeofcommands {
  
  inline def apply(getAll: js.Function1[/* commands */ js.Array[Command], Unit] => Callback, onCommand: CommandEvent): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1((t0: js.Function1[/* commands */ js.Array[Command], Unit]) => getAll(t0).runNow()), onCommand = onCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcommands]
  }
  
  extension [Self <: Typeofcommands](x: Self) {
    
    inline def setGetAll(value: js.Function1[/* commands */ js.Array[Command], Unit] => Callback): Self = StObject.set(x, "getAll", js.Any.fromFunction1((t0: js.Function1[/* commands */ js.Array[Command], Unit]) => value(t0).runNow()))
    
    inline def setOnCommand(value: CommandEvent): Self = StObject.set(x, "onCommand", value.asInstanceOf[js.Any])
  }
}
