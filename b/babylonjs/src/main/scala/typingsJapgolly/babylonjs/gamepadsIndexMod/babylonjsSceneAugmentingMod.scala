package typingsJapgolly.babylonjs.gamepadsIndexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  trait Scene extends StObject {
    
    /** @internal */
    var _gamepadManager: Nullable[typingsJapgolly.babylonjs.gamepadsGamepadManagerMod.GamepadManager]
    
    /**
      * Gets the gamepad manager associated with the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_gamepads
      */
    var gamepadManager: typingsJapgolly.babylonjs.gamepadsGamepadManagerMod.GamepadManager
  }
  object Scene {
    
    inline def apply(gamepadManager: typingsJapgolly.babylonjs.gamepadsGamepadManagerMod.GamepadManager): Scene = {
      val __obj = js.Dynamic.literal(gamepadManager = gamepadManager.asInstanceOf[js.Any], _gamepadManager = null)
      __obj.asInstanceOf[Scene]
    }
    
    extension [Self <: Scene](x: Self) {
      
      inline def setGamepadManager(value: typingsJapgolly.babylonjs.gamepadsGamepadManagerMod.GamepadManager): Self = StObject.set(x, "gamepadManager", value.asInstanceOf[js.Any])
      
      inline def set_gamepadManager(value: Nullable[typingsJapgolly.babylonjs.gamepadsGamepadManagerMod.GamepadManager]): Self = StObject.set(x, "_gamepadManager", value.asInstanceOf[js.Any])
      
      inline def set_gamepadManagerNull: Self = StObject.set(x, "_gamepadManager", null)
    }
  }
}
