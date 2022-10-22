package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the selected numeration.
  */
trait RemoveNumerationCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveNumerationCommand command.
    */
  def execute(): Boolean
}
object RemoveNumerationCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): RemoveNumerationCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[RemoveNumerationCommand]
  }
  
  extension [Self <: RemoveNumerationCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
