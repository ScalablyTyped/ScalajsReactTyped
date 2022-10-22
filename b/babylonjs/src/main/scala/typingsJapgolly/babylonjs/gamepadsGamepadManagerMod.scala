package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsGamepadManagerMod {
  
  @JSImport("babylonjs/Gamepads/gamepadManager", "GamepadManager")
  @js.native
  /**
    * Initializes the gamepad manager
    * @param _scene BabylonJS scene
    */
  open class GamepadManager () extends StObject {
    def this(_scene: Scene) = this()
    
    /* private */ var _addNewGamepad: Any = js.native
    
    /* private */ var _babylonGamepads: Any = js.native
    
    /** @internal */
    def _checkGamepadsStatus(): Unit = js.native
    
    /* private */ var _gamepadEventSupported: Any = js.native
    
    /* private */ var _gamepadSupport: Any = js.native
    
    /** @internal */
    var _isMonitoring: Boolean = js.native
    
    /* private */ var _loggedErrors: Any = js.native
    
    /* private */ var _onGamepadConnectedEvent: Any = js.native
    
    /* private */ var _onGamepadDisconnectedEvent: Any = js.native
    
    /* private */ var _oneGamepadConnected: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _startMonitoringGamepads: Any = js.native
    
    /* private */ var _stopMonitoringGamepads: Any = js.native
    
    /* private */ var _updateGamepadObjects: Any = js.native
    
    /**
      * Disposes the gamepad manager
      */
    def dispose(): Unit = js.native
    
    /**
      * The gamepads in the game pad manager
      */
    def gamepads: js.Array[typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad] = js.native
    
    /**
      * Get the gamepad controllers based on type
      * @param type The type of gamepad controller
      * @returns Nullable gamepad
      */
    def getGamepadByType(): Nullable[typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad] = js.native
    def getGamepadByType(`type`: Double): Nullable[typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad] = js.native
    
    /**
      * observable to be triggered when the gamepad controller has been connected
      */
    var onGamepadConnectedObservable: Observable[typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad] = js.native
    
    /**
      * observable to be triggered when the gamepad controller has been disconnected
      */
    var onGamepadDisconnectedObservable: Observable[typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad] = js.native
  }
}
