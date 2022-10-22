package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a text box' relative size settings.
  */
trait ChangeTextBoxRelativeSizeCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[TextBoxRelativeSizeSettings]
object ChangeTextBoxRelativeSizeCommand {
  
  inline def apply(
    execute: TextBoxRelativeSizeSettings => Boolean,
    getState: CallbackTo[CommandState[TextBoxRelativeSizeSettings]]
  ): ChangeTextBoxRelativeSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeTextBoxRelativeSizeCommand]
  }
}
