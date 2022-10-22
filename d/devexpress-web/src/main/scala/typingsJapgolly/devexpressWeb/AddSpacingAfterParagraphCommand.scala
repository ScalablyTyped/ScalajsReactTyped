package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add spacing after a paragraph.
  */
trait AddSpacingAfterParagraphCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the AddSpacingAfterParagraphCommand command.
    */
  def execute(): Boolean
}
object AddSpacingAfterParagraphCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): AddSpacingAfterParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[AddSpacingAfterParagraphCommand]
  }
  
  extension [Self <: AddSpacingAfterParagraphCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
