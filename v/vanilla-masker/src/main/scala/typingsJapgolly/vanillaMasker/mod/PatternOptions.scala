package typingsJapgolly.vanillaMasker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternOptions extends js.Object {
  // Pattern to mask value against.
  var pattern: js.UndefOr[String] = js.undefined
  // Placeholder option to represent remaining characters to be entered
  var placeholder: js.UndefOr[String] = js.undefined
}

object PatternOptions {
  @scala.inline
  def apply(pattern: String = null, placeholder: String = null): PatternOptions = {
    val __obj = js.Dynamic.literal()
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternOptions]
  }
}

