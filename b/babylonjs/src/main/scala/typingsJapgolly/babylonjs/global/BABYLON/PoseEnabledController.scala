package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.DevicePose
import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PoseEnabledController")
@js.native
open class PoseEnabledController protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PoseEnabledController {
  /**
    * Creates a new PoseEnabledController from a gamepad
    * @param browserGamepad the gamepad that the PoseEnabledController should be created from
    */
  def this(browserGamepad: Any) = this()
  
  /**
    * The rotation quaternion of the device in babylon space.
    */
  /* CompleteClass */
  var deviceRotationQuaternion: typingsJapgolly.babylonjs.BABYLON.Quaternion = js.native
  
  /**
    * The scale of the device to be used when translating from device space to babylon space.
    */
  /* CompleteClass */
  var deviceScaleFactor: Double = js.native
  
  /**
    * The position of the object in babylon space.
    */
  /* CompleteClass */
  var position: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The raw pose coming from the device.
    */
  /* CompleteClass */
  var rawPose: Nullable[DevicePose] = js.native
  
  /**
    * The rotation quaternion of the object in babylon space.
    */
  /* CompleteClass */
  var rotationQuaternion: typingsJapgolly.babylonjs.BABYLON.Quaternion = js.native
  
  /**
    * Updates the poseControlled values based on the input device pose.
    * @param poseData the pose data to update the object with
    */
  /* CompleteClass */
  override def updateFromDevice(poseData: DevicePose): Unit = js.native
}
/* static members */
object PoseEnabledController {
  
  /**
    * Name of the child mesh that can be used to cast a ray from the controller
    */
  @JSGlobal("BABYLON.PoseEnabledController.POINTING_POSE")
  @js.native
  val POINTING_POSE: /* "POINTING_POSE" */ String = js.native
}
