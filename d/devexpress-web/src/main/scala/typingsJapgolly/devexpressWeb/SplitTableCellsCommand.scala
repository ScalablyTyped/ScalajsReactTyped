package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to split the selected table cells based on the specified options.
  */
trait SplitTableCellsCommand extends StObject {
  
  /**
    * Executes the SplitTableCellsCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param rowCount An integer value specifying a number of rows in the split table cells.
    * @param columnCount An integer value specifying a number of columns in the split table cells.
    * @param mergeBeforeSplit true to merge the selected cells before the splitting; otherwise, false.
    */
  def execute(rowCount: Double, columnCount: Double, mergeBeforeSplit: Boolean): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object SplitTableCellsCommand {
  
  inline def apply(execute: (Double, Double, Boolean) => Boolean, getState: CallbackTo[SimpleCommandState]): SplitTableCellsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[SplitTableCellsCommand]
  }
  
  extension [Self <: SplitTableCellsCommand](x: Self) {
    
    inline def setExecute(value: (Double, Double, Boolean) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
    
    inline def setGetState(value: CallbackTo[SimpleCommandState]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
