package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeAttributedIPConversions extends js.Object {
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.native
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.native
}

object AnonIncludeAttributedIPConversions {
  @scala.inline
  def apply(
    includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined
  ): AnonIncludeAttributedIPConversions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAttributedIPConversions)) __obj.updateDynamic("includeAttributedIPConversions")(includeAttributedIPConversions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedCookieConversions)) __obj.updateDynamic("includeUnattributedCookieConversions")(includeUnattributedCookieConversions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedIPConversions)) __obj.updateDynamic("includeUnattributedIPConversions")(includeUnattributedIPConversions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeAttributedIPConversions]
  }
}

