package typingsJapgolly.babylonjs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.gamepadsGamepadManagerMod.GamepadManager
import typingsJapgolly.babylonjs.sceneComponentMod.ISceneComponent
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsGamepadSceneComponentMod {
  
  @JSImport("babylonjs/Gamepads/gamepadSceneComponent", "GamepadSystemSceneComponent")
  @js.native
  open class GamepadSystemSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /* private */ var _beforeCameraUpdate: Any = js.native
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
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
      def addGamepad(): ArcRotateCameraInputsManager
    }
    object ArcRotateCameraInputsManager {
      
      inline def apply(addGamepad: CallbackTo[ArcRotateCameraInputsManager]): ArcRotateCameraInputsManager = {
        val __obj = js.Dynamic.literal(addGamepad = addGamepad.toJsFn)
        __obj.asInstanceOf[ArcRotateCameraInputsManager]
      }
      
      extension [Self <: ArcRotateCameraInputsManager](x: Self) {
        
        inline def setAddGamepad(value: CallbackTo[ArcRotateCameraInputsManager]): Self = StObject.set(x, "addGamepad", value.toJsFn)
      }
    }
  }
  
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
      def addGamepad(): FreeCameraInputsManager
    }
    object FreeCameraInputsManager {
      
      inline def apply(addGamepad: CallbackTo[FreeCameraInputsManager]): FreeCameraInputsManager = {
        val __obj = js.Dynamic.literal(addGamepad = addGamepad.toJsFn)
        __obj.asInstanceOf[FreeCameraInputsManager]
      }
      
      extension [Self <: FreeCameraInputsManager](x: Self) {
        
        inline def setAddGamepad(value: CallbackTo[FreeCameraInputsManager]): Self = StObject.set(x, "addGamepad", value.toJsFn)
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @internal */
      var _gamepadManager: Nullable[GamepadManager]
      
      /**
        * Gets the gamepad manager associated with the scene
        * @see https://doc.babylonjs.com/how_to/how_to_use_gamepads
        */
      var gamepadManager: GamepadManager
    }
    object Scene {
      
      inline def apply(gamepadManager: GamepadManager): typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(gamepadManager = gamepadManager.asInstanceOf[js.Any], _gamepadManager = null)
        __obj.asInstanceOf[typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      extension [Self <: typingsJapgolly.babylonjs.gamepadsGamepadSceneComponentMod.babylonjsSceneAugmentingMod.Scene](x: Self) {
        
        inline def setGamepadManager(value: GamepadManager): Self = StObject.set(x, "gamepadManager", value.asInstanceOf[js.Any])
        
        inline def set_gamepadManager(value: Nullable[GamepadManager]): Self = StObject.set(x, "_gamepadManager", value.asInstanceOf[js.Any])
        
        inline def set_gamepadManagerNull: Self = StObject.set(x, "_gamepadManager", null)
      }
    }
  }
}
