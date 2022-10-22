package typingsJapgolly.babylonjs.gamepadsIndexMod

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
  }
  object ArcRotateCameraInputsManager {
    
    inline def apply(
      addGamepad: CallbackTo[
          typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
        ]
    ): ArcRotateCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = addGamepad.toJsFn)
      __obj.asInstanceOf[ArcRotateCameraInputsManager]
    }
    
    extension [Self <: ArcRotateCameraInputsManager](x: Self) {
      
      inline def setAddGamepad(
        value: CallbackTo[
              typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
            ]
      ): Self = StObject.set(x, "addGamepad", value.toJsFn)
    }
  }
}
