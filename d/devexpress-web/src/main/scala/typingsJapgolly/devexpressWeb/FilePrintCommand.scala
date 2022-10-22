package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke a browser-specific Print dialog allowing one to print the current document.
  */
trait FilePrintCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the FilePrintCommand command.
    */
  def execute(): Boolean
}
object FilePrintCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): FilePrintCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[FilePrintCommand]
  }
  
  extension [Self <: FilePrintCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
