package typingsJapgolly.babylonjs.xRIndexMod

import typingsJapgolly.babylonjs.XRInputSource
import typingsJapgolly.babylonjs.anon.Filename
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMotionControllerProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRProfiledMotionController")
@js.native
open class WebXRProfiledMotionController protected ()
  extends typingsJapgolly.babylonjs.xRMotionControllerIndexMod.WebXRProfiledMotionController {
  def this(scene: Scene, xrInput: XRInputSource, _profile: IMotionControllerProfile, _repositoryUrl: String) = this()
  def this(
    scene: Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String,
    controllerCache: js.Array[Filename]
  ) = this()
}
