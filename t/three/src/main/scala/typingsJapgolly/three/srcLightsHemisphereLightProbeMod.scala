package typingsJapgolly.three

import typingsJapgolly.three.srcLightsLightProbeMod.LightProbe
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/HemisphereLightProbe", JSImport.Namespace)
@js.native
object srcLightsHemisphereLightProbeMod extends js.Object {
  @js.native
  class HemisphereLightProbe () extends LightProbe {
    def this(skyColor: String) = this()
    def this(skyColor: Double) = this()
    def this(skyColor: Color) = this()
    def this(skyColor: String, groundColor: String) = this()
    def this(skyColor: String, groundColor: Double) = this()
    def this(skyColor: String, groundColor: Color) = this()
    def this(skyColor: Double, groundColor: String) = this()
    def this(skyColor: Double, groundColor: Double) = this()
    def this(skyColor: Double, groundColor: Color) = this()
    def this(skyColor: Color, groundColor: String) = this()
    def this(skyColor: Color, groundColor: Double) = this()
    def this(skyColor: Color, groundColor: Color) = this()
    def this(skyColor: String, groundColor: String, intensity: Double) = this()
    def this(skyColor: String, groundColor: Double, intensity: Double) = this()
    def this(skyColor: String, groundColor: Color, intensity: Double) = this()
    def this(skyColor: Double, groundColor: String, intensity: Double) = this()
    def this(skyColor: Double, groundColor: Double, intensity: Double) = this()
    def this(skyColor: Double, groundColor: Color, intensity: Double) = this()
    def this(skyColor: Color, groundColor: String, intensity: Double) = this()
    def this(skyColor: Color, groundColor: Double, intensity: Double) = this()
    def this(skyColor: Color, groundColor: Color, intensity: Double) = this()
    var isHemisphereLightProbe: `true` = js.native
  }
  
}

