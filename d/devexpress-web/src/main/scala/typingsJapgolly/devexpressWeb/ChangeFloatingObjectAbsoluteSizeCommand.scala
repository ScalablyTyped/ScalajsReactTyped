package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change a floating object's absolute size.
  */
trait ChangeFloatingObjectAbsoluteSizeCommand
  extends StObject
     with ChangeFloatingObjectPropertyCommandBase[FloatingObjectAbsoluteSizeSettings]
object ChangeFloatingObjectAbsoluteSizeCommand {
  
  inline def apply(
    execute: FloatingObjectAbsoluteSizeSettings => Boolean,
    getState: CallbackTo[CommandState[FloatingObjectAbsoluteSizeSettings]]
  ): ChangeFloatingObjectAbsoluteSizeCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[ChangeFloatingObjectAbsoluteSizeCommand]
  }
}
