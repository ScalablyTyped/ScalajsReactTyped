package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a caption for an equation.
  */
trait InsertEquationsCaptionCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertEquationsCaptionCommand command.
    */
  def execute(): Boolean
}
object InsertEquationsCaptionCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): InsertEquationsCaptionCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[InsertEquationsCaptionCommand]
  }
  
  extension [Self <: InsertEquationsCaptionCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
