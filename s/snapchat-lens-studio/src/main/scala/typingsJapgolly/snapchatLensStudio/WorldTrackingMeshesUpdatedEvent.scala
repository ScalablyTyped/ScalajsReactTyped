package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when world tracking meshes are updated. Only available when a Device Tracking component is in the scene, and world mesh tracking is supported and enabled. */
trait WorldTrackingMeshesUpdatedEvent
  extends StObject
     with SceneEvent[WorldTrackingMeshesUpdatedEvent] {
  
  /** Returns an array of TrackedMeshes that were updated. */
  def getMeshes(): js.Array[TrackedMesh]
}
object WorldTrackingMeshesUpdatedEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[WorldTrackingMeshesUpdatedEvent, enabled], Unit] => Callback,
    enabled: Boolean,
    getMeshes: CallbackTo[js.Array[TrackedMesh]],
    getTypeName: CallbackTo[String],
    isOfType: String => Boolean
  ): WorldTrackingMeshesUpdatedEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1((t0: js.Function1[/* eventData */ Omit[WorldTrackingMeshesUpdatedEvent, enabled], Unit]) => bind(t0).runNow()), enabled = enabled.asInstanceOf[js.Any], getMeshes = getMeshes.toJsFn, getTypeName = getTypeName.toJsFn, isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[WorldTrackingMeshesUpdatedEvent]
  }
  
  extension [Self <: WorldTrackingMeshesUpdatedEvent](x: Self) {
    
    inline def setGetMeshes(value: CallbackTo[js.Array[TrackedMesh]]): Self = StObject.set(x, "getMeshes", value.toJsFn)
  }
}
