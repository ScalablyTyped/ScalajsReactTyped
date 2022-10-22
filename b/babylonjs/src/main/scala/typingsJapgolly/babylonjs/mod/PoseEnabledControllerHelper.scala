package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.gamepadsControllersPoseEnabledControllerMod.GamePadFactory
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PoseEnabledControllerHelper")
@js.native
open class PoseEnabledControllerHelper ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.PoseEnabledControllerHelper
/* static members */
object PoseEnabledControllerHelper {
  
  @JSImport("babylonjs", "PoseEnabledControllerHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  inline def InitiateController(vrGamepad: Any): typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad = ^.asInstanceOf[js.Dynamic].applyDynamic("InitiateController")(vrGamepad.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad]
  
  /** @internal */
  @JSImport("babylonjs", "PoseEnabledControllerHelper._ControllerFactories")
  @js.native
  def _ControllerFactories: js.Array[GamePadFactory] = js.native
  inline def _ControllerFactories_=(x: js.Array[GamePadFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ControllerFactories")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs", "PoseEnabledControllerHelper._DefaultControllerFactory")
  @js.native
  def _DefaultControllerFactory: Nullable[
    js.Function1[/* gamepadInfo */ Any, typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad]
  ] = js.native
  inline def _DefaultControllerFactory_=(
    x: Nullable[
      js.Function1[/* gamepadInfo */ Any, typingsJapgolly.babylonjs.gamepadsGamepadMod.Gamepad]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultControllerFactory")(x.asInstanceOf[js.Any])
}
