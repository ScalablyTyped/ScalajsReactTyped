package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** If a DeviceTracking component is present in the scene, this event is triggered when the tracking is restarted (typically when the Lens starts, or if the user taps the ground). */
trait SurfaceTrackingResetEvent
  extends StObject
     with SceneEvent[SurfaceTrackingResetEvent]
object SurfaceTrackingResetEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[SurfaceTrackingResetEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): SurfaceTrackingResetEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[SurfaceTrackingResetEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[SurfaceTrackingResetEvent]
  }
}
