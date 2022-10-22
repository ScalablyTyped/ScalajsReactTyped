package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected table cells with a horizontal shift.
  */
trait DeleteTableCellsWithShiftHorizontallyCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteTableCellsWithShiftHorizontallyCommand command.
    */
  def execute(): Boolean
}
object DeleteTableCellsWithShiftHorizontallyCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): DeleteTableCellsWithShiftHorizontallyCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[DeleteTableCellsWithShiftHorizontallyCommand]
  }
  
  extension [Self <: DeleteTableCellsWithShiftHorizontallyCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
