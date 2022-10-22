package typingsJapgolly.babylonjs.gamepadsIndexMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
  
  /**
    * Interface representing a free camera inputs manager
    */
  trait FreeCameraInputsManager extends StObject {
    
    /**
      * Adds gamepad input support to the FreeCameraInputsManager.
      * @returns the FreeCameraInputsManager
      */
    def addGamepad(): typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
  }
  object FreeCameraInputsManager {
    
    inline def apply(
      addGamepad: CallbackTo[
          typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
        ]
    ): FreeCameraInputsManager = {
      val __obj = js.Dynamic.literal(addGamepad = addGamepad.toJsFn)
      __obj.asInstanceOf[FreeCameraInputsManager]
    }
    
    extension [Self <: FreeCameraInputsManager](x: Self) {
      
      inline def setAddGamepad(
        value: CallbackTo[
              typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
            ]
      ): Self = StObject.set(x, "addGamepad", value.toJsFn)
    }
  }
}
