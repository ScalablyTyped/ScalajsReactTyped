package typingsJapgolly.next.mod

import typingsJapgolly.next.AnonBodyParser
import typingsJapgolly.next.nextStrings.hybrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageConfig extends js.Object {
  var amp: js.UndefOr[Boolean | hybrid] = js.undefined
  var api: js.UndefOr[AnonBodyParser] = js.undefined
}

object PageConfig {
  @scala.inline
  def apply(amp: Boolean | hybrid = null, api: AnonBodyParser = null): PageConfig = {
    val __obj = js.Dynamic.literal()
    if (amp != null) __obj.updateDynamic("amp")(amp.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageConfig]
  }
}

