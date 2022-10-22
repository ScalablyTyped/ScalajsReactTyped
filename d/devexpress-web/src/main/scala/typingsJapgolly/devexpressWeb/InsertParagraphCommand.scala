package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a paragraph break at the current position in the document.
  */
trait InsertParagraphCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the InsertParagraphCommand command.
    */
  def execute(): Boolean
}
object InsertParagraphCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): InsertParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[InsertParagraphCommand]
  }
  
  extension [Self <: InsertParagraphCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
