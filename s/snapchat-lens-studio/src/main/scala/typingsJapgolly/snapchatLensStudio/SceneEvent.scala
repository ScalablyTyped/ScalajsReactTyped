package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The base class for scenewide events. SceneEvents can be created using ScriptComponent’s createEvent method. */
trait SceneEvent[T /* <: SceneEvent[Any] */]
  extends StObject
     with ScriptObject {
  
  /** Binds a callback function to this event. */
  @JSName("bind")
  def bind_enabled(evCallback: js.Function1[/* eventData */ Omit[T, enabled], Unit]): Unit
  
  /** If true, the event is able to trigger. If false, the event will not trigger. */
  var enabled: Boolean
}
object SceneEvent {
  
  inline def apply[T /* <: SceneEvent[Any] */](
    bind: js.Function1[/* eventData */ Omit[T, enabled], Unit] => Callback,
    enabled: Boolean,
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): SceneEvent[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[T, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[SceneEvent[T]]
  }
  
  extension [Self <: SceneEvent[?], T /* <: SceneEvent[Any] */](x: Self & SceneEvent[T]) {
    
    inline def setBind(value: js.Function1[/* eventData */ Omit[T, enabled], Unit] => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[T, enabled], Unit]) => value(t0).runNow()))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
