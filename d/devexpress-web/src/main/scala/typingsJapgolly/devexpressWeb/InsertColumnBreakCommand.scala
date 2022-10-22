package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a column break at the current position in the document.
  */
trait InsertColumnBreakCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertColumnBreakCommand command.
    */
  def execute(): Boolean
}
object InsertColumnBreakCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): InsertColumnBreakCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[InsertColumnBreakCommand]
  }
  
  extension [Self <: InsertColumnBreakCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
