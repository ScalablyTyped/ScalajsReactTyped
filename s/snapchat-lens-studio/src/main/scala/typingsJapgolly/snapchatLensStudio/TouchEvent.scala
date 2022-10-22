package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchEvent
  extends StObject
     with SceneObjectEvent {
  
  /** Returns the ID of this specific touch. Useful for distinguishing between touches when multiple are occurring simultaneously. */
  def getTouchId(): Double
  
  /** Returns the normalized 2D screen position of the user’s touch. The normalized coordinates range from ([0-1], [0-1]), (0,0) being top-left and (1,1) being bottom-right. */
  def getTouchPosition(): vec2
}
object TouchEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getSceneObject: CallbackTo[SceneObject],
    getTouchId: CallbackTo[Double],
    getTouchPosition: CallbackTo[vec2],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): TouchEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getSceneObject = getSceneObject.toJsFn, getTouchId = getTouchId.toJsFn, getTouchPosition = getTouchPosition.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TouchEvent]
  }
  
  extension [Self <: TouchEvent](x: Self) {
    
    inline def setGetTouchId(value: CallbackTo[Double]): Self = StObject.set(x, "getTouchId", value.toJsFn)
    
    inline def setGetTouchPosition(value: CallbackTo[vec2]): Self = StObject.set(x, "getTouchPosition", value.toJsFn)
  }
}
