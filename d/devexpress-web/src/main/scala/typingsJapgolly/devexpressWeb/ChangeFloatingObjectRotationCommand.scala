package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to rotate a floating object.
  */
trait ChangeFloatingObjectRotationCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[Double]
object ChangeFloatingObjectRotationCommand {
  
  inline def apply(execute: Double => Boolean, getState: CallbackTo[CommandState[Double]]): ChangeFloatingObjectRotationCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeFloatingObjectRotationCommand]
  }
}
