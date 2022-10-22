package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to add spacing before a paragraph.
  */
trait AddSpacingBeforeParagraphCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the AddSpacingBeforeParagraphCommand command.
    */
  def execute(): Boolean
}
object AddSpacingBeforeParagraphCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): AddSpacingBeforeParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[AddSpacingBeforeParagraphCommand]
  }
  
  extension [Self <: AddSpacingBeforeParagraphCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
