package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to reset the selected text's formatting to default.
  */
trait ClearFormattingCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the ClearFormattingCommand command.
    */
  def execute(): Boolean
}
object ClearFormattingCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): ClearFormattingCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ClearFormattingCommand]
  }
  
  extension [Self <: ClearFormattingCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
