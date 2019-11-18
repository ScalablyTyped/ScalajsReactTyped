package typingsJapgolly.d3DashColor.d3DashColorMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
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

object Color {
  @scala.inline
  def apply(displayable: CallbackTo[Boolean], hex: CallbackTo[String]): Color = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayable")(displayable.toJsFn)
    __obj.updateDynamic("hex")(hex.toJsFn)
    __obj.asInstanceOf[Color]
  }
}

@JSImport("d3-color", "color")
@js.native
object color extends TopLevel[ColorFactory]

