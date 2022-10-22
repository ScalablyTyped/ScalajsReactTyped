package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to delete all hyperlinks in a selected range.
  */
trait DeleteHyperlinksCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the DeleteHyperlinksCommand command.
    */
  def execute(): Boolean
}
object DeleteHyperlinksCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): DeleteHyperlinksCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[DeleteHyperlinksCommand]
  }
  
  extension [Self <: DeleteHyperlinksCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
