package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's preferred row height.
  */
trait ChangeTableRowPreferredHeightCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableRowPreferredHeightCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredHeight A TableHeightUnit object specifying preferred height of the selected table rows.
    */
  def execute(preferredHeight: TableHeightUnit): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableHeightUnit]
}
object ChangeTableRowPreferredHeightCommand {
  
  inline def apply(execute: TableHeightUnit => Boolean, getState: CallbackTo[CommandState[TableHeightUnit]]): ChangeTableRowPreferredHeightCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTableRowPreferredHeightCommand]
  }
  
  extension [Self <: ChangeTableRowPreferredHeightCommand](x: Self) {
    
    inline def setExecute(value: TableHeightUnit => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[TableHeightUnit]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
