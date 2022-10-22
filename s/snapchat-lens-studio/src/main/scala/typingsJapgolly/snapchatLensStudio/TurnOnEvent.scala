package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when the lens turns on. */
trait TurnOnEvent
  extends StObject
     with SceneEvent[TurnOnEvent]
object TurnOnEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[TurnOnEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): TurnOnEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[TurnOnEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TurnOnEvent]
  }
}
