package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to restart the numbering list.
  */
trait RestartNumberingListCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RestartNumberingListCommand command.
    */
  def execute(): Boolean
}
object RestartNumberingListCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): RestartNumberingListCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[RestartNumberingListCommand]
  }
  
  extension [Self <: RestartNumberingListCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
