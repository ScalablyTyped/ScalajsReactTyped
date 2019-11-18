package typingsJapgolly.three

import typingsJapgolly.three.srcLightsLightMod.Light
import typingsJapgolly.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/HemisphereLight", JSImport.Namespace)
@js.native
object srcLightsHemisphereLightMod extends js.Object {
  @js.native
  class HemisphereLight () extends Light {
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
    var groundColor: Color = js.native
    var skyColor: Color = js.native
  }
  
}

