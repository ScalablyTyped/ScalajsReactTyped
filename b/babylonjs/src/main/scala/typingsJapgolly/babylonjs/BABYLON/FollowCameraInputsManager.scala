package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowCameraInputsManager
  extends StObject
     with CameraInputsManager[FollowCamera] {
  
  /**
    * Add keyboard input support to the input manager.
    * @returns the current input manager
    */
  def addKeyboard(): FollowCameraInputsManager = js.native
  
  /**
    * Add mouse wheel input support to the input manager.
    * @returns the current input manager
    */
  def addMouseWheel(): FollowCameraInputsManager = js.native
  
  /**
    * Add pointers input support to the input manager.
    * @returns the current input manager
    */
  def addPointers(): FollowCameraInputsManager = js.native
  
  /**
    * Add orientation input support to the input manager.
    * @returns the current input manager
    */
  def addVRDeviceOrientation(): FollowCameraInputsManager = js.native
}
