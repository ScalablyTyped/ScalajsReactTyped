package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.Filename
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMotionControllerProfile
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.WebXRAbstractMotionController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRMotionControllerWebXRProfiledMotionControllerMod {
  
  @JSImport("babylonjs/XR/motionController/webXRProfiledMotionController", "WebXRProfiledMotionController")
  @js.native
  open class WebXRProfiledMotionController protected () extends WebXRAbstractMotionController {
    def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
    def this(
      scene: Scene,
      xrInput: XRInputSource,
      _profile: IMotionControllerProfile,
      _repositoryUrl: String,
      controllerCache: js.Array[Filename]
    ) = this()
    
    /* private */ var _buttonMeshMapping: Any = js.native
    
    /* private */ var _repositoryUrl: Any = js.native
    
    /* private */ var _touchDots: Any = js.native
    
    /* private */ var controllerCache: Any = js.native
  }
}
