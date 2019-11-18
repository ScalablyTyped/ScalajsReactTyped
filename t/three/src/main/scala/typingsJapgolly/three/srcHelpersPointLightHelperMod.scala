package typingsJapgolly.three

import typingsJapgolly.three.srcCoreObject3DMod.Object3D
import typingsJapgolly.three.srcLightsPointLightMod.PointLight
import typingsJapgolly.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/PointLightHelper", JSImport.Namespace)
@js.native
object srcHelpersPointLightHelperMod extends js.Object {
  @js.native
  class PointLightHelper protected () extends Object3D {
    def this(light: PointLight) = this()
    def this(light: PointLight, sphereSize: Double) = this()
    def this(light: PointLight, sphereSize: Double, color: String) = this()
    def this(light: PointLight, sphereSize: Double, color: Double) = this()
    def this(light: PointLight, sphereSize: Double, color: Color) = this()
    var color: js.UndefOr[Color | String | Double] = js.native
    var light: PointLight = js.native
    def dispose(): Unit = js.native
    def update(): Unit = js.native
  }
  
}

