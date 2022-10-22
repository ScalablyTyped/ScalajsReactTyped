package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the numbered paragraph and normal text.
  */
trait ToggleNumberingListCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleNumberingListCommand command.
    */
  def execute(): Boolean
}
object ToggleNumberingListCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[CommandState[Boolean]]): ToggleNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ToggleNumberingListCommand]
  }
  
  extension [Self <: ToggleNumberingListCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
