package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.babylonjs.anon.AxisMeshNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsMotionController
  extends StObject
     with WebVRController {
  
  /* private */ var _createMeshInfo: Any = js.native
  
  /**
    * Called once for each button that changed state since the last frame
    * @param buttonIdx Which button index changed
    * @param state New state of the button
    */
  /* protected */ def _handleButtonChange(buttonIdx: Double, state: ExtendedGamepadButton): Unit = js.native
  
  /**
    * Moves the axis on the controller mesh based on its current state
    * @param axis the index of the axis
    * @param axisValue the value of the axis which determines the meshes new position
    * @internal
    */
  /* protected */ def _lerpAxisTransform(axis: Double, axisValue: Double): Unit = js.native
  
  /**
    * Moves the buttons on the controller mesh based on their current state
    * @param buttonName the name of the button to move
    * @param buttonValue the value of the button which determines the buttons new position
    */
  /* protected */ def _lerpButtonTransform(buttonName: String, buttonValue: Double): Unit = js.native
  
  /* private */ var _loadedMeshInfo: Any = js.native
  
  /* protected */ val _mapping: AxisMeshNames = js.native
  
  /**
    * Takes a list of meshes (as loaded from the glTF file) and finds the root node, as well as nodes that
    * can be transformed by button presses and axes values, based on this._mapping.
    *
    * @param scene scene in which the meshes exist
    * @param meshes list of meshes that make up the controller model to process
    * @returns structured view of the given meshes, with mapping of buttons and axes to meshes that can be transformed.
    */
  /* private */ var _processModel: Any = js.native
  
  /* protected */ def _updateTrackpad(): Unit = js.native
  
  def initControllerMesh(scene: Scene, meshLoaded: js.Function1[/* mesh */ AbstractMesh, Unit], forceDefault: Boolean): Unit = js.native
  def initControllerMesh(scene: Scene, meshLoaded: Unit, forceDefault: Boolean): Unit = js.native
  
  /**
    * Fired when the grip button on this controller is modified
    */
  def onGripButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the menu button on this controller is modified
    */
  def onMenuButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the thumbstick button on this controller is modified
    */
  def onThumbstickButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the touchpad button on this controller is modified
    */
  def onTouchpadButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the touchpad values on this controller are modified
    */
  def onTouchpadValuesChangedObservable: Observable[StickValues] = js.native
  
  /**
    * Fired when the trackpad on this controller is clicked
    */
  var onTrackpadChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the trackpad on this controller is modified
    */
  var onTrackpadValuesChangedObservable: Observable[StickValues] = js.native
  
  /**
    * Fired when the trigger on this controller is modified
    */
  def onTriggerButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * The current x and y values of this controller's trackpad
    */
  var trackpad: StickValues = js.native
}
