package typingsJapgolly.xummApi.mod

import typingsJapgolly.xummApi.AnonExpire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XummPayloadBodyBase extends js.Object {
  var custom_meta: js.UndefOr[XummCustomMeta] = js.undefined
  var options: js.UndefOr[AnonExpire] = js.undefined
  var user_token: js.UndefOr[String] = js.undefined
}

object XummPayloadBodyBase {
  @scala.inline
  def apply(custom_meta: XummCustomMeta = null, options: AnonExpire = null, user_token: String = null): XummPayloadBodyBase = {
    val __obj = js.Dynamic.literal()
    if (custom_meta != null) __obj.updateDynamic("custom_meta")(custom_meta.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (user_token != null) __obj.updateDynamic("user_token")(user_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[XummPayloadBodyBase]
  }
}

