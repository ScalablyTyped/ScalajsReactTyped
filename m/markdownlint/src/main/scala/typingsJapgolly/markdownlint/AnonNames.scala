package typingsJapgolly.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNames extends js.Object {
  var code_blocks: js.UndefOr[Boolean] = js.undefined
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object AnonNames {
  @scala.inline
  def apply(code_blocks: js.UndefOr[Boolean] = js.undefined, names: js.Array[String] = null): AnonNames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNames]
  }
}

