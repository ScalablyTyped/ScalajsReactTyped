package typingsJapgolly.three

import typingsJapgolly.three.srcCamerasCameraMod.Camera
import typingsJapgolly.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/cameras/StereoCamera", JSImport.Namespace)
@js.native
object srcCamerasStereoCameraMod extends js.Object {
  @js.native
  class StereoCamera () extends Camera {
    var aspect: Double = js.native
    var cameraL: PerspectiveCamera = js.native
    var cameraR: PerspectiveCamera = js.native
    var eyeSep: Double = js.native
    @JSName("type")
    var type_StereoCamera: typingsJapgolly.three.threeStrings.StereoCamera = js.native
    def update(camera: PerspectiveCamera): Unit = js.native
  }
  
}

