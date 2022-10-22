package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This event is triggered when the user taps on the screen. */
trait TapEvent
  extends StObject
     with SceneObjectEvent {
  
  /** Returns the normalized 2D screen position of the user’s tap. The normalized coordinates range from ([0-1], [0-1]), (0,0) being top-left and (1,1) being bottom-right. */
  def getTapPosition(): vec2
}
object TapEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getSceneObject: CallbackTo[SceneObject],
    getTapPosition: CallbackTo[vec2],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): TapEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getSceneObject = getSceneObject.toJsFn, getTapPosition = getTapPosition.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TapEvent]
  }
  
  extension [Self <: TapEvent](x: Self) {
    
    inline def setGetTapPosition(value: CallbackTo[vec2]): Self = StObject.set(x, "getTapPosition", value.toJsFn)
  }
}
