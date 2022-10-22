package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's relative position.
  */
trait ChangeFloatingObjectRelativePositionCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[FloatingObjectRelativePositionSettings]
object ChangeFloatingObjectRelativePositionCommand {
  
  inline def apply(
    execute: FloatingObjectRelativePositionSettings => Boolean,
    getState: CallbackTo[CommandState[FloatingObjectRelativePositionSettings]]
  ): ChangeFloatingObjectRelativePositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeFloatingObjectRelativePositionCommand]
  }
}
