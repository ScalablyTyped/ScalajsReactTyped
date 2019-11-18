package typingsJapgolly.node.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLFormatOptions extends js.Object {
  var auth: js.UndefOr[Boolean] = js.undefined
  var fragment: js.UndefOr[Boolean] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var unicode: js.UndefOr[Boolean] = js.undefined
}

object URLFormatOptions {
  @scala.inline
  def apply(
    auth: js.UndefOr[Boolean] = js.undefined,
    fragment: js.UndefOr[Boolean] = js.undefined,
    search: js.UndefOr[Boolean] = js.undefined,
    unicode: js.UndefOr[Boolean] = js.undefined
  ): URLFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(fragment)) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLFormatOptions]
  }
}

