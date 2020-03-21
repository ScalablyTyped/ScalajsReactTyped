package typingsJapgolly.gradientString.mod

import typingsJapgolly.tinycolor2.mod.ColorInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionedColorInput extends js.Object {
  var color: ColorInput
  var pos: Double
}

object PositionedColorInput {
  @scala.inline
  def apply(color: ColorInput, pos: Double): PositionedColorInput = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PositionedColorInput]
  }
}

