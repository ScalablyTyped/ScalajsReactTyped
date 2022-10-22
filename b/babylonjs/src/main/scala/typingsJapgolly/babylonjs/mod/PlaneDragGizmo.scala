package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PlaneDragGizmo")
@js.native
open class PlaneDragGizmo protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.PlaneDragGizmo {
  /**
    * Creates a PlaneDragGizmo
    * @param dragPlaneNormal The axis normal to which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param parent
    */
  def this(dragPlaneNormal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    dragPlaneNormal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3
  ) = this()
  def this(
    dragPlaneNormal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragPlaneNormal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragPlaneNormal: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
}
/* static members */
object PlaneDragGizmo {
  
  @JSImport("babylonjs", "PlaneDragGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _CreatePlane(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    material: typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial
  ): typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreatePlane")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode]
}
