package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to assign a shortcut to the specified client command.
  */
trait AssignShortcutCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the AssignShortcutCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param keyCode A specifically generated code that uniquely identifies the combination of keys specified for a shortcut. This code is specified using the ASPxClientUtils.GetShortcutCode method.
    * @param callback A callback function to execute when a shortcut is activated.
    */
  def execute(keyCode: Double, callback: js.Function0[Unit]): Boolean
}
object AssignShortcutCommand {
  
  inline def apply(execute: (Double, js.Function0[Unit]) => Boolean, getState: CallbackTo[SimpleCommandState]): AssignShortcutCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[AssignShortcutCommand]
  }
  
  extension [Self <: AssignShortcutCommand](x: Self) {
    
    inline def setExecute(value: (Double, js.Function0[Unit]) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
  }
}
