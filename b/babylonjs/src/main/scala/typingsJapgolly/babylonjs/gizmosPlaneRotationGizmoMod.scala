package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.anon.Collider
import typingsJapgolly.babylonjs.anon.SnapDistance
import typingsJapgolly.babylonjs.behaviorsMeshesPointerDragBehaviorMod.PointerDragBehavior
import typingsJapgolly.babylonjs.eventsPointerEventsMod.PointerInfo
import typingsJapgolly.babylonjs.gizmosGizmoMod.Gizmo
import typingsJapgolly.babylonjs.gizmosGizmoMod.IGizmo
import typingsJapgolly.babylonjs.gizmosRotationGizmoMod.RotationGizmo
import typingsJapgolly.babylonjs.materialsShaderMaterialMod.ShaderMaterial
import typingsJapgolly.babylonjs.materialsStandardMaterialMod.StandardMaterial
import typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.miscObservableMod.Observer
import typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gizmosPlaneRotationGizmoMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.babylonjs.sceneMod.IDisposable because Already inherited
  - typingsJapgolly.babylonjs.gizmosGizmoMod.IGizmo because Already inherited
  - typingsJapgolly.babylonjs.gizmosPlaneRotationGizmoMod.IPlaneRotationGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined dragBehavior, snapDistance, onSnapObservable, angle, isEnabled */ @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo")
  @js.native
  open class PlaneRotationGizmo protected () extends Gizmo {
    /**
      * Creates a PlaneRotationGizmo
      * @param planeNormal The normal of the plane which the gizmo will be able to rotate on
      * @param color The color of the gizmo
      * @param gizmoLayer The utility layer the gizmo will be added to
      * @param tessellation Amount of tessellation to be used when creating rotation circles
      * @param parent
      * @param useEulerRotation Use and update Euler angle instead of quaternion
      * @param thickness display gizmo axis thickness
      */
    def this(
      planeNormal: Vector3,
      color: js.UndefOr[Color3],
      gizmoLayer: js.UndefOr[UtilityLayerRenderer],
      tessellation: js.UndefOr[Double],
      parent: js.UndefOr[Nullable[RotationGizmo]],
      useEulerRotation: js.UndefOr[Boolean],
      thickness: js.UndefOr[Double]
    ) = this()
    
    /* protected */ var _angles: Vector3 = js.native
    
    /* protected */ var _coloredMaterial: StandardMaterial = js.native
    
    /**
      * Create Geometry for Gizmo
      * @param parentMesh
      * @param thickness
      * @param tessellation
      */
    /* protected */ def _createGizmoMesh(parentMesh: AbstractMesh, thickness: Double, tessellation: Double): Collider = js.native
    
    /* protected */ var _disableMaterial: StandardMaterial = js.native
    
    /* protected */ var _dragging: Boolean = js.native
    
    /* protected */ var _gizmoMesh: Mesh = js.native
    
    /* protected */ var _hoverMaterial: StandardMaterial = js.native
    
    /* protected */ var _isEnabled: Boolean = js.native
    
    /* protected */ var _parent: Nullable[RotationGizmo] = js.native
    
    /* protected */ var _pointerObserver: Nullable[Observer[PointerInfo]] = js.native
    
    /* protected */ var _rotationDisplayPlane: Mesh = js.native
    
    /* protected */ var _rotationShaderMaterial: ShaderMaterial = js.native
    
    /**
      * Accumulated relative angle value for rotation on the axis. Reset to 0 when a dragStart occurs
      */
    var angle: Double = js.native
    
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
    var isEnabled_FPlaneRotationGizmo: Boolean = js.native
    
    /**
      * Event that fires each time the gizmo snaps to a new location.
      * * snapDistance is the the change in distance
      */
    var onSnapObservable: Observable[SnapDistance] = js.native
    
    /**
      * Rotation distance in radians that the gizmo will snap to (Default: 0)
      */
    var snapDistance: Double = js.native
  }
  /* static members */
  object PlaneRotationGizmo {
    
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The maximum angle between the camera and the rotation allowed for interaction
      * If a rotation plane appears 'flat', a lower value allows interaction.
      */
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo.MaxDragAngle")
    @js.native
    def MaxDragAngle: Double = js.native
    inline def MaxDragAngle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxDragAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo._RotationGizmoFragmentShader")
    @js.native
    def _RotationGizmoFragmentShader: String = js.native
    inline def _RotationGizmoFragmentShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationGizmoFragmentShader")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/planeRotationGizmo", "PlaneRotationGizmo._RotationGizmoVertexShader")
    @js.native
    def _RotationGizmoVertexShader: String = js.native
    inline def _RotationGizmoVertexShader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RotationGizmoVertexShader")(x.asInstanceOf[js.Any])
  }
  
  trait IPlaneRotationGizmo
    extends StObject
       with IGizmo {
    
    /** Accumulated relative angle value for rotation on the axis. */
    var angle: Double
    
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
  object IPlaneRotationGizmo {
    
    inline def apply(
      _rootMesh: Mesh,
      angle: Double,
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
    ): IPlaneRotationGizmo = {
      val __obj = js.Dynamic.literal(_rootMesh = _rootMesh.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], dispose = dispose.toJsFn, dragBehavior = dragBehavior.asInstanceOf[js.Any], gizmoLayer = gizmoLayer.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], onSnapObservable = onSnapObservable.asInstanceOf[js.Any], scaleRatio = scaleRatio.asInstanceOf[js.Any], setCustomMesh = js.Any.fromFunction1((t0: Mesh) => setCustomMesh(t0).runNow()), snapDistance = snapDistance.asInstanceOf[js.Any], updateGizmoPositionToMatchAttachedMesh = updateGizmoPositionToMatchAttachedMesh.asInstanceOf[js.Any], updateGizmoRotationToMatchAttachedMesh = updateGizmoRotationToMatchAttachedMesh.asInstanceOf[js.Any], updateScale = updateScale.asInstanceOf[js.Any], attachedMesh = null, attachedNode = null, customRotationQuaternion = null)
      __obj.asInstanceOf[IPlaneRotationGizmo]
    }
    
    extension [Self <: IPlaneRotationGizmo](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setDragBehavior(value: PointerDragBehavior): Self = StObject.set(x, "dragBehavior", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setOnSnapObservable(value: Observable[SnapDistance]): Self = StObject.set(x, "onSnapObservable", value.asInstanceOf[js.Any])
      
      inline def setSnapDistance(value: Double): Self = StObject.set(x, "snapDistance", value.asInstanceOf[js.Any])
    }
  }
}
