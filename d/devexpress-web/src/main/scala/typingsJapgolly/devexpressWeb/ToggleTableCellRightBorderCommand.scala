package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle right borders for selected cells on/off.
  */
trait ToggleTableCellRightBorderCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellRightBorderCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellRightBorderCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[CommandState[Boolean]]): ToggleTableCellRightBorderCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ToggleTableCellRightBorderCommand]
  }
  
  extension [Self <: ToggleTableCellRightBorderCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
