package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to lock a floating object's aspect ratio.
  */
trait ChangeFloatingObjectLockAspectRatioCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[Boolean]
object ChangeFloatingObjectLockAspectRatioCommand {
  
  inline def apply(execute: Boolean => Boolean, getState: CallbackTo[CommandState[Boolean]]): ChangeFloatingObjectLockAspectRatioCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeFloatingObjectLockAspectRatioCommand]
  }
}
