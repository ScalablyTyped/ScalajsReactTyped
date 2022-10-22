package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the borders of the selected table cells.
  */
trait RemoveTableCellBordersCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveTableCellBordersCommand command.
    */
  def execute(): Boolean
}
object RemoveTableCellBordersCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): RemoveTableCellBordersCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[RemoveTableCellBordersCommand]
  }
  
  extension [Self <: RemoveTableCellBordersCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
