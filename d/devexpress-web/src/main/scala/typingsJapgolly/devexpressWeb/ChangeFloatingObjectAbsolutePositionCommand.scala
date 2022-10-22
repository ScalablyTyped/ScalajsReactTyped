package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change a floating object's absolute position.
  */
trait ChangeFloatingObjectAbsolutePositionCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[FloatingObjectAbsolutePositionSettings]
object ChangeFloatingObjectAbsolutePositionCommand {
  
  inline def apply(
    execute: FloatingObjectAbsolutePositionSettings => Boolean,
    getState: CallbackTo[CommandState[FloatingObjectAbsolutePositionSettings]]
  ): ChangeFloatingObjectAbsolutePositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeFloatingObjectAbsolutePositionCommand]
  }
}
