package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  /**
  		 * Sets the font of the current value label text.
  		 */
  var font: PartialFont
  /**
  		 * The amount of space, in pixels, between the current value label
  		 * and the slider.
  		 */
  var offset: Double
  /**
  		 * When currentvalue.visible is true, this sets the prefix of the label.
  		 */
  var prefix: String
  /**
  		 * When currentvalue.visible is true, this sets the suffix of the label.
  		 */
  var suffix: String
  /**
  		 * Shows the currently-selected value above the slider.
  		 */
  var visible: Boolean
  /**
  		 * The alignment of the value readout relative to the length of the slider.
  		 */
  var xanchor: left | center | right
}

object AnonOffset {
  @scala.inline
  def apply(
    font: PartialFont,
    offset: Double,
    prefix: String,
    suffix: String,
    visible: Boolean,
    xanchor: left | center | right
  ): AnonOffset = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOffset]
  }
}

