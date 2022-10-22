package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILightGizmo
  extends StObject
     with IGizmo {
  
  /** The light that the gizmo is attached to */
  var light: Nullable[Light]
  
  /** The material used to render the light gizmo */
  val material: StandardMaterial
  
  /** Event that fires each time the gizmo is clicked */
  var onClickedObservable: Observable[Light]
}
object ILightGizmo {
  
  inline def apply(
    _rootMesh: Mesh,
    dispose: Callback,
    gizmoLayer: UtilityLayerRenderer,
    isHovered: Boolean,
    material: StandardMaterial,
    onClickedObservable: Observable[Light],
    scaleRatio: Double,
    setCustomMesh: Mesh => Callback,
    updateGizmoPositionToMatchAttachedMesh: Boolean,
    updateGizmoRotationToMatchAttachedMesh: Boolean,
    updateScale: Boolean
  ): ILightGizmo = {
    val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], dispose = dispose.toJsFn, gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], onClickedObservable = onClickedObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1((t0: Mesh) => setCustomMesh(t0).runNow()), updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null, light = null)
    __obj.asInstanceOf[ILightGizmo]
  }
  
  extension [Self <: ILightGizmo](x: Self) {
    
    inline def setLight(value: Nullable[Light]): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightNull: Self = StObject.set(x, "light", null)
    
    inline def setMaterial(value: StandardMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setOnClickedObservable(value: Observable[Light]): Self = StObject.set(x, "onClickedObservable", value.asInstanceOf[js.Any])
  }
}
