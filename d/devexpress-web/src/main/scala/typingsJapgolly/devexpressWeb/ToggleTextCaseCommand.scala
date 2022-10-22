package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle the case for each character - upper case becomes lower, lower case becomes upper.
  */
trait ToggleTextCaseCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the ToggleTextCaseCommand command.
    */
  def execute(): Boolean
}
object ToggleTextCaseCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): ToggleTextCaseCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ToggleTextCaseCommand]
  }
  
  extension [Self <: ToggleTextCaseCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
