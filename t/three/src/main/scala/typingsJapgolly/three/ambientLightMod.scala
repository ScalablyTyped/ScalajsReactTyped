package typingsJapgolly.three

import typingsJapgolly.three.colorMod.Color
import typingsJapgolly.three.lightMod.Light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/lights/AmbientLight", JSImport.Namespace)
@js.native
object ambientLightMod extends js.Object {
  @js.native
  /**
  	 * This creates a Ambientlight with a color.
  	 * @param color Numeric value of the RGB component of the color or a Color instance.
  	 */
  class AmbientLight () extends Light {
    def this(color: String) = this()
    def this(color: Double) = this()
    def this(color: Color) = this()
    def this(color: String, intensity: Double) = this()
    def this(color: Double, intensity: Double) = this()
    def this(color: Color, intensity: Double) = this()
  }
  
}

