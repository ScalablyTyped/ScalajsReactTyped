package typingsJapgolly.reactNotificationSystemRedux.mod

import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactNotificationSystem.mod.Attributes
import typingsJapgolly.reactNotificationSystem.mod.Notification
import typingsJapgolly.reactNotificationSystem.mod.Style
import typingsJapgolly.reactNotificationSystem.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsProps extends Attributes {
  var notifications: js.UndefOr[js.Array[Notification]] = js.undefined
}

object NotificationsProps {
  @scala.inline
  def apply(
    allowHTML: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    noAnimation: js.UndefOr[Boolean] = js.undefined,
    notifications: js.Array[Notification] = null,
    ref: LegacyRef[System] = null,
    style: Style | Boolean = null
  ): NotificationsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsProps]
  }
}

