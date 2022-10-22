package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXREnterExitUI")
@js.native
open class WebXREnterExitUI protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.WebXREnterExitUI {
  /**
    * Construct a new EnterExit UI class
    *
    * @param _scene babylon scene object to use
    * @param options (read-only) version of the options passed to this UI
    */
  def this(
    _scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    /** version of the options passed to this UI */
  options: typingsJapgolly.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUIOptions
  ) = this()
}
/* static members */
object WebXREnterExitUI {
  
  @JSImport("babylonjs", "WebXREnterExitUI")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates UI to allow the user to enter/exit XR mode
    * @param scene the scene to add the ui to
    * @param helper the xr experience helper to enter/exit xr with
    * @param options options to configure the UI
    * @returns the created ui
    */
  inline def CreateAsync(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    helper: typingsJapgolly.babylonjs.xRWebXRExperienceHelperMod.WebXRExperienceHelper,
    options: typingsJapgolly.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUIOptions
  ): js.Promise[typingsJapgolly.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUI] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], helper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.xRWebXREnterExitUIMod.WebXREnterExitUI]]
}
