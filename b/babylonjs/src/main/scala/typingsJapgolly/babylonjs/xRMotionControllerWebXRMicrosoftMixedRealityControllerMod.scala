package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.Axes
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.MotionControllerHandedness
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRMotionControllerWebXRMicrosoftMixedRealityControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRMicrosoftMixedRealityController", "WebXRMicrosoftMixedRealityController")
  @js.native
  open class WebXRMicrosoftMixedRealityController protected () extends WebXRAbstractMotionController {
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
    
    /* protected */ val _mapping: Axes = js.native
    
    /* protected */ def _updateModel(): Unit = js.native
  }
  /* static members */
  object WebXRMicrosoftMixedRealityController {
    
    @JSImport("babylonjs/XR/motionController/webXRMicrosoftMixedRealityController", "WebXRMicrosoftMixedRealityController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base url used to load the left and right controller models
      */
    @JSImport("babylonjs/XR/motionController/webXRMicrosoftMixedRealityController", "WebXRMicrosoftMixedRealityController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the left controller model file
      */
    @JSImport("babylonjs/XR/motionController/webXRMicrosoftMixedRealityController", "WebXRMicrosoftMixedRealityController.MODEL_LEFT_FILENAME")
    @js.native
    def MODEL_LEFT_FILENAME: String = js.native
    inline def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the right controller model file
      */
    @JSImport("babylonjs/XR/motionController/webXRMicrosoftMixedRealityController", "WebXRMicrosoftMixedRealityController.MODEL_RIGHT_FILENAME")
    @js.native
    def MODEL_RIGHT_FILENAME: String = js.native
    inline def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
  }
}
