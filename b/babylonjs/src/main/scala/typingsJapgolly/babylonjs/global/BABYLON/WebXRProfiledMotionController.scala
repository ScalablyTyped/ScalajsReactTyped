package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IMotionControllerProfile
import typingsJapgolly.babylonjs.XRInputSource
import typingsJapgolly.babylonjs.anon.Meshes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRProfiledMotionController")
@js.native
open class WebXRProfiledMotionController protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRProfiledMotionController {
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    xrInput: XRInputSource,
    _profile: IMotionControllerProfile,
    _repositoryUrl: String,
    controllerCache: js.Array[Meshes]
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
