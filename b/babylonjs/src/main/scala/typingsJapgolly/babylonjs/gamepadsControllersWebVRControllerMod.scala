package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.gamepadsControllersPoseEnabledControllerMod.ExtendedGamepadButton
import typingsJapgolly.babylonjs.gamepadsControllersPoseEnabledControllerMod.MutableGamepadButton
import typingsJapgolly.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledController
import typingsJapgolly.babylonjs.gamepadsGamepadMod.GamepadButtonChanges
import typingsJapgolly.babylonjs.gamepadsGamepadMod.StickValues
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.miscObservableMod.Observable
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsControllersWebVRControllerMod {
  
  /* note: abstract class */ @JSImport("babylonjs/Gamepads/Controllers/webVRController", "WebVRController")
  @js.native
  open class WebVRController protected () extends PoseEnabledController {
    /**
      * Creates a new WebVRController from a gamepad
      * @param vrGamepad the gamepad that the WebVRController should be created from
      */
    def this(vrGamepad: Any) = this()
    
    /**
      * Array of button available on the controller
      */
    /* protected */ var _buttons: js.Array[MutableGamepadButton] = js.native
    
    /* private */ var _changes: Any = js.native
    
    /* private */ var _checkChanges: Any = js.native
    
    /**
      * Internal, the default controller model for the controller
      */
    /* protected */ var _defaultModel: Nullable[AbstractMesh] = js.native
    
    /**
      * Function to be called when a button is modified
      */
    /* protected */ def _handleButtonChange(buttonIdx: Double, value: ExtendedGamepadButton, changes: GamepadButtonChanges): Unit = js.native
    
    /* private */ var _onButtonStateChange: Any = js.native
    
    /* private */ var _setButtonValue: Any = js.native
    
    /**
      * The default controller model for the controller
      */
    def defaultModel: Nullable[AbstractMesh] = js.native
    
    /**
      * 'left' or 'right', see https://w3c.github.io/gamepad/extensions.html#gamepadhand-enum
      */
    var hand: String = js.native
    
    /**
      * Loads a mesh and attaches it to the controller
      * @param scene the scene the mesh should be added to
      * @param meshLoaded callback for when the mesh has been loaded
      */
    def initControllerMesh(scene: Scene): Unit = js.native
    def initControllerMesh(scene: Scene, meshLoaded: js.Function1[/* mesh */ AbstractMesh, Unit]): Unit = js.native
    
    /**
      * Fired when a controller button's state has changed
      * @param callback the callback containing the button that was modified
      */
    def onButtonStateChange(
      callback: js.Function3[
          /* controlledIndex */ Double, 
          /* buttonIndex */ Double, 
          /* state */ ExtendedGamepadButton, 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Fired when the main button state has changed
      */
    var onMainButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * Fired when the pad state has changed
      */
    var onPadStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * Fired when controllers stick values have changed
      */
    var onPadValuesChangedObservable: Observable[StickValues] = js.native
    
    /**
      * Fired when the secondary button state has changed
      */
    var onSecondaryButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * Fired when the trigger state has changed
      */
    var onTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * X and Y axis corresponding to the controllers joystick
      */
    var pad: StickValues = js.native
  }
}
