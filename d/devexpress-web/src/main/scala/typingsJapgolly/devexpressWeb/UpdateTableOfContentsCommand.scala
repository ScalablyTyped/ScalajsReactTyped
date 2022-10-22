package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to update a table of contents.
  */
trait UpdateTableOfContentsCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the UpdateTableOfContentsCommand command.
    */
  def execute(): Boolean
}
object UpdateTableOfContentsCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): UpdateTableOfContentsCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[UpdateTableOfContentsCommand]
  }
  
  extension [Self <: UpdateTableOfContentsCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
