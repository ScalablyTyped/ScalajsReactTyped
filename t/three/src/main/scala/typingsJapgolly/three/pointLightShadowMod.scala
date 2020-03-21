package typingsJapgolly.three

import typingsJapgolly.three.lightShadowMod.LightShadow
import typingsJapgolly.three.perspectiveCameraMod.PerspectiveCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/PointLightShadow", JSImport.Namespace)
@js.native
object pointLightShadowMod extends js.Object {
  @js.native
  class PointLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_PointLightShadow: PerspectiveCamera = js.native
  }
  
}

