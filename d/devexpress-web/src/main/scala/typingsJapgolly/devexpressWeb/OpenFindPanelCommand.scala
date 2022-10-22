package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to invoke the Search Panel allowing end-users to search text and navigate through search results.
  */
trait OpenFindPanelCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenFindPanelCommand command.
    */
  def execute(): Boolean
}
object OpenFindPanelCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): OpenFindPanelCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[OpenFindPanelCommand]
  }
  
  extension [Self <: OpenFindPanelCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
