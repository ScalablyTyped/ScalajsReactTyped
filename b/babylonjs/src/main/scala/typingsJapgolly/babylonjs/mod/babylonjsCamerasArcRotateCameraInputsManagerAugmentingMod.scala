package typingsJapgolly.babylonjs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
  
  /**
    * Interface representing an arc rotate camera inputs manager
    */
  trait ArcRotateCameraInputsManager extends StObject {
    
    /**
      * Adds gamepad input support to the ArcRotateCamera InputManager.
      * @returns the camera inputs manager
      */
    def addGamepad(): typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addVRDeviceOrientation(): typingsJapgolly.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
  }
  object ArcRotateCameraInputsManager {
    
    inline def apply(
      addGamepad: CallbackTo[
          typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
        ],
      addVRDeviceOrientation: CallbackTo[
          typingsJapgolly.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
        ]
    ): typingsJapgolly.babylonjs.mod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = addGamepad.toJsFn, addVRDeviceOrientation = addVRDeviceOrientation.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.babylonjs.mod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager]
    }
    
    extension [Self <: typingsJapgolly.babylonjs.mod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager](x: Self) {
      
      inline def setAddGamepad(
        value: CallbackTo[
              typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
            ]
      ): Self = StObject.set(x, "addGamepad", value.toJsFn)
      
      inline def setAddVRDeviceOrientation(
        value: CallbackTo[
              typingsJapgolly.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
            ]
      ): Self = StObject.set(x, "addVRDeviceOrientation", value.toJsFn)
    }
  }
}
