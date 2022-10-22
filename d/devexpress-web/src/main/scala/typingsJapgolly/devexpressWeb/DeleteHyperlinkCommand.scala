package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete the selected hyperlink.
  */
trait DeleteHyperlinkCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteHyperlinkCommand command.
    */
  def execute(): Boolean
}
object DeleteHyperlinkCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): DeleteHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[DeleteHyperlinkCommand]
  }
  
  extension [Self <: DeleteHyperlinkCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
