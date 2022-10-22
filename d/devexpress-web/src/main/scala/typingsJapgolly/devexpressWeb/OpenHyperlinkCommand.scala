package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to navigate to the document bookmark or URI (uniform resource identifier) specified for the hyperlink.
  */
trait OpenHyperlinkCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the OpenHyperlinkCommand command.
    */
  def execute(): Boolean
}
object OpenHyperlinkCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): OpenHyperlinkCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[OpenHyperlinkCommand]
  }
  
  extension [Self <: OpenHyperlinkCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
