package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the cell formatting of the selected table elements.
  */
trait ChangeTableCellFormattingCommand extends StObject {
  
  /**
    * Executes the ChangeTableCellFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object specifying cell formatting of the selected table elements.
    */
  def execute(settings: TableCellFormattingSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableCellFormattingSettings]
}
object ChangeTableCellFormattingCommand {
  
  inline def apply(
    execute: TableCellFormattingSettings => Boolean,
    getState: CallbackTo[CommandState[TableCellFormattingSettings]]
  ): ChangeTableCellFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTableCellFormattingCommand]
  }
  
  extension [Self <: ChangeTableCellFormattingCommand](x: Self) {
    
    inline def setExecute(value: TableCellFormattingSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[TableCellFormattingSettings]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
