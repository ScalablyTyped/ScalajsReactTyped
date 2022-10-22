package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the next page header or footer in the header/footer editing mode.
  */
trait GoToNextHeaderFooterCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToNextHeaderFooterCommand command.
    */
  def execute(): Boolean
}
object GoToNextHeaderFooterCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): GoToNextHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[GoToNextHeaderFooterCommand]
  }
  
  extension [Self <: GoToNextHeaderFooterCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
