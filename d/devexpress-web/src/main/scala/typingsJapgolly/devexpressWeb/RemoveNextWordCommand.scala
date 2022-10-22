package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove the next word.
  */
trait RemoveNextWordCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveNextWordCommand command.
    */
  def execute(): Boolean
}
object RemoveNextWordCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): RemoveNextWordCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[RemoveNextWordCommand]
  }
  
  extension [Self <: RemoveNextWordCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
