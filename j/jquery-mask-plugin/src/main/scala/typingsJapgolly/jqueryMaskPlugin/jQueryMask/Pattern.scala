package typingsJapgolly.jqueryMaskPlugin.jQueryMask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  var fallback: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var pattern: js.UndefOr[js.RegExp] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object Pattern {
  @scala.inline
  def apply(
    fallback: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    pattern: js.RegExp = null,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): Pattern = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

