package typingsJapgolly.lowlight.lowlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightOptions extends js.Object {
  var prefix: js.UndefOr[String] = js.undefined
}

object HighlightOptions {
  @scala.inline
  def apply(prefix: String = null): HighlightOptions = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightOptions]
  }
}

