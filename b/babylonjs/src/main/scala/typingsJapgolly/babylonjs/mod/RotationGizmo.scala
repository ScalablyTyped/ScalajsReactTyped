package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.gizmosRotationGizmoMod.RotationGizmoOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RotationGizmo")
@js.native
open class RotationGizmo protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.RotationGizmo {
  /**
    * Creates a RotationGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param tessellation Amount of tessellation to be used when creating rotation circles
    * @param useEulerRotation Use and update Euler angle instead of quaternion
    * @param thickness display gizmo axis thickness
    * @param gizmoManager Gizmo manager
    * @param options More options
    */
  def this(
    gizmoLayer: js.UndefOr[typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer],
    tessellation: js.UndefOr[Double],
    useEulerRotation: js.UndefOr[Boolean],
    thickness: js.UndefOr[Double],
    gizmoManager: js.UndefOr[typingsJapgolly.babylonjs.gizmosGizmoManagerMod.GizmoManager],
    options: js.UndefOr[RotationGizmoOptions]
  ) = this()
}
