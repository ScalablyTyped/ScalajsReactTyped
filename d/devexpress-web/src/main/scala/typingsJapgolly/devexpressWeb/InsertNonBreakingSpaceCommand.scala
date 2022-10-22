package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add a non-breaking space in place of a selected range.
  */
trait InsertNonBreakingSpaceCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertNonBreakingSpaceCommand command.
    */
  def execute(): Boolean
}
object InsertNonBreakingSpaceCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): InsertNonBreakingSpaceCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[InsertNonBreakingSpaceCommand]
  }
  
  extension [Self <: InsertNonBreakingSpaceCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
