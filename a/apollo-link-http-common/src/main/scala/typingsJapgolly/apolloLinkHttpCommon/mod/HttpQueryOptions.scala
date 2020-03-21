package typingsJapgolly.apolloLinkHttpCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpQueryOptions extends js.Object {
  var includeExtensions: js.UndefOr[Boolean] = js.undefined
  var includeQuery: js.UndefOr[Boolean] = js.undefined
}

object HttpQueryOptions {
  @scala.inline
  def apply(
    includeExtensions: js.UndefOr[Boolean] = js.undefined,
    includeQuery: js.UndefOr[Boolean] = js.undefined
  ): HttpQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeExtensions)) __obj.updateDynamic("includeExtensions")(includeExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeQuery)) __obj.updateDynamic("includeQuery")(includeQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpQueryOptions]
  }
}

