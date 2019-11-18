package typingsJapgolly.three

import typingsJapgolly.three.srcLightsLightMod.Light
import typingsJapgolly.three.srcMathSphericalHarmonics3Mod.SphericalHarmonics3
import typingsJapgolly.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/LightProbe", JSImport.Namespace)
@js.native
object srcLightsLightProbeMod extends js.Object {
  @js.native
  class LightProbe () extends Light {
    def this(sh: SphericalHarmonics3) = this()
    def this(sh: SphericalHarmonics3, intensity: Double) = this()
    var isLightProbe: `true` = js.native
    var sh: SphericalHarmonics3 = js.native
  }
  
}

