package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to hide the search results.
  */
trait HideFindResultsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the HideFindResultsCommand command.
    */
  def execute(): Boolean
}
object HideFindResultsCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): HideFindResultsCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[HideFindResultsCommand]
  }
  
  extension [Self <: HideFindResultsCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
