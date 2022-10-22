package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the page footer from the page header in the header/footer editing mode.
  */
trait GoToFooterCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the GoToFooterCommand command.
    */
  def execute(): Boolean
}
object GoToFooterCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): GoToFooterCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[GoToFooterCommand]
  }
  
  extension [Self <: GoToFooterCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
