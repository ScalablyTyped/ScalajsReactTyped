package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the previous page header or footer in the header/footer editing mode.
  */
trait GoToPreviousHeaderFooterCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToPreviousHeaderFooterCommand command.
    */
  def execute(): Boolean
}
object GoToPreviousHeaderFooterCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): GoToPreviousHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[GoToPreviousHeaderFooterCommand]
  }
  
  extension [Self <: GoToPreviousHeaderFooterCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
