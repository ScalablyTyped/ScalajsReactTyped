package typingsJapgolly.babylonjs.postProcessesIndexMod

import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.camerasVRVrCameraMetricsMod.VRCameraMetrics
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "VRDistortionCorrectionPostProcess")
@js.native
open class VRDistortionCorrectionPostProcess protected ()
  extends typingsJapgolly.babylonjs.postProcessesVrDistortionCorrectionPostProcessMod.VRDistortionCorrectionPostProcess {
  /**
    * Initializes the VRDistortionCorrectionPostProcess
    * @param name The name of the effect.
    * @param camera The camera to apply the render pass to.
    * @param isRightEye If this is for the right eye distortion
    * @param vrMetrics All the required metrics for the VR camera
    */
  def this(name: String, camera: Nullable[Camera], isRightEye: Boolean, vrMetrics: VRCameraMetrics) = this()
}
