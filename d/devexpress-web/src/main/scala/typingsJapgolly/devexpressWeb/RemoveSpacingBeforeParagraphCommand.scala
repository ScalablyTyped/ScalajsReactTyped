package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to remove spacing before the selected paragraph.
  */
trait RemoveSpacingBeforeParagraphCommand
  extends StObject
     with CommandWithSimpleStateBase {
  
  /**
    * Executes the RemoveSpacingBeforeParagraphCommand command.
    */
  def execute(): Boolean
}
object RemoveSpacingBeforeParagraphCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[SimpleCommandState]): RemoveSpacingBeforeParagraphCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[RemoveSpacingBeforeParagraphCommand]
  }
  
  extension [Self <: RemoveSpacingBeforeParagraphCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
