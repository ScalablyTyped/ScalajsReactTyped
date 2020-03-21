package typingsJapgolly.reactColor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBColor extends _Color {
  var a: js.UndefOr[Double] = js.undefined
  var b: Double
  var g: Double
  var r: Double
}

object RGBColor {
  @scala.inline
  def apply(b: Double, g: Double, r: Double, a: Int | Double = null): RGBColor = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
}

