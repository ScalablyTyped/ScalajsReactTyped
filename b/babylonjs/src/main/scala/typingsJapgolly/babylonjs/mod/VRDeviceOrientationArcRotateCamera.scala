package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "VRDeviceOrientationArcRotateCamera")
@js.native
open class VRDeviceOrientationArcRotateCamera protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.VRDeviceOrientationArcRotateCamera {
  /**
    * Creates a new VRDeviceOrientationArcRotateCamera
    * @param name defines camera name
    * @param alpha defines the camera rotation along the longitudinal axis
    * @param beta defines the camera rotation along the latitudinal axis
    * @param radius defines the camera distance from its target
    * @param target defines the camera target
    * @param scene defines the scene the camera belongs to
    * @param compensateDistortion defines if the camera needs to compensate the lens distortion
    * @param vrCameraMetrics defines the vr metrics associated to the camera
    */
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    compensateDistortion: Boolean
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    compensateDistortion: Boolean
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    compensateDistortion: Boolean,
    vrCameraMetrics: typingsJapgolly.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    compensateDistortion: Unit,
    vrCameraMetrics: typingsJapgolly.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    compensateDistortion: Boolean,
    vrCameraMetrics: typingsJapgolly.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    compensateDistortion: Unit,
    vrCameraMetrics: typingsJapgolly.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
  ) = this()
}
