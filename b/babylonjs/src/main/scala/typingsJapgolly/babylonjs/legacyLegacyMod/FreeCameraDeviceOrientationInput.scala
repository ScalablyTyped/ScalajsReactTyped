package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "FreeCameraDeviceOrientationInput")
@js.native
/**
  * Instantiates a new input
  * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
open class FreeCameraDeviceOrientationInput ()
  extends typingsJapgolly.babylonjs.indexMod.FreeCameraDeviceOrientationInput
/* static members */
object FreeCameraDeviceOrientationInput {
  
  @JSImport("babylonjs/Legacy/legacy", "FreeCameraDeviceOrientationInput")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Can be used to detect if a device orientation sensor is available on a device
    * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
    * @returns a promise that will resolve on orientation change
    */
  inline def WaitForOrientationChangeAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")().asInstanceOf[js.Promise[Unit]]
  inline def WaitForOrientationChangeAsync(timeout: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
