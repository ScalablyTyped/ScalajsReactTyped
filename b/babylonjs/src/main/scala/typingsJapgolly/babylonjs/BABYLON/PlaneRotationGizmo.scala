package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.babylonjs.anon.RotationMesh
import typingsJapgolly.babylonjs.anon.SnapDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babylonjs.BABYLON.IDisposable because Already inherited
- typingsJapgolly.babylonjs.BABYLON.IGizmo because Already inherited
- typingsJapgolly.babylonjs.BABYLON.IPlaneRotationGizmo because var conflicts: _rootMesh, attachedMesh, attachedNode, customRotationQuaternion, gizmoLayer, isHovered, scaleRatio, updateGizmoPositionToMatchAttachedMesh, updateGizmoRotationToMatchAttachedMesh, updateScale. Inlined dragBehavior, snapDistance, onSnapObservable, angle, isEnabled */ @js.native
trait PlaneRotationGizmo
  extends StObject
     with Gizmo {
  
  /* protected */ var _angles: Vector3 = js.native
  
  /* protected */ var _coloredMaterial: StandardMaterial = js.native
  
  /**
    * Create Geometry for Gizmo
    * @param parentMesh
    * @param thickness
    * @param tessellation
    */
  /* protected */ def _createGizmoMesh(parentMesh: AbstractMesh, thickness: Double, tessellation: Double): RotationMesh = js.native
  
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
