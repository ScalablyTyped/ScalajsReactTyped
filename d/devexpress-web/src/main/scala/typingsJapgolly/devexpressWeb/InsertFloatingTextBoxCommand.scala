package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a floating text box.
  */
trait InsertFloatingTextBoxCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertFloatingTextBoxCommand command.
    */
  def execute(): Boolean
}
object InsertFloatingTextBoxCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): InsertFloatingTextBoxCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[InsertFloatingTextBoxCommand]
  }
  
  extension [Self <: InsertFloatingTextBoxCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
