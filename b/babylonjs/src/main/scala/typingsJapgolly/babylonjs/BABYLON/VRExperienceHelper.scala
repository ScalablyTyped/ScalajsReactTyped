package typingsJapgolly.babylonjs.BABYLON

import org.scalajs.dom.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRExperienceHelper extends StObject {
  
  /* private */ var _beforeRender: Any = js.native
  
  /* private */ var _btnVR: Any = js.native
  
  /* private */ var _btnVRDisplayed: Any = js.native
  
  /* private */ var _cachedAngularSensibility: Any = js.native
  
  /* private */ var _cameraGazer: Any = js.native
  
  /* private */ var _castRayAndSelectObject: Any = js.native
  
  /* private */ var _checkRotate: Any = js.native
  
  /* private */ var _checkTeleportBackwards: Any = js.native
  
  /* private */ var _checkTeleportWithRay: Any = js.native
  
  /* private */ var _circleEase: Any = js.native
  
  /* private */ var _completeVRInit: Any = js.native
  
  /* private */ var _convertNormalToDirectionOfRay: Any = js.native
  
  /* private */ var _createTeleportationCircles: Any = js.native
  
  /* private */ var _defaultHeight: Any = js.native
  
  /* private */ var _deviceOrientationCamera: Any = js.native
  
  /* private */ var _displayGaze: Any = js.native
  
  /* private */ var _displayLaserPointer: Any = js.native
  
  /* private */ var _displayTeleportationTarget: Any = js.native
  
  /* private */ var _displayVRButton: Any = js.native
  
  /* private */ var _enableInteractionOnController: Any = js.native
  
  /* private */ var _enableTeleportationOnController: Any = js.native
  
  /* private */ var _existingCamera: Any = js.native
  
  /* private */ var _floorMeshName: Any = js.native
  
  /* private */ var _floorMeshesCollection: Any = js.native
  
  /* private */ var _fullscreenVRpresenting: Any = js.native
  
  /* private */ var _gazeColor: Any = js.native
  
  /* private */ var _haloCenter: Any = js.native
  
  /* private */ var _hasEnteredVR: Any = js.native
  
  /* private */ var _hideTeleportationTarget: Any = js.native
  
  /* private */ var _inputElement: Any = js.native
  
  /* private */ var _interactionsEnabled: Any = js.native
  
  /* private */ var _interactionsRequested: Any = js.native
  
  /* private */ var _isDefaultTeleportationTarget: Any = js.native
  
  /* private */ var _isTeleportationFloor: Any = js.native
  
  /* private */ var _laserColor: Any = js.native
  
  /* private */ var _leftController: Any = js.native
  
  /* private */ var _moveButtonToBottomRight: Any = js.native
  
  /* private */ var _moveTeleportationSelectorTo: Any = js.native
  
  /* private */ def _noControllerIsActive: Any = js.native
  
  /* private */ var _notifySelectedMeshUnselected: Any = js.native
  
  /* private */ var _onDefaultMeshLoaded: Any = js.native
  
  /* private */ var _onFullscreenChange: Any = js.native
  
  /* private */ var _onKeyDown: Any = js.native
  
  /* private */ var _onNewGamepadConnected: Any = js.native
  
  /* private */ var _onNewGamepadDisconnected: Any = js.native
  
  /* private */ var _onResize: Any = js.native
  
  /* private */ var _onVRDisplayChanged: Any = js.native
  
  /* private */ var _onVRDisplayChangedBind: Any = js.native
  
  /* private */ var _onVRRequestPresentComplete: Any = js.native
  
  /* private */ var _onVRRequestPresentStart: Any = js.native
  
  /* private */ var _onVrDisplayPresentChange: Any = js.native
  
  /* private */ var _onVrDisplayPresentChangeBind: Any = js.native
  
  /* private */ var _padSensibilityDown: Any = js.native
  
  /* private */ var _padSensibilityUp: Any = js.native
  
  /* private */ var _pickedGazeColor: Any = js.native
  
  /* private */ var _pickedLaserColor: Any = js.native
  
  /* private */ var _position: Any = js.native
  
  /* private */ var _postProcessMove: Any = js.native
  
  /* private */ var _rayLength: Any = js.native
  
  /* private */ var _raySelectionPredicate: Any = js.native
  
  /* private */ var _rightController: Any = js.native
  
  /* private */ var _rotateCamera: Any = js.native
  
  /* private */ var _rotationAllowed: Any = js.native
  
  /* private */ var _rotationAngle: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _teleportActive: Any = js.native
  
  /* private */ var _teleportBackwardsVector: Any = js.native
  
  /* private */ var _teleportationBorderColor: Any = js.native
  
  /* private */ var _teleportationEasing: Any = js.native
  
  /* private */ var _teleportationFillColor: Any = js.native
  
  /* private */ var _teleportationInitialized: Any = js.native
  
  /* private */ var _teleportationMode: Any = js.native
  
  /* private */ def _teleportationRequestInitiated: Any = js.native
  
  /* private */ var _teleportationRequested: Any = js.native
  
  /* private */ var _teleportationSpeed: Any = js.native
  
  /* private */ var _teleportationTarget: Any = js.native
  
  /* private */ var _teleportationTime: Any = js.native
  
  /* private */ var _tryEnableInteractionOnController: Any = js.native
  
  /* private */ var _updateButtonVisibility: Any = js.native
  
  /* private */ var _useCustomVRButton: Any = js.native
  
  /* private */ var _vrDeviceOrientationCamera: Any = js.native
  
  /* private */ var _webVRCamera: Any = js.native
  
  /* private */ var _webVRpresenting: Any = js.native
  
  /* private */ var _webVRready: Any = js.native
  
  /* private */ var _webVRrequesting: Any = js.native
  
  /* private */ var _webVRsupported: Any = js.native
  
  /* private */ var _workingMatrix: Any = js.native
  
  /* private */ var _workingQuaternion: Any = js.native
  
  /* private */ var _workingVector: Any = js.native
  
  /**
    * Adds a floor mesh to be used for teleportation.
    * @param floorMesh the mesh to be used for teleportation.
    */
  def addFloorMesh(floorMesh: Mesh): Unit = js.native
  
  /**
    * Sets the color of the ray from the vr headsets gaze.
    * @param color new color for the ray.
    */
  def changeGazeColor(color: Color3): Unit = js.native
  
  /**
    * Sets the color of the laser ray from the vr controllers.
    * @param color new color for the ray.
    */
  def changeLaserColor(color: Color3): Unit = js.native
  
  /**
    * Based on the current WebVR support, returns the current VR camera used.
    */
  def currentVRCamera: Nullable[Camera] = js.native
  
  /**
    * The deviceOrientationCamera used as the camera when not in VR.
    */
  def deviceOrientationCamera: Nullable[DeviceOrientationCamera] = js.native
  
  /**
    * If the ray of the gaze should be displayed.
    */
  def displayGaze: Boolean = js.native
  /**
    * Sets if the ray of the gaze should be displayed.
    */
  def displayGaze_=(value: Boolean): Unit = js.native
  
  /**
    * If the ray of the LaserPointer should be displayed.
    */
  def displayLaserPointer: Boolean = js.native
  /**
    * Sets if the ray of the LaserPointer should be displayed.
    */
  def displayLaserPointer_=(value: Boolean): Unit = js.native
  
  /**
    * Exits VR and disposes of the vr experience helper
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that gaze can be enabled even if pointer lock is not engage (useful on iOS where fullscreen mode and pointer lock are not supported)
    */
  var enableGazeEvenWhenNoPointerLock: Boolean = js.native
  
  /**
    * Enables controllers and user interactions such as selecting and object or clicking on an object.
    */
  def enableInteractions(): Unit = js.native
  
  /**
    * Enables interactions and teleportation using the VR controllers and gaze.
    * @param vrTeleportationOptions options to modify teleportation behavior.
    */
  def enableTeleportation(): Unit = js.native
  def enableTeleportation(vrTeleportationOptions: VRTeleportationOptions): Unit = js.native
  
  /**
    * Attempt to enter VR. If a headset is connected and ready, will request present on that.
    * Otherwise, will use the fullscreen API.
    */
  def enterVR(): Unit = js.native
  
  /**
    * Attempt to exit VR, or fullscreen.
    */
  def exitVR(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that the VREXperienceHelper will exit VR if double tap is detected
    */
  var exitVROnDoubleTap: Boolean = js.native
  
  /**
    * The mesh used to display where the user is selecting, this mesh will be cloned and set as the gazeTracker for the left and right controller
    * when set bakeCurrentTransformIntoVertices will be called on the mesh.
    * See https://doc.babylonjs.com/resources/baking_transformations
    */
  def gazeTrackerMesh: Mesh = js.native
  def gazeTrackerMesh_=(value: Mesh): Unit = js.native
  
  /**
    * Gets the name of the VRExperienceHelper class
    * @returns "VRExperienceHelper"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets a value indicating if we are currently in VR mode.
    */
  def isInVRMode: Boolean = js.native
  
  /**
    * The gaze tracking mesh corresponding to the left controller
    */
  def leftControllerGazeTrackerMesh: Nullable[Mesh] = js.native
  
  /**
    * To be optionally changed by user to define custom selection logic (after ray selection)
    */
  def meshSelectionPredicate(mesh: AbstractMesh): Boolean = js.native
  
  /**
    *  Observable raised after camera teleportation
    */
  var onAfterCameraTeleport: Observable[Vector3] = js.native
  
  /**
    * Observable raised when entering VR has completed.
    */
  var onAfterEnteringVRObservable: Observable[OnAfterEnteringVRObservableEvent] = js.native
  
  /**
    * Observable raised before camera teleportation
    */
  var onBeforeCameraTeleport: Observable[Vector3] = js.native
  
  /** Return this.onControllerMeshLoadedObservable
    * Note: This one is for backward compatibility. Please use onControllerMeshLoadedObservable directly
    */
  def onControllerMeshLoaded: Observable[WebVRController] = js.native
  
  /**
    * Observable raised when controller mesh is loaded.
    */
  var onControllerMeshLoadedObservable: Observable[WebVRController] = js.native
  
  /** Return this.onEnteringVRObservable
    * Note: This one is for backward compatibility. Please use onEnteringVRObservable directly
    */
  def onEnteringVR: Observable[VRExperienceHelper] = js.native
  
  /**
    * Observable raised right before entering VR.
    */
  var onEnteringVRObservable: Observable[VRExperienceHelper] = js.native
  
  /** Return this.onExitingVRObservable
    * Note: This one is for backward compatibility. Please use onExitingVRObservable directly
    */
  def onExitingVR: Observable[VRExperienceHelper] = js.native
  
  /**
    * Observable raised when exiting VR.
    */
  var onExitingVRObservable: Observable[VRExperienceHelper] = js.native
  
  /**
    * Observable raised when a new mesh is selected based on meshSelectionPredicate.
    * This observable will provide the mesh and the controller used to select the mesh
    */
  var onMeshSelectedWithController: Observable[typingsJapgolly.babylonjs.anon.Mesh] = js.native
  
  /**
    * Observable raised when a new mesh is picked based on meshSelectionPredicate
    */
  var onNewMeshPicked: Observable[PickingInfo] = js.native
  
  /**
    * Observable raised when a new mesh is selected based on meshSelectionPredicate
    */
  var onNewMeshSelected: Observable[AbstractMesh] = js.native
  
  /**
    * Observable raised when current selected mesh gets unselected
    */
  var onSelectedMeshUnselected: Observable[AbstractMesh] = js.native
  
  /**
    * The position of the vr experience helper.
    */
  def position: Vector3 = js.native
  /**
    * Sets the position of the vr experience helper.
    */
  def position_=(value: Vector3): Unit = js.native
  
  /**
    * To be optionally changed by user to define custom ray selection
    */
  def raySelectionPredicate(mesh: AbstractMesh): Boolean = js.native
  
  /**
    * Removes a floor mesh from being used for teleportation.
    * @param floorMesh the mesh to be removed.
    */
  def removeFloorMesh(floorMesh: Mesh): Unit = js.native
  
  /**
    * Defines whether or not Pointer lock should be requested when switching to
    * full screen.
    */
  var requestPointerLockOnFullScreen: Boolean = js.native
  
  /**
    * The gaze tracking mesh corresponding to the right controller
    */
  def rightControllerGazeTrackerMesh: Nullable[Mesh] = js.native
  
  /**
    * Permanently set new colors for the gaze pointer
    * @param color the new gaze color
    * @param pickedColor the new gaze color when picked mesh detected
    */
  def setGazeColor(color: Color3): Unit = js.native
  def setGazeColor(color: Color3, pickedColor: Color3): Unit = js.native
  
  /**
    * Permanently set new colors for the laser pointer
    * @param color the new laser color
    * @param pickedColor the new laser color when picked mesh detected
    */
  def setLaserColor(color: Color3): Unit = js.native
  def setLaserColor(color: Color3, pickedColor: Color3): Unit = js.native
  
  /**
    * Set lighting enabled / disabled on the laser pointer of both controllers
    * @param enabled should the lighting be enabled on the laser pointer
    */
  def setLaserLightingState(): Unit = js.native
  def setLaserLightingState(enabled: Boolean): Unit = js.native
  
  /**
    * Teleports the users feet to the desired location
    * @param location The location where the user's feet should be placed
    */
  def teleportCamera(location: Vector3): Unit = js.native
  
  /**
    * Set teleportation enabled. If set to false camera teleportation will be disabled but camera rotation will be kept.
    */
  var teleportationEnabled: Boolean = js.native
  
  /**
    * The mesh used to display where the user is going to teleport.
    */
  def teleportationTarget: Mesh = js.native
  /**
    * Sets the mesh to be used to display where the user is going to teleport.
    */
  def teleportationTarget_=(value: Mesh): Unit = js.native
  
  /**
    * If the controller laser color should be updated when selecting meshes
    */
  var updateControllerLaserColor: Boolean = js.native
  
  /**
    * If the gaze trackers color should be updated when selecting meshes
    */
  var updateGazeTrackerColor: Boolean = js.native
  
  /**
    * If the gaze trackers scale should be updated to be constant size when pointing at near/far meshes
    */
  var updateGazeTrackerScale: Boolean = js.native
  
  /**
    * The html button that is used to trigger entering into VR.
    */
  def vrButton: Nullable[HTMLButtonElement] = js.native
  
  /**
    * The deviceOrientationCamera that is used as a fallback when vr device is not connected.
    */
  def vrDeviceOrientationCamera: Nullable[VRDeviceOrientationFreeCamera] = js.native
  
  /**
    * The webVRCamera which is used when in VR.
    */
  def webVRCamera: WebVRFreeCamera = js.native
  
  /** Options to modify the vr experience helper's behavior. */
  var webVROptions: VRExperienceHelperOptions = js.native
  
  /**
    * If asking to force XR, this will be populated with the default xr experience
    */
  var xr: WebXRDefaultExperience = js.native
  
  /**
    * Was the XR test done already. If this is true AND this.xr exists, xr is initialized.
    * If this is true and no this.xr, xr exists but is not supported, using WebVR.
    */
  var xrTestDone: Boolean = js.native
}
