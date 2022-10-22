package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoseEnabledController
  extends StObject
     with Gamepad
     with PoseControlled {
  
  /* protected */ var _calculatedPosition: Vector3 = js.native
  
  /* private */ var _calculatedRotation: Any = js.native
  
  /* private */ var _deviceRoomPosition: Any = js.native
  
  /* private */ var _deviceRoomRotationQuaternion: Any = js.native
  
  /**
    * Internal, matrix used to convert room space to babylon space
    * @internal
    */
  var _deviceToWorld: Matrix = js.native
  
  /**
    * @internal
    */
  def _disableTrackPosition(fixedPosition: Vector3): Unit = js.native
  
  /* private */ var _draggedRoomRotation: Any = js.native
  
  /* private */ var _leftHandSystemQuaternion: Any = js.native
  
  /* private */ var _maxRotationDistFromHeadset: Any = js.native
  
  /**
    * Internal, the mesh attached to the controller
    * @internal
    */
  var _mesh: Nullable[AbstractMesh] = js.native
  
  /**
    * @internal
    */
  var _meshAttachedObservable: Observable[AbstractMesh] = js.native
  
  /**
    * Node to be used when casting a ray from the controller
    * @internal
    */
  var _pointingPoseNode: Nullable[TransformNode] = js.native
  
  /* private */ var _poseControlledCamera: Any = js.native
  
  /* private */ var _trackPosition: Any = js.native
  
  /**
    * Updates only the pose device and mesh without doing any button event checking
    */
  /* protected */ def _updatePoseAndMesh(): Unit = js.native
  
  /* private */ var _workingMatrix: Any = js.native
  
  /**
    * Attaches a mesh to the controller
    * @param mesh the mesh to be attached
    */
  def attachToMesh(mesh: AbstractMesh): Unit = js.native
  
  /**
    * Attaches the controllers mesh to a camera
    * @param camera the camera the mesh should be attached to
    */
  def attachToPoseControlledCamera(camera: TargetCamera): Unit = js.native
  
  /**
    * The type of controller (Eg. Windows mixed reality)
    */
  var controllerType: PoseEnabledControllerType = js.native
  
  /**
    * The device position in babylon space
    */
  @JSName("devicePosition")
  var devicePosition_PoseEnabledController: Vector3 = js.native
  
  /**
    * Gets the ray of the controller in the direction the controller is pointing
    * @param length the length the resulting ray should be
    * @returns a ray in the direction the controller is pointing
    */
  def getForwardRay(): Ray = js.native
  def getForwardRay(length: Double): Ray = js.native
  
  /**
    * If the controller is used in a webXR session
    */
  var isXR: Boolean = js.native
  
  /**
    * The mesh that is attached to the controller
    */
  def mesh: Nullable[AbstractMesh] = js.native
  
  /**
    * The raw pose from the device
    */
  @JSName("rawPose")
  var rawPose_PoseEnabledController: DevicePose = js.native
}
