package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.anon.SnapDistance
import typingsJapgolly.babylonjs.behaviorsMeshesPointerDragBehaviorMod.PointerDragBehavior
import typingsJapgolly.babylonjs.eventsPointerEventsMod.PointerInfo
import typingsJapgolly.babylonjs.gizmosGizmoMod.Gizmo
import typingsJapgolly.babylonjs.gizmosGizmoMod.IGizmo
import typingsJapgolly.babylonjs.gizmosPositionGizmoMod.PositionGizmo
import typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.meshesTransformNodeMod.TransformNode
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.miscObservableMod.Observer
import typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosAxisDragGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.babylonjs.sceneMod.IDisposable because Already inherited
  - typingsJapgolly.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typingsJapgolly.babylonjs.gizmosAxisDragGizmoMod.IAxisDragGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined dragBehavior, snapDistance, onSnapObservable, isEnabled */ @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo")
  @js.native
  open class AxisDragGizmo protected () extends Gizmo {
    /**
      * Creates an AxisDragGizmo
      * @param dragAxis The axis which the gizmo will be able to drag on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param parent
      * @param thickness display gizmo axis thickness
      */
    def this(dragAxis: Vector3) = this()
    def this(dragAxis: Vector3, color: Color3) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Nullable[PositionGizmo]) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Nullable[PositionGizmo]) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Nullable[PositionGizmo]) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo]
    ) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: Unit,
      parent: Nullable[PositionGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Unit, gizmoLayer: UtilityLayerRenderer, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Unit,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo],
      thickness: Double
    ) = this()
    def this(dragAxis: Vector3, color: Color3, gizmoLayer: Unit, parent: Unit, thickness: Double) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: Unit,
      parent: Nullable[PositionGizmo],
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Unit,
      thickness: Double
    ) = this()
    def this(
      dragAxis: Vector3,
      color: Color3,
      gizmoLayer: UtilityLayerRenderer,
      parent: Nullable[PositionGizmo],
      thickness: Double
    ) = this()
    
    /* protected */ var _coloredMaterial: StandardMaterial = js.native
    
    /* protected */ var _disableMaterial: StandardMaterial = js.native
    
    /* protected */ var _dragging: Boolean = js.native
    
    /* protected */ var _gizmoMesh: Mesh = js.native
    
    /* protected */ var _hoverMaterial: StandardMaterial = js.native
    
    /* protected */ var _isEnabled: Boolean = js.native
    
    /* protected */ var _parent: Nullable[PositionGizmo] = js.native
    
    /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
    
    /**
      * Drag behavior responsible for the gizmos dragging interactions
      */
    var dragBehavior: PointerDragBehavior = js.native
    
    def isEnabled: Boolean = js.native
    /**
      * If the gizmo is enabled
      */
    def isEnabled_=(value: Boolean): Unit = js.native
    /** If the gizmo is enabled */
    @JSName("isEnabled")
    var isEnabled_FAxisDragGizmo: Boolean = js.native
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance] = js.native
    
    /**
      * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
      */
    var snapDistance: Double = js.native
  }
  /* static members */
  object AxisDragGizmo {
    
    @JSImport("babylonjs/Gizmos/axisDragGizmo", "AxisDragGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    inline def _CreateArrow(scene: Scene, material: StandardMaterial): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Double, isCollider: Boolean): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    inline def _CreateArrow(scene: Scene, material: StandardMaterial, thickness: Unit, isCollider: Boolean): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrow")(scene.asInstanceOf[js.Any], material.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], isCollider.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
    
    /**
      * @internal
      */
    inline def _CreateArrowInstance(scene: Scene, arrow: TransformNode): TransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("_CreateArrowInstance")(scene.asInstanceOf[js.Any], arrow.asInstanceOf[js.Any])).asInstanceOf[TransformNode]
  }
  
  trait IAxisDragGizmo
    extends StObject
       with IGizmo {
    
    /** Drag behavior responsible for the gizmos dragging interactions */
    var dragBehavior: PointerDragBehavior
    
    /** If the gizmo is enabled */
    var isEnabled: Boolean
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance]
    
    /** Drag distance in babylon units that the gizmo will snap to when dragged */
    var snapDistance: Double
  }
  object IAxisDragGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      dispose: Callback,
      dragBehavior: PointerDragBehavior,
      gizmoLayer: UtilityLayerRenderer,
      isEnabled: Boolean,
      isHovered: Boolean,
      onSnapObservable: Observable[SnapDistance],
      scaleRatio: Double,
      setCustomMesh: Mesh => Callback,
      snapDistance: Double,
      updateGizmoPositionToMatchAttachedMesh: Boolean,
      updateGizmoRotationToMatchAttachedMesh: Boolean,
      updateScale: Boolean
    ): IAxisDragGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], dispose = dispose.toJsFn, dragBehavior = dragBehavior.asInstanceOf[js.Any], gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onSnapObservable = onSnapObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1((t0: Mesh) => setCustomMesh(t0).runNow()), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IAxisDragGizmo]
    }
    
    extension [Self <: IAxisDragGizmo](x: Self) {
      
      inline def setDragBehavior(value: PointerDragBehavior): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnSnapObservable(value: Observable[SnapDistance]): Self = StObject.set(x, "onSnapObservable", value.asInstanceOf[js.Any])
      
      inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
    }
  }
}
