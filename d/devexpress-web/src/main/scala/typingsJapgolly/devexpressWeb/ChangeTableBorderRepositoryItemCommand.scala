package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the repository item's table border style.
  */
trait ChangeTableBorderRepositoryItemCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTableBorderRepositoryItemCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object specifying the repository item's table border style.
    */
  def execute(settings: TableBorderSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[TableBorderSettings]
}
object ChangeTableBorderRepositoryItemCommand {
  
  inline def apply(execute: TableBorderSettings => Boolean, getState: CallbackTo[CommandState[TableBorderSettings]]): ChangeTableBorderRepositoryItemCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTableBorderRepositoryItemCommand]
  }
  
  extension [Self <: ChangeTableBorderRepositoryItemCommand](x: Self) {
    
    inline def setExecute(value: TableBorderSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[TableBorderSettings]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
