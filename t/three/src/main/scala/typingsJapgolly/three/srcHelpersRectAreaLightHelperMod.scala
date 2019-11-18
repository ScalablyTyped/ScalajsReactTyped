package typingsJapgolly.three

import typingsJapgolly.three.srcLightsRectAreaLightMod.RectAreaLight
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcObjectsLineMod.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/helpers/RectAreaLightHelper", JSImport.Namespace)
@js.native
object srcHelpersRectAreaLightHelperMod extends js.Object {
  @js.native
  class RectAreaLightHelper protected () extends Line {
    def this(light: RectAreaLight) = this()
    def this(light: RectAreaLight, color: String) = this()
    def this(light: RectAreaLight, color: Double) = this()
    def this(light: RectAreaLight, color: Color) = this()
    var color: js.UndefOr[Color | String | Double] = js.native
    var light: RectAreaLight = js.native
    def dispose(): Unit = js.native
    def update(): Unit = js.native
  }
  
}

