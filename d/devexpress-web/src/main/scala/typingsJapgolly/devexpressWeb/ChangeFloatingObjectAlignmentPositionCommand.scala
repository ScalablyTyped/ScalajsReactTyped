package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to modify a floating object's alignment position.
  */
trait ChangeFloatingObjectAlignmentPositionCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[FloatingObjectAlignmentPositionSettings]
object ChangeFloatingObjectAlignmentPositionCommand {
  
  inline def apply(
    execute: FloatingObjectAlignmentPositionSettings => Boolean,
    getState: CallbackTo[CommandState[FloatingObjectAlignmentPositionSettings]]
  ): ChangeFloatingObjectAlignmentPositionCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeFloatingObjectAlignmentPositionCommand]
  }
}
