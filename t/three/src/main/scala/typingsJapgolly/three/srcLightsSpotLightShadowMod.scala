package typingsJapgolly.three

import typingsJapgolly.three.srcCamerasPerspectiveCameraMod.PerspectiveCamera
import typingsJapgolly.three.srcLightsLightShadowMod.LightShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/SpotLightShadow", JSImport.Namespace)
@js.native
object srcLightsSpotLightShadowMod extends js.Object {
  @js.native
  class SpotLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_SpotLightShadow: PerspectiveCamera = js.native
  }
  
}

