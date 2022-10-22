package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to continue the list's numbering.
  */
trait ContinueNumberingListCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the ContinueNumberingListCommand command.
    */
  def execute(): Boolean
}
object ContinueNumberingListCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): ContinueNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ContinueNumberingListCommand]
  }
  
  extension [Self <: ContinueNumberingListCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
