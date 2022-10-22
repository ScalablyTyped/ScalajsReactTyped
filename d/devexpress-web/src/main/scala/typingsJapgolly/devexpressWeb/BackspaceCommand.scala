package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to move the cursor backwards and erase the character in that space.
  */
trait BackspaceCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the BackspaceCommand command.
    */
  def execute(): Boolean
}
object BackspaceCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): BackspaceCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[BackspaceCommand]
  }
  
  extension [Self <: BackspaceCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
