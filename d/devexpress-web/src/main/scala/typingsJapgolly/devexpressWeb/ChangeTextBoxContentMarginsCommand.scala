package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a text box' content margins.
  */
trait ChangeTextBoxContentMarginsCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeTextBoxContentMarginsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A Margins object specifying margin settings.
    */
  def execute(settings: Margins): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[Margins]
}
object ChangeTextBoxContentMarginsCommand {
  
  inline def apply(execute: Margins => Boolean, getState: CallbackTo[CommandState[Margins]]): ChangeTextBoxContentMarginsCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTextBoxContentMarginsCommand]
  }
  
  extension [Self <: ChangeTextBoxContentMarginsCommand](x: Self) {
    
    inline def setExecute(value: Margins => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[Margins]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
