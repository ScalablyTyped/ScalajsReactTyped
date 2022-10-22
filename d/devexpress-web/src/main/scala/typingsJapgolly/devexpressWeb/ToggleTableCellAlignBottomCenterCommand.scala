package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply bottom-center alignment for the selected table cells.
  */
trait ToggleTableCellAlignBottomCenterCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleTableCellAlignBottomCenterCommand command.
    */
  def execute(): Boolean
}
object ToggleTableCellAlignBottomCenterCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[CommandState[Boolean]]): ToggleTableCellAlignBottomCenterCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ToggleTableCellAlignBottomCenterCommand]
  }
  
  extension [Self <: ToggleTableCellAlignBottomCenterCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
