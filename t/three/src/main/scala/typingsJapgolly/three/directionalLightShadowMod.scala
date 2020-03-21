package typingsJapgolly.three

import typingsJapgolly.three.lightShadowMod.LightShadow
import typingsJapgolly.three.orthographicCameraMod.OrthographicCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/DirectionalLightShadow", JSImport.Namespace)
@js.native
object directionalLightShadowMod extends js.Object {
  @js.native
  class DirectionalLightShadow () extends LightShadow {
    @JSName("camera")
    var camera_DirectionalLightShadow: OrthographicCamera = js.native
  }
  
}

