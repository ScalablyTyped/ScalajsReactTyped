package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera
  extends StObject
     with Node {
  
  /* private */ var _absoluteRotation: Any = js.native
  
  /** @internal */
  var _activeMeshes: SmartArray[AbstractMesh] = js.native
  
  /** @internal */
  var _cameraRigParams: Any = js.native
  
  /* private */ var _cascadePostProcessesToRigCams: Any = js.native
  
  /** @internal */
  def _checkInputs(): Unit = js.native
  
  /** @internal */
  var _computedViewMatrix: Matrix = js.native
  
  /* private */ var _doNotComputeProjectionMatrix: Any = js.native
  
  /* private */ var _frustumPlanes: Any = js.native
  
  /**
    * Internal, gets the first post process.
    * @returns the first post process to be run on this camera.
    */
  def _getFirstPostProcess(): Nullable[PostProcess] = js.native
  
  /** @internal */
  def _getVRProjectionMatrix(): Matrix = js.native
  
  /** @internal */
  def _getViewMatrix(): Matrix = js.native
  
  /**
    * This function MUST be overwritten by the different WebVR cameras available.
    * The context in which it is running is the RIG camera. So 'this' is the TargetCamera, left or right.
    * @internal
    */
  def _getWebVRProjectionMatrix(): Matrix = js.native
  
  /**
    * This function MUST be overwritten by the different WebVR cameras available.
    * The context in which it is running is the RIG camera. So 'this' is the TargetCamera, left or right.
    * @internal
    */
  def _getWebVRViewMatrix(): Matrix = js.native
  
  /* protected */ var _globalPosition: Vector3 = js.native
  
  /** @internal */
  val _isCamera: /* true */ Boolean = js.native
  
  /** @internal */
  var _isLeftCamera: Boolean = js.native
  
  /** @internal */
  var _isRightCamera: Boolean = js.native
  
  /** @internal */
  def _isSynchronizedProjectionMatrix(): Boolean = js.native
  
  /** @internal */
  def _isSynchronizedViewMatrix(): Boolean = js.native
  
  /**
    * Define the mode of the camera (Camera.PERSPECTIVE_CAMERA or Camera.ORTHOGRAPHIC_CAMERA)
    */
  /* private */ var _mode: Any = js.native
  
  /**
    * @internal
    * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
    */
  var _multiviewTexture: Nullable[RenderTargetTexture] = js.native
  
  /**
    * Define the current limit on the bottom side for an orthographic camera
    * In scene unit
    */
  /* private */ var _orthoBottom: Any = js.native
  
  /**
    * Define the current limit on the left side for an orthographic camera
    * In scene unit
    */
  /* private */ var _orthoLeft: Any = js.native
  
  /**
    * Define the current limit on the right side for an orthographic camera
    * In scene unit
    */
  /* private */ var _orthoRight: Any = js.native
  
  /**
    * Define the current limit on the top side for an orthographic camera
    * In scene unit
    */
  /* private */ var _orthoTop: Any = js.native
  
  /** @internal */
  var _position: Vector3 = js.native
  
  /** @internal */
  var _postProcesses: js.Array[Nullable[PostProcess]] = js.native
  
  /** @internal */
  var _projectionMatrix: Matrix = js.native
  
  /* private */ var _refreshFrustumPlanes: Any = js.native
  
  /**
    * @internal
    * For WebXR cameras that are rendering to multiview texture arrays.
    */
  var _renderingMultiview: Boolean = js.native
  
  /**
    * @internal
    * ensures the multiview texture of the camera exists and has the specified width/height
    * @param width height to set on the multiview texture
    * @param height width to set on the multiview texture
    */
  def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit = js.native
  
  /**
    * Restores the camera state values if it has been stored. You must call storeState() first
    */
  /* protected */ def _restoreStateValues(): Boolean = js.native
  
  /** @internal */
  var _rigCameras: js.Array[Camera] = js.native
  
  /** @internal */
  var _rigPostProcess: Nullable[PostProcess] = js.native
  
  /* protected */ def _setRigMode(rigParams: Any): Unit = js.native
  
  /** @internal */
  def _setupInputs(): Unit = js.native
  
  /** @internal */
  var _skipRendering: Boolean = js.native
  
  /* private */ var _stateStored: Any = js.native
  
  /* private */ var _storedFov: Any = js.native
  
  /* private */ var _transformMatrix: Any = js.native
  
  /* protected */ var _upVector: Vector3 = js.native
  
  /* protected */ def _updateCameraRotationMatrix(): Unit = js.native
  
  /* private */ var _updateFrustumPlanes: Any = js.native
  
  /**
    * May need to be overridden by children
    * @internal
    */
  def _updateRigCameras(): Unit = js.native
  
  /* protected */ def _updateWebVRCameraRotationMatrix(): Unit = js.native
  
  /**
    * @internal
    * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
    */
  var _useMultiviewToSingleView: Boolean = js.native
  
  /* protected */ var _webvrViewMatrix: Matrix = js.native
  
  /**
    * Returns the current camera absolute rotation
    */
  def absoluteRotation: Quaternion = js.native
  
  /**
    * Automatically tilts the projection plane, using `projectionPlaneTilt`, to correct the perspective effect on vertical lines.
    */
  def applyVerticalCorrection(): Unit = js.native
  
  /**
    * Attach the input controls to a specific dom element to get the input from.
    * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
    */
  def attachControl(): Unit = js.native
  /**
    * Attach the input controls to a specific dom element to get the input from.
    * @param ignored defines an ignored parameter kept for backward compatibility.
    * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
    * BACK COMPAT SIGNATURE ONLY.
    */
  def attachControl(ignored: Any): Unit = js.native
  def attachControl(ignored: Any, noPreventDefault: Boolean): Unit = js.native
  def attachControl(noPreventDefault: Boolean): Unit = js.native
  
  /**
    * Attach a post process to the camera.
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#attach-postprocess
    * @param postProcess The post process to attach to the camera
    * @param insertAt The position of the post process in case several of them are in use in the scene
    * @returns the position the post process has been inserted at
    */
  def attachPostProcess(postProcess: PostProcess): Double = js.native
  def attachPostProcess(postProcess: PostProcess, insertAt: Nullable[Double]): Double = js.native
  
  /**
    * Rig mode of the camera.
    * This is useful to create the camera with two "eyes" instead of one to create VR or stereoscopic scenes.
    * This is normally controlled byt the camera themselves as internal use.
    */
  var cameraRigMode: Double = js.native
  
  /**
    * Clones the current camera.
    * @param name The cloned camera name
    * @param newParent The cloned camera's new parent (none by default)
    * @returns the cloned camera
    */
  def clone(name: String): Camera = js.native
  def clone(name: String, newParent: Nullable[Node]): Camera = js.native
  
  /**
    * needs to be overridden by children so sub has required properties to be copied
    * @internal
    */
  def createRigCamera(name: String, cameraIndex: Double): Nullable[Camera] = js.native
  
  /**
    * Defines the list of custom render target which are rendered to and then used as the input to this camera's render. Eg. display another camera view on a TV in the main scene
    * This is pretty helpful if you wish to make a camera render to a texture you could reuse somewhere
    * else in the scene. (Eg. security camera)
    *
    * To change the final output target of the camera, camera.outputRenderTarget should be used instead (eg. webXR renders to a render target corresponding to an HMD)
    */
  var customRenderTargets: js.Array[RenderTargetTexture] = js.native
  
  /**
    * Detach the current controls from the specified dom element.
    */
  def detachControl(): Unit = js.native
  def detachControl(ignored: Any): Unit = js.native
  
  /**
    * Detach a post process to the camera.
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#attach-postprocess
    * @param postProcess The post process to detach from the camera
    */
  def detachPostProcess(postProcess: PostProcess): Unit = js.native
  
  /**
    * Field Of View is set in Radians. (default is 0.8)
    */
  var fov: Double = js.native
  
  /**
    * fovMode sets the camera frustum bounds to the viewport bounds. (default is FOVMODE_VERTICAL_FIXED)
    */
  var fovMode: Double = js.native
  
  /**
    * Freeze the projection matrix.
    * It will prevent the cache check of the camera projection compute and can speed up perf
    * if no parameter of the camera are meant to change
    * @param projection Defines manually a projection if necessary
    */
  def freezeProjectionMatrix(): Unit = js.native
  def freezeProjectionMatrix(projection: Matrix): Unit = js.native
  
  /**
    * Gets the list of active meshes this frame (meshes no culled or excluded by lod s in the frame)
    * @returns the active meshe list
    */
  def getActiveMeshes(): SmartArray[AbstractMesh] = js.native
  
  /**
    * Gets the direction of the camera relative to a given local axis.
    * @param localAxis Defines the reference axis to provide a relative direction.
    * @returns the direction
    */
  def getDirection(localAxis: Vector3): Vector3 = js.native
  
  /**
    * Gets the direction of the camera relative to a given local axis into a passed vector.
    * @param localAxis Defines the reference axis to provide a relative direction.
    * @param result Defines the vector to store the result in
    */
  def getDirectionToRef(localAxis: Vector3, result: Vector3): Unit = js.native
  
  /**
    * Gets a ray in the forward direction from the camera.
    * @param length Defines the length of the ray to create
    * @param transform Defines the transform to apply to the ray, by default the world matrix is used to create a workd space ray
    * @param origin Defines the start point of the ray which defaults to the camera position
    * @returns the forward ray
    */
  def getForwardRay(): Ray = js.native
  def getForwardRay(length: Double): Ray = js.native
  def getForwardRay(length: Double, transform: Unit, origin: Vector3): Ray = js.native
  def getForwardRay(length: Double, transform: Matrix): Ray = js.native
  def getForwardRay(length: Double, transform: Matrix, origin: Vector3): Ray = js.native
  def getForwardRay(length: Unit, transform: Unit, origin: Vector3): Ray = js.native
  def getForwardRay(length: Unit, transform: Matrix): Ray = js.native
  def getForwardRay(length: Unit, transform: Matrix, origin: Vector3): Ray = js.native
  
  /**
    * Gets a ray in the forward direction from the camera.
    * @param refRay the ray to (re)use when setting the values
    * @param length Defines the length of the ray to create
    * @param transform Defines the transform to apply to the ray, by default the world matrx is used to create a workd space ray
    * @param origin Defines the start point of the ray which defaults to the camera position
    * @returns the forward ray
    */
  def getForwardRayToRef(refRay: Ray): Ray = js.native
  def getForwardRayToRef(refRay: Ray, length: Double): Ray = js.native
  def getForwardRayToRef(refRay: Ray, length: Double, transform: Unit, origin: Vector3): Ray = js.native
  def getForwardRayToRef(refRay: Ray, length: Double, transform: Matrix): Ray = js.native
  def getForwardRayToRef(refRay: Ray, length: Double, transform: Matrix, origin: Vector3): Ray = js.native
  def getForwardRayToRef(refRay: Ray, length: Unit, transform: Unit, origin: Vector3): Ray = js.native
  def getForwardRayToRef(refRay: Ray, length: Unit, transform: Matrix): Ray = js.native
  def getForwardRayToRef(refRay: Ray, length: Unit, transform: Matrix, origin: Vector3): Ray = js.native
  
  /**
    * Gets the left camera target of a rig setup in case of Rigged Camera
    * @returns the target position
    */
  def getLeftTarget(): Nullable[Vector3] = js.native
  
  /**
    * Gets the current projection matrix of the camera.
    * @param force forces the camera to recompute the matrix without looking at the cached state
    * @returns the projection matrix
    */
  def getProjectionMatrix(): Matrix = js.native
  def getProjectionMatrix(force: Boolean): Matrix = js.native
  
  /**
    * Gets the right camera target of a rig setup in case of Rigged Camera
    * @returns the target position
    */
  def getRightTarget(): Nullable[Vector3] = js.native
  
  /**
    * Gets the transformation matrix (ie. the multiplication of view by projection matrices)
    * @returns a Matrix
    */
  def getTransformationMatrix(): Matrix = js.native
  
  /**
    * Gets the current view matrix of the camera.
    * @param force forces the camera to recompute the matrix without looking at the cached state
    * @returns the view matrix
    */
  def getViewMatrix(): Matrix = js.native
  def getViewMatrix(force: Boolean): Matrix = js.native
  
  /**
    * Gets the current world space position of the camera.
    */
  def globalPosition: Vector3 = js.native
  
  /**
    * Define the default inertia of the camera.
    * This helps giving a smooth feeling to the camera movement.
    */
  var inertia: Double = js.native
  
  /**
    * Define the input manager associated with the camera.
    */
  var inputs: CameraInputsManager[Camera] = js.native
  
  /**
    * Defines the distance between both "eyes" in case of a RIG
    */
  var interaxialDistance: Double = js.native
  
  /**
    * Check whether a mesh is part of the current active mesh list of the camera
    * @param mesh Defines the mesh to check
    * @returns true if active, false otherwise
    */
  def isActiveMesh(mesh: Mesh): Boolean = js.native
  
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this checks the full bounding box
    * @param target The object to check
    * @returns true if the object is in frustum otherwise false
    */
  def isCompletelyInFrustum(target: ICullable): Boolean = js.native
  
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * This checks the bounding box center. See isCompletelyInFrustum for a full bounding check
    * @param target The object to check
    * @param checkRigCameras If the rig cameras should be checked (eg. with webVR camera both eyes should be checked) (Default: false)
    * @returns true if the object is in frustum otherwise false
    */
  def isInFrustum(target: ICullable): Boolean = js.native
  def isInFrustum(target: ICullable, checkRigCameras: Boolean): Boolean = js.native
  
  /**
    * Define whether the camera is intermediate.
    * This is useful to not present the output directly to the screen in case of rig without post process for instance
    */
  var isIntermediate: Boolean = js.native
  
  /**
    * Gets the left camera of a rig setup in case of Rigged Camera
    */
  def isLeftCamera: Boolean = js.native
  
  /**
    * Is this camera a part of a rig system?
    */
  var isRigCamera: Boolean = js.native
  
  /**
    * Gets the right camera of a rig setup in case of Rigged Camera
    */
  def isRightCamera: Boolean = js.native
  
  /**
    * Defines if stereoscopic rendering is done side by side or over under.
    */
  var isStereoscopicSideBySide: Boolean = js.native
  
  /**
    * Restricts the camera to viewing objects with the same layerMask.
    * A camera with a layerMask of 1 will render mesh.layerMask & camera.layerMask!== 0
    */
  var layerMask: Double = js.native
  
  /**
    * Gets the left camera of a rig setup in case of Rigged Camera
    */
  def leftCamera: Nullable[FreeCamera] = js.native
  
  /**
    * Define the maximum distance the camera can see to.
    * This is important to note that the depth buffer are not infinite and the further it end
    * the more your scene might encounter depth fighting issue.
    */
  var maxZ: Double = js.native
  
  /**
    * Define the minimum distance the camera can see from.
    * This is important to note that the depth buffer are not infinite and the closer it starts
    * the more your scene might encounter depth fighting issue.
    */
  var minZ: Double = js.native
  
  def mode: Double = js.native
  def mode_=(mode: Double): Unit = js.native
  
  /**
    * Observable triggered when the inputs have been processed.
    */
  var onAfterCheckInputsObservable: Observable[Camera] = js.native
  
  /**
    * Observable triggered when the camera Projection matrix has changed.
    */
  var onProjectionMatrixChangedObservable: Observable[Camera] = js.native
  
  /**
    * Observable triggered when reset has been called and applied to the camera.
    */
  var onRestoreStateObservable: Observable[Camera] = js.native
  
  /**
    * Observable triggered when the camera view matrix has changed.
    */
  var onViewMatrixChangedObservable: Observable[Camera] = js.native
  
  def orthoBottom: Nullable[Double] = js.native
  def orthoBottom_=(value: Nullable[Double]): Unit = js.native
  
  def orthoLeft: Nullable[Double] = js.native
  def orthoLeft_=(value: Nullable[Double]): Unit = js.native
  
  def orthoRight: Nullable[Double] = js.native
  def orthoRight_=(value: Nullable[Double]): Unit = js.native
  
  def orthoTop: Nullable[Double] = js.native
  def orthoTop_=(value: Nullable[Double]): Unit = js.native
  
  /**
    * When set, the camera will render to this render target instead of the default canvas
    *
    * If the desire is to use the output of a camera as a texture in the scene consider using camera.customRenderTargets instead
    */
  var outputRenderTarget: Nullable[RenderTargetTexture] = js.native
  
  /**
    * Define the current local position of the camera in the scene
    */
  def position: Vector3 = js.native
  def position_=(newPosition: Vector3): Unit = js.native
  
  /**
    * Projection plane tilt around the X axis (horizontal), set in Radians. (default is 0)
    * Can be used to make vertical lines in world space actually vertical on the screen.
    * See https://forum.babylonjs.com/t/add-vertical-shift-to-3ds-max-exporter-babylon-cameras/17480
    */
  var projectionPlaneTilt: Double = js.native
  
  /**
    * Render pass id used by the camera to render into the main framebuffer
    */
  var renderPassId: Double = js.native
  
  /**
    * Restored camera state. You must call storeState() first.
    * @returns true if restored and false otherwise
    */
  def restoreState(): Boolean = js.native
  
  /** @internal */
  def rigCameras: js.Array[Camera] = js.native
  
  /**
    * If isRigCamera set to true this will be set with the parent camera.
    * The parent camera is not (!) necessarily the .parent of this camera (like in the case of XR)
    */
  var rigParent: js.UndefOr[Camera] = js.native
  
  /**
    * Gets the post process used by the rig cameras
    */
  def rigPostProcess: Nullable[PostProcess] = js.native
  
  /**
    * Gets the right camera of a rig setup in case of Rigged Camera
    */
  def rightCamera: Nullable[FreeCamera] = js.native
  
  /**
    * The screen area in scene units squared
    */
  def screenArea: Double = js.native
  
  /**
    * Serialiaze the camera setup to a json representation
    * @returns the JSON representation
    */
  def serialize(): Any = js.native
  
  /**
    * @internal
    */
  def setCameraRigMode(mode: Double, rigParams: Any): Unit = js.native
  
  /**
    * @internal
    */
  def setCameraRigParameter(name: String, value: Any): Unit = js.native
  
  /**
    * Store current camera state (fov, position, etc..)
    * @returns the camera
    */
  def storeState(): Camera = js.native
  
  def toString(fullDetails: Boolean): String = js.native
  
  /**
    * Unfreeze the projection matrix if it has previously been freezed by freezeProjectionMatrix.
    */
  def unfreezeProjectionMatrix(): Unit = js.native
  
  def upVector: Vector3 = js.native
  /**
    * The vector the camera should consider as up.
    * (default is Vector3(0, 1, 0) aka Vector3.Up())
    */
  def upVector_=(vec: Vector3): Unit = js.native
  
  /**
    * Update the camera state according to the different inputs gathered during the frame.
    */
  def update(): Unit = js.native
  
  /**
    * Define the viewport of the camera.
    * This correspond to the portion of the screen the camera will render to in normalized 0 to 1 unit.
    */
  var viewport: Viewport = js.native
}
