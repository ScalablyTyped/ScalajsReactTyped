package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "AxisDragGizmo")
@js.native
open class AxisDragGizmo protected ()
  extends typingsJapgolly.babylonjs.gizmosIndexMod.AxisDragGizmo {
  /**
    * Creates an AxisDragGizmo
    * @param dragAxis The axis which the gizmo will be able to drag on
    * @param color The color of the gizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param parent
    * @param thickness display gizmo axis thickness
    */
  def this(dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo]
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: Unit,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: Unit,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: Unit,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: Unit,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Unit,
    thickness: Double
  ) = this()
  def this(
    dragAxis: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    color: typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3,
    gizmoLayer: typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer,
    parent: Nullable[typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo],
    thickness: Double
  ) = this()
}
/* static members */
object AxisDragGizmo {
  
  @JSImport("babylonjs/index", "AxisDragGizmo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _CreateArrow(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    material: typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial
  ): typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    material: typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial,
    thickness: Double
  ): typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    material: typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial,
    thickness: Double,
    isCollider: Boolean
  ): typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode]
  inline def _CreateArrow(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    material: typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial,
    thickness: Unit,
    isCollider: Boolean
  ): typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode]
  
  /**
    * @internal
    */
  inline def _CreateArrowInstance(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    arrow: typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode
  ): typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrowInstance")(scene.asInstanceOf[js.Any], arrow.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode]
}
