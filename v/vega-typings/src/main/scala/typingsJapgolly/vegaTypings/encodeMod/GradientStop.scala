package typingsJapgolly.vegaTypings.encodeMod

import typingsJapgolly.vegaTypings.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStop extends js.Object {
  /**
    * The color value at this point in the gradient.
    */
  var color: Color
  /**
    * The offset fraction for the color stop, indicating its position within the gradient.
    */
  var offset: Double
}

object GradientStop {
  @scala.inline
  def apply(color: Color, offset: Double): GradientStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GradientStop]
  }
}

