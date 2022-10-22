package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.WebXRRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
/* private */ open class WebXRDefaultExperience ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRDefaultExperience {
  
  /**
    * Base experience
    */
  /* CompleteClass */
  var baseExperience: typingsJapgolly.babylonjs.BABYLON.WebXRExperienceHelper = js.native
  
  /**
    * Disposes of the experience helper
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Enables ui for entering/exiting xr
    */
  /* CompleteClass */
  var enterExitUI: typingsJapgolly.babylonjs.BABYLON.WebXREnterExitUI = js.native
  
  /**
    * Input experience extension
    */
  /* CompleteClass */
  var input: typingsJapgolly.babylonjs.BABYLON.WebXRInput = js.native
  
  /**
    * Enables near interaction for hands/controllers
    */
  /* CompleteClass */
  var nearInteraction: typingsJapgolly.babylonjs.BABYLON.WebXRNearInteraction = js.native
  
  /**
    * Enables laser pointer and selection
    */
  /* CompleteClass */
  var pointerSelection: typingsJapgolly.babylonjs.BABYLON.WebXRControllerPointerSelection = js.native
  
  /**
    * Default target xr should render to
    */
  /* CompleteClass */
  var renderTarget: WebXRRenderTarget = js.native
  
  /**
    * Enables teleportation
    */
  /* CompleteClass */
  var teleportation: typingsJapgolly.babylonjs.BABYLON.WebXRMotionControllerTeleportation = js.native
}
/* static members */
object WebXRDefaultExperience {
  
  @JSGlobal("BABYLON.WebXRDefaultExperience")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  inline def CreateAsync(scene: typingsJapgolly.babylonjs.BABYLON.Scene): js.Promise[typingsJapgolly.babylonjs.BABYLON.WebXRDefaultExperience] = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.BABYLON.WebXRDefaultExperience]]
  inline def CreateAsync(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    options: typingsJapgolly.babylonjs.BABYLON.WebXRDefaultExperienceOptions
  ): js.Promise[typingsJapgolly.babylonjs.BABYLON.WebXRDefaultExperience] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.babylonjs.BABYLON.WebXRDefaultExperience]]
}
