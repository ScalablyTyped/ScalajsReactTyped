package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.XRInputSource
import typingsJapgolly.babylonjs.anon.Filename
import typingsJapgolly.babylonjs.xRMotionControllerWebXRAbstractMotionControllerMod.IMotionControllerProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXRProfiledMotionController")
@js.native
open class WebXRProfiledMotionController protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.WebXRProfiledMotionController {
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String,
    controllerCache: js.Array[Filename]
  ) = this()
}
