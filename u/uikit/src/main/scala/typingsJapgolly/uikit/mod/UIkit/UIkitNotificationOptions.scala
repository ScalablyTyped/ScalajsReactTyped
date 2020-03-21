package typingsJapgolly.uikit.mod.UIkit

import typingsJapgolly.uikit.uikitStrings.`bottom-center`
import typingsJapgolly.uikit.uikitStrings.`bottom-left`
import typingsJapgolly.uikit.uikitStrings.`bottom-right`
import typingsJapgolly.uikit.uikitStrings.`top-center`
import typingsJapgolly.uikit.uikitStrings.`top-left`
import typingsJapgolly.uikit.uikitStrings.`top-right`
import typingsJapgolly.uikit.uikitStrings.danger
import typingsJapgolly.uikit.uikitStrings.primary
import typingsJapgolly.uikit.uikitStrings.success
import typingsJapgolly.uikit.uikitStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitNotificationOptions extends js.Object {
  var group: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var pos: js.UndefOr[
    `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.undefined
  var status: js.UndefOr[primary | success | warning | danger] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object UIkitNotificationOptions {
  @scala.inline
  def apply(
    group: String = null,
    message: String = null,
    pos: `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` = null,
    status: primary | success | warning | danger = null,
    timeout: Int | Double = null
  ): UIkitNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitNotificationOptions]
  }
}

