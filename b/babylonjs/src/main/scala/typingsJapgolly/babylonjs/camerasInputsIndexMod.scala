package typingsJapgolly.babylonjs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasInputsIndexMod {
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraGamepadInput")
  @js.native
  open class ArcRotateCameraGamepadInput ()
    extends typingsJapgolly.babylonjs.camerasInputsArcRotateCameraGamepadInputMod.ArcRotateCameraGamepadInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraKeyboardMoveInput")
  @js.native
  open class ArcRotateCameraKeyboardMoveInput ()
    extends typingsJapgolly.babylonjs.camerasInputsArcRotateCameraKeyboardMoveInputMod.ArcRotateCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraMouseWheelInput")
  @js.native
  open class ArcRotateCameraMouseWheelInput ()
    extends typingsJapgolly.babylonjs.camerasInputsArcRotateCameraMouseWheelInputMod.ArcRotateCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraPointersInput")
  @js.native
  open class ArcRotateCameraPointersInput ()
    extends typingsJapgolly.babylonjs.camerasInputsArcRotateCameraPointersInputMod.ArcRotateCameraPointersInput
  /* static members */
  object ArcRotateCameraPointersInput {
    
    @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraPointersInput")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The minimum radius used for pinch, to avoid radius lock at 0
      */
    @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraPointersInput.MinimumRadiusForPinch")
    @js.native
    def MinimumRadiusForPinch: Double = js.native
    inline def MinimumRadiusForPinch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinimumRadiusForPinch")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraVRDeviceOrientationInput")
  @js.native
  /**
    * Instantiate a new ArcRotateCameraVRDeviceOrientationInput.
    */
  open class ArcRotateCameraVRDeviceOrientationInput ()
    extends typingsJapgolly.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.ArcRotateCameraVRDeviceOrientationInput
  
  /* note: abstract class */ @JSImport("babylonjs/Cameras/Inputs/index", "BaseCameraMouseWheelInput")
  @js.native
  open class BaseCameraMouseWheelInput ()
    extends typingsJapgolly.babylonjs.camerasInputsBaseCameraMouseWheelInputMod.BaseCameraMouseWheelInput
  
  /* note: abstract class */ @JSImport("babylonjs/Cameras/Inputs/index", "BaseCameraPointersInput")
  @js.native
  open class BaseCameraPointersInput ()
    extends typingsJapgolly.babylonjs.camerasInputsBaseCameraPointersInputMod.BaseCameraPointersInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraKeyboardInput")
  @js.native
  open class FlyCameraKeyboardInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFlyCameraKeyboardInputMod.FlyCameraKeyboardInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraMouseInput")
  @js.native
  /**
    * Listen to mouse events to control the camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  open class FlyCameraMouseInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFlyCameraMouseInputMod.FlyCameraMouseInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraKeyboardMoveInput")
  @js.native
  open class FollowCameraKeyboardMoveInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFollowCameraKeyboardMoveInputMod.FollowCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraMouseWheelInput")
  @js.native
  open class FollowCameraMouseWheelInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFollowCameraMouseWheelInputMod.FollowCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraPointersInput")
  @js.native
  open class FollowCameraPointersInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFollowCameraPointersInputMod.FollowCameraPointersInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraDeviceOrientationInput")
  @js.native
  /**
    * Instantiates a new input
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  open class FreeCameraDeviceOrientationInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFreeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
  /* static members */
  object FreeCameraDeviceOrientationInput {
    
    @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraDeviceOrientationInput")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Can be used to detect if a device orientation sensor is available on a device
      * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
      * @returns a promise that will resolve on orientation change
      */
    inline def WaitForOrientationChangeAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")().asInstanceOf[js.Promise[Unit]]
    inline def WaitForOrientationChangeAsync(timeout: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraGamepadInput")
  @js.native
  open class FreeCameraGamepadInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFreeCameraGamepadInputMod.FreeCameraGamepadInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraKeyboardMoveInput")
  @js.native
  open class FreeCameraKeyboardMoveInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFreeCameraKeyboardMoveInputMod.FreeCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraMouseInput")
  @js.native
  /**
    * Manage the mouse inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param touchEnabled Defines if touch is enabled or not
    */
  open class FreeCameraMouseInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFreeCameraMouseInputMod.FreeCameraMouseInput {
    def this(/**
      * Define if touch is enabled in the mouse input
      */
    touchEnabled: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraMouseWheelInput")
  @js.native
  open class FreeCameraMouseWheelInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFreeCameraMouseWheelInputMod.FreeCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraTouchInput")
  @js.native
  /**
    * Manage the touch inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param allowMouse Defines if mouse events can be treated as touch events
    */
  open class FreeCameraTouchInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFreeCameraTouchInputMod.FreeCameraTouchInput {
    def this(/**
      * Define if mouse events can be treated as touch events
      */
    allowMouse: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraVirtualJoystickInput")
  @js.native
  open class FreeCameraVirtualJoystickInput ()
    extends typingsJapgolly.babylonjs.camerasInputsFreeCameraVirtualJoystickInputMod.FreeCameraVirtualJoystickInput
  
  /* augmented module */
  object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
    
    trait ArcRotateCameraInputsManager extends StObject {
      
      /**
        * Add orientation input support to the input manager.
        * @returns the current input manager
        */
      def addVRDeviceOrientation(): typingsJapgolly.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    }
    object ArcRotateCameraInputsManager {
      
      inline def apply(
        addVRDeviceOrientation: CallbackTo[
              typingsJapgolly.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
            ]
      ): ArcRotateCameraInputsManager = {
        val __obj = js.Dynamic.literal(addVRDeviceOrientation = addVRDeviceOrientation.toJsFn)
        __obj.asInstanceOf[ArcRotateCameraInputsManager]
      }
      
      extension [Self <: ArcRotateCameraInputsManager](x: Self) {
        
        inline def setAddVRDeviceOrientation(
          value: CallbackTo[
                  typingsJapgolly.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
                ]
        ): Self = StObject.set(x, "addVRDeviceOrientation", value.toJsFn)
      }
    }
  }
  
  /* augmented module */
  object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
    
    @js.native
    trait FreeCameraInputsManager extends StObject {
      
      /**
        * @internal
        */
      var _deviceOrientationInput: Nullable[
            typingsJapgolly.babylonjs.camerasInputsFreeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
          ] = js.native
      
      /**
        * Add orientation input support to the input manager.
        * @param smoothFactor deviceOrientation smoothing. 0: no smoothing, 1: new data ignored, 0.9 recommended for smoothing
        * @returns the current input manager
        */
      def addDeviceOrientation(): typingsJapgolly.babylonjs.camerasInputsFreeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
      def addDeviceOrientation(smoothFactor: Double): typingsJapgolly.babylonjs.camerasInputsFreeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
      
      /**
        * Add virtual joystick input support to the input manager.
        * @returns the current input manager
        */
      def addVirtualJoystick(): typingsJapgolly.babylonjs.camerasInputsFreeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    }
  }
}
