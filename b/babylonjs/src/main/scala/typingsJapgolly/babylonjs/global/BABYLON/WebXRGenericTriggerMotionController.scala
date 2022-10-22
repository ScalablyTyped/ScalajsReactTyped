package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IMinimalMotionControllerObject
import typingsJapgolly.babylonjs.BABYLON.MotionControllerHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRGenericTriggerMotionController")
@js.native
open class WebXRGenericTriggerMotionController protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.WebXRGenericTriggerMotionController {
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    gamepadObject: IMinimalMotionControllerObject,
    handedness: MotionControllerHandedness
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object WebXRGenericTriggerMotionController {
  
  @JSGlobal("BABYLON.WebXRGenericTriggerMotionController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static version of the profile id of this controller
    */
  @JSGlobal("BABYLON.WebXRGenericTriggerMotionController.ProfileId")
  @js.native
  def ProfileId: String = js.native
  inline def ProfileId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProfileId")(x.asInstanceOf[js.Any])
}
