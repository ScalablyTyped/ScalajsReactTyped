package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle centered paragraph alignment on and off.
  */
trait ToggleParagraphAlignmentCenterCommand
  extends StObject
     with CommandWithBooleanStateBase {
  
  /**
    * Executes the ToggleParagraphAlignmentCenterCommand command.
    */
  def execute(): Boolean
}
object ToggleParagraphAlignmentCenterCommand {
  
  inline def apply(execute: CallbackTo[Boolean], getState: CallbackTo[CommandState[Boolean]]): ToggleParagraphAlignmentCenterCommand = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn, getState = getState.toJsFn)
    __obj.asInstanceOf[ToggleParagraphAlignmentCenterCommand]
  }
  
  extension [Self <: ToggleParagraphAlignmentCenterCommand](x: Self) {
    
    inline def setExecute(value: CallbackTo[Boolean]): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
