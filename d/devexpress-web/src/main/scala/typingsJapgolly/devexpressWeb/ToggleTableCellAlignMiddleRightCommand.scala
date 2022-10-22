package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply middle-right alignment for the selected table cells.
  */
trait ToggleTableCellAlignMiddleRightCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignMiddleRightCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignMiddleRightCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[CommandState[Boolean]]): ToggleTableCellAlignMiddleRightCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ToggleTableCellAlignMiddleRightCommand]
  }
  
  extension [Self <: ToggleTableCellAlignMiddleRightCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
