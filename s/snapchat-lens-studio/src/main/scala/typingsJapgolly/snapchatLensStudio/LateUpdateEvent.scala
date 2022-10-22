package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This event is triggered at the end of every frame, after normal UpdateEvents trigger but before rendering occurs. */
trait LateUpdateEvent
  extends StObject
     with SceneEvent[LateUpdateEvent] {
  
  /** Returns the time elapsed ( seconds: in) between the current frame and previous frame. */
  def getDeltaTime(): Double
}
object LateUpdateEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[LateUpdateEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getDeltaTime: CallbackTo[Double],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): LateUpdateEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[LateUpdateEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getDeltaTime = getDeltaTime.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[LateUpdateEvent]
  }
  
  extension [Self <: LateUpdateEvent](x: Self) {
    
    inline def setGetDeltaTime(value: CallbackTo[Double]): Self = StObject.set(x, "getDeltaTime", value.toJsFn)
  }
}
