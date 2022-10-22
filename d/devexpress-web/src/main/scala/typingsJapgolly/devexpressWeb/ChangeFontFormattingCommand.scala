package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the font formatting of characters in a selected range.
  */
trait ChangeFontFormattingCommand
  extends StObject
     with CommandBase {
  
  /**
    * Executes the ChangeFontFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A  FontFormattingSettings object specifying font formatting settings.
    */
  def execute(settings: FontFormattingSettings): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): CommandState[FontFormattingSettings]
}
object ChangeFontFormattingCommand {
  
  inline def apply(
    execute: FontFormattingSettings => Boolean,
    getState: CallbackTo[CommandState[FontFormattingSettings]]
  ): ChangeFontFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeFontFormattingCommand]
  }
  
  extension [Self <: ChangeFontFormattingCommand](x: Self) {
    
    inline def setExecute(value: FontFormattingSettings => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[CommandState[FontFormattingSettings]]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}
