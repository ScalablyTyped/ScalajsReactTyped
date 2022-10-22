package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a section break and start a new section on the next page.
  */
trait InsertSectionBreakNextPageCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertSectionBreakNextPageCommand command.
    */
  def execute(): Boolean
}
object InsertSectionBreakNextPageCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): InsertSectionBreakNextPageCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[InsertSectionBreakNextPageCommand]
  }
  
  extension [Self <: InsertSectionBreakNextPageCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
