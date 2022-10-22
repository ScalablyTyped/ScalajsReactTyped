package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the previous word.
  */
trait RemovePrevWordCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemovePrevWordCommand command.
    */
  def execute(): Boolean
}
object RemovePrevWordCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): RemovePrevWordCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[RemovePrevWordCommand]
  }
  
  extension [Self <: RemovePrevWordCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
