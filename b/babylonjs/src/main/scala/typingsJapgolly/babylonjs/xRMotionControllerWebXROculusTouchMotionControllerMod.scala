package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.MotionControllerHandedness
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRMotionControllerWebXROculusTouchMotionControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXROculusTouchMotionController", "WebXROculusTouchMotionController")
  @js.native
  open class WebXROculusTouchMotionController protected () extends WebXRAbstractMotionController {
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      _legacyMapping: Boolean
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      _legacyMapping: Boolean,
      _forceLegacyControllers: Boolean
    ) = this()
    def this(
      scene: Scene,
      gamepadObject: IMinimalMotionControllerObject,
      handedness: MotionControllerHandedness,
      _legacyMapping: Unit,
      _forceLegacyControllers: Boolean
    ) = this()
    
    /* private */ var _forceLegacyControllers: Any = js.native
    
    /**
      * Is this the new type of oculus touch. At the moment both have the same profile and it is impossible to differentiate
      * between the touch and touch 2.
      */
    /* private */ var _isQuest: Any = js.native
    
    /* private */ var _modelRootNode: Any = js.native
    
    /* protected */ def _updateModel(): Unit = js.native
  }
  /* static members */
  object WebXROculusTouchMotionController {
    
    @JSImport("babylonjs/XR/motionController/webXROculusTouchMotionController", "WebXROculusTouchMotionController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The base url used to load the left and right controller models
      */
    @JSImport("babylonjs/XR/motionController/webXROculusTouchMotionController", "WebXROculusTouchMotionController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the left controller model file
      */
    @JSImport("babylonjs/XR/motionController/webXROculusTouchMotionController", "WebXROculusTouchMotionController.MODEL_LEFT_FILENAME")
    @js.native
    def MODEL_LEFT_FILENAME: String = js.native
    inline def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the right controller model file
      */
    @JSImport("babylonjs/XR/motionController/webXROculusTouchMotionController", "WebXROculusTouchMotionController.MODEL_RIGHT_FILENAME")
    @js.native
    def MODEL_RIGHT_FILENAME: String = js.native
    inline def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * Base Url for the Quest controller model.
      */
    @JSImport("babylonjs/XR/motionController/webXROculusTouchMotionController", "WebXROculusTouchMotionController.QUEST_MODEL_BASE_URL")
    @js.native
    def QUEST_MODEL_BASE_URL: String = js.native
    inline def QUEST_MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEST_MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  }
}
