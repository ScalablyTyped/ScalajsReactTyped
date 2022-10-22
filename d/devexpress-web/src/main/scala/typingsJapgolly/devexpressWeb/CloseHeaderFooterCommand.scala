package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to finish header/footer editing.
  */
trait CloseHeaderFooterCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the CloseHeaderFooterCommand command.
    */
  def execute(): Boolean
}
object CloseHeaderFooterCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): CloseHeaderFooterCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[CloseHeaderFooterCommand]
  }
  
  extension [Self <: CloseHeaderFooterCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
