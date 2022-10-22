package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the page header from the page footer in the header/footer editing mode.
  */
trait GoToHeaderCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToHeaderCommand command.
    */
  def execute(): Boolean
}
object GoToHeaderCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): GoToHeaderCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[GoToHeaderCommand]
  }
  
  extension [Self <: GoToHeaderCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
