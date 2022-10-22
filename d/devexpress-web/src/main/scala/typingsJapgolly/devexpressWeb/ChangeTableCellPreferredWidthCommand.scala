package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the preferred cell width of the selected table rows.
  */
trait ChangeTableCellPreferredWidthCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableCellPreferredWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table rows.
    */
  def execute(preferredWidth: TableWidthUnit): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableWidthUnit]
}
object ChangeTableCellPreferredWidthCommand {
  
  inline def apply(execute: TableWidthUnit => Boolean, getState: CallbackTo[CommandState[TableWidthUnit]]): ChangeTableCellPreferredWidthCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTableCellPreferredWidthCommand]
  }
  
  extension [Self <: ChangeTableCellPreferredWidthCommand](x: Self) {
    
    inline def setExecute(value: TableWidthUnit => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[TableWidthUnit]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
