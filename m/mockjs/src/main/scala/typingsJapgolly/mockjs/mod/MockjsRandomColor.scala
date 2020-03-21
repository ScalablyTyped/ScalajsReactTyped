package typingsJapgolly.mockjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Color
// see https://github.com/nuysoft/Mock/wiki/Color
trait MockjsRandomColor extends js.Object {
  // Random.color
  def color(): S
  // Random.hex
  def hex(): S
  // Random.hsl
  def hsl(): S
  // Random.rgb
  def rgb(): S
  // Random.rgba
  def rgba(): S
}

object MockjsRandomColor {
  @scala.inline
  def apply(
    color: CallbackTo[S],
    hex: CallbackTo[S],
    hsl: CallbackTo[S],
    rgb: CallbackTo[S],
    rgba: CallbackTo[S]
  ): MockjsRandomColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color.toJsFn)
    __obj.updateDynamic("hex")(hex.toJsFn)
    __obj.updateDynamic("hsl")(hsl.toJsFn)
    __obj.updateDynamic("rgb")(rgb.toJsFn)
    __obj.updateDynamic("rgba")(rgba.toJsFn)
    __obj.asInstanceOf[MockjsRandomColor]
  }
}

