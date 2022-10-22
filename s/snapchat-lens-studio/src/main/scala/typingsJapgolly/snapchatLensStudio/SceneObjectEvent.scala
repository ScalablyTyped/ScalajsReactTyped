package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class for all object-based Event types in Lens Studio (ManipulateStartEvent, TapEvent, etc.). */
trait SceneObjectEvent
  extends StObject
     with SceneEvent[SceneObjectEvent] {
  
  /** Returns the SceneObject this Event is associated with. */
  def getSceneObject(): SceneObject
}
object SceneObjectEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getSceneObject: CallbackTo[SceneObject],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): SceneObjectEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getSceneObject = getSceneObject.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[SceneObjectEvent]
  }
  
  extension [Self <: SceneObjectEvent](x: Self) {
    
    inline def setGetSceneObject(value: CallbackTo[SceneObject]): Self = StObject.set(x, "getSceneObject", value.toJsFn)
  }
}
