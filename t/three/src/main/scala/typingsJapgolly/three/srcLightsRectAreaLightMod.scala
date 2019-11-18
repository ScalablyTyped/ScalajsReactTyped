package typingsJapgolly.three

import typingsJapgolly.three.srcLightsLightMod.Light
import typingsJapgolly.three.srcMathColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/RectAreaLight", JSImport.Namespace)
@js.native
object srcLightsRectAreaLightMod extends js.Object {
  @js.native
  class RectAreaLight () extends Light {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
    def this(color: String, intensity: Double, width: Double) = this()
    def this(color: Double, intensity: Double, width: Double) = this()
    def this(color: Color, intensity: Double, width: Double) = this()
    def this(color: String, intensity: Double, width: Double, height: Double) = this()
    def this(color: Double, intensity: Double, width: Double, height: Double) = this()
    def this(color: Color, intensity: Double, width: Double, height: Double) = this()
    var height: Double = js.native
    var width: Double = js.native
  }
  
}

