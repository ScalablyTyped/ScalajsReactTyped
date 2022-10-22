package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXREnterExitUI")
@js.native
open class WebXREnterExitUI protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXREnterExitUI {
  /**
    * Construct a new EnterExit UI class
    *
    * @param _scene babylon scene object to use
    * @param options (read-only) version of the options passed to this UI
    */
  def this(
    _scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    /** version of the options passed to this UI */
  options: typingsJapgolly.babylonjs.BABYLON.WebXREnterExitUIOptions
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXREnterExitUI {
  
  @JSGlobal("BABYLON.WebXREnterExitUI")
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
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    helper: typingsJapgolly.babylonjs.BABYLON.WebXRExperienceHelper,
    options: typingsJapgolly.babylonjs.BABYLON.WebXREnterExitUIOptions
  ): js.Promise[typingsJapgolly.babylonjs.BABYLON.WebXREnterExitUI] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], helper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.BABYLON.WebXREnterExitUI]]
}
