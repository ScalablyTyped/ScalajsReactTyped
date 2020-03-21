package typingsJapgolly.jsonld.mod.Options

import typingsJapgolly.jsonld.jsonldStrings.`@always`
import typingsJapgolly.jsonld.jsonldStrings.`@last`
import typingsJapgolly.jsonld.jsonldStrings.`@link`
import typingsJapgolly.jsonld.jsonldStrings.`@never`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var embed: js.UndefOr[`@last` | `@always` | `@never` | `@link`] = js.undefined
  var explicit: js.UndefOr[Boolean] = js.undefined
  var omitDefault: js.UndefOr[Boolean] = js.undefined
  var requireAll: js.UndefOr[Boolean] = js.undefined
}

object Frame {
  @scala.inline
  def apply(
    embed: `@last` | `@always` | `@never` | `@link` = null,
    explicit: js.UndefOr[Boolean] = js.undefined,
    omitDefault: js.UndefOr[Boolean] = js.undefined,
    requireAll: js.UndefOr[Boolean] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal()
    if (embed != null) __obj.updateDynamic("embed")(embed.asInstanceOf[js.Any])
    if (!js.isUndefined(explicit)) __obj.updateDynamic("explicit")(explicit.asInstanceOf[js.Any])
    if (!js.isUndefined(omitDefault)) __obj.updateDynamic("omitDefault")(omitDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(requireAll)) __obj.updateDynamic("requireAll")(requireAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

