package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's style options.
  */
trait ChangeTableLookCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableLookCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableLookSettings object containing the settings that modify the table appearance.
    */
  def execute(settings: TableLookSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableLookSettings]
}
object ChangeTableLookCommand {
  
  inline def apply(execute: TableLookSettings => Boolean, getState: CallbackTo[CommandState[TableLookSettings]]): ChangeTableLookCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTableLookCommand]
  }
  
  extension [Self <: ChangeTableLookCommand](x: Self) {
    
    inline def setExecute(value: TableLookSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[TableLookSettings]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
