package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to merge the selected table cells.
  */
trait MergeTableCellsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the MergeTableCellsCommand command.
    */
  def execute(): Boolean
}
object MergeTableCellsCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): MergeTableCellsCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[MergeTableCellsCommand]
  }
  
  extension [Self <: MergeTableCellsCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
