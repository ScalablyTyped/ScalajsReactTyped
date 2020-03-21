package typingsJapgolly.reactNotificationSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends js.Object {
  var Action: js.UndefOr[ItemStyle] = js.undefined
  var ActionWrapper: js.UndefOr[WrapperStyle] = js.undefined
  var Containers: js.UndefOr[ContainersStyle] = js.undefined
  var Dismiss: js.UndefOr[ItemStyle] = js.undefined
  var MessageWrapper: js.UndefOr[WrapperStyle] = js.undefined
  var NotificationItem: js.UndefOr[ItemStyle] = js.undefined
  var Title: js.UndefOr[ItemStyle] = js.undefined
  var Wrapper: js.UndefOr[js.Any] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    Action: ItemStyle = null,
    ActionWrapper: WrapperStyle = null,
    Containers: ContainersStyle = null,
    Dismiss: ItemStyle = null,
    MessageWrapper: WrapperStyle = null,
    NotificationItem: ItemStyle = null,
    Title: ItemStyle = null,
    Wrapper: js.Any = null
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (ActionWrapper != null) __obj.updateDynamic("ActionWrapper")(ActionWrapper.asInstanceOf[js.Any])
    if (Containers != null) __obj.updateDynamic("Containers")(Containers.asInstanceOf[js.Any])
    if (Dismiss != null) __obj.updateDynamic("Dismiss")(Dismiss.asInstanceOf[js.Any])
    if (MessageWrapper != null) __obj.updateDynamic("MessageWrapper")(MessageWrapper.asInstanceOf[js.Any])
    if (NotificationItem != null) __obj.updateDynamic("NotificationItem")(NotificationItem.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Wrapper != null) __obj.updateDynamic("Wrapper")(Wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

