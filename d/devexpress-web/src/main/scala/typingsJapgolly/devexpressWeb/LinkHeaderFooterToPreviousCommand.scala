package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to link a header/footer to the previous section, so it has the same content.
  */
trait LinkHeaderFooterToPreviousCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the LinkHeaderFooterToPreviousCommand command.
    */
  def execute(): Boolean
}
object LinkHeaderFooterToPreviousCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): LinkHeaderFooterToPreviousCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[LinkHeaderFooterToPreviousCommand]
  }
  
  extension [Self <: LinkHeaderFooterToPreviousCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
