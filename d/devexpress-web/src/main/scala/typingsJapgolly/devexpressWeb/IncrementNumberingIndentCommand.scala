package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to increment the indent level of paragraphs in a selected numbered list.
  */
trait IncrementNumberingIndentCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the IncrementNumberingIndentCommand command.
    */
  def execute(): Boolean
}
object IncrementNumberingIndentCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): IncrementNumberingIndentCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[IncrementNumberingIndentCommand]
  }
  
  extension [Self <: IncrementNumberingIndentCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
