package typingsJapgolly.d3Color.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color_ extends js.Object {
  /**
    * Returns true if and only if the color is displayable on standard hardware.
    * For example, this returns false for an RGB color if any channel value is less than zero or greater than 255, or if the opacity is not in the range [0, 1].
    */
  def displayable(): Boolean
   // Note: While this method is used in prototyping for colors of specific colorspaces, it should not be called directly, as 'this.rgb' would not be implemented on Color
  /**
    * Returns a hexadecimal string representing this color.
    * If this color is not displayable, a suitable displayable color is returned instead. For example, RGB channel values greater than 255 are clamped to 255.
    */
  def hex(): String
}

object Color_ {
  @scala.inline
  def apply(displayable: CallbackTo[Boolean], hex: CallbackTo[String]): Color_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayable")(displayable.toJsFn)
    __obj.updateDynamic("hex")(hex.toJsFn)
    __obj.asInstanceOf[Color_]
  }
}

