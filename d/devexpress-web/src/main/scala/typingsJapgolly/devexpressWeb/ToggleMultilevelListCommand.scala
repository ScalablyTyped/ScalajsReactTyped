package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the multilevel list style and normal text.
  */
trait ToggleMultilevelListCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleMultilevelListCommand command.
    */
  def execute(): Boolean
}
object ToggleMultilevelListCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[CommandState[Boolean]]): ToggleMultilevelListCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ToggleMultilevelListCommand]
  }
  
  extension [Self <: ToggleMultilevelListCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
