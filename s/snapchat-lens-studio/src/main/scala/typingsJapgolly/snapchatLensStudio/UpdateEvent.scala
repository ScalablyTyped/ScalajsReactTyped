package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered every frame. */
trait UpdateEvent
  extends StObject
     with SceneEvent[UpdateEvent] {
  
  /** Returns the time elapsed ( seconds: in) between the current frame and previous frame. */
  def getDeltaTime(): Double
}
object UpdateEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[UpdateEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getDeltaTime: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[UpdateEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getDeltaTime = getDeltaTime.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[UpdateEvent]
  }
  
  extension [Self <: UpdateEvent](x: Self) {
    
    inline def setGetDeltaTime(value: CallbackTo[Double]): Self = StObject.set(x, "getDeltaTime", value.toJsFn)
  }
}
