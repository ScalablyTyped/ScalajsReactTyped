package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when some world tracking meshes are no longer detected. Only available when a Device Tracking component is in the scene, and world mesh tracking is supported and enabled. */
trait WorldTrackingMeshesRemovedEvent
  extends StObject
     with SceneEvent[WorldTrackingMeshesRemovedEvent] {
  
  /** Returns an array of TrackedMeshes that are no longer detected. */
  def getMeshes(): js.Array[TrackedMesh]
}
object WorldTrackingMeshesRemovedEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[WorldTrackingMeshesRemovedEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getMeshes: CallbackTo[js.Array[TrackedMesh]],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): WorldTrackingMeshesRemovedEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[WorldTrackingMeshesRemovedEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getMeshes = getMeshes.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[WorldTrackingMeshesRemovedEvent]
  }
  
  extension [Self <: WorldTrackingMeshesRemovedEvent](x: Self) {
    
    inline def setGetMeshes(value: CallbackTo[js.Array[TrackedMesh]]): Self = StObject.set(x, "getMeshes", value.toJsFn)
  }
}
