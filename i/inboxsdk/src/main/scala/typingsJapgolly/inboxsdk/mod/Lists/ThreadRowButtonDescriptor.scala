package typingsJapgolly.inboxsdk.mod.Lists

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[Boolean] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var title: String
  def onClick(event: ThreadRowButtonClickEvent): Unit
}

object ThreadRowButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: String,
    onClick: ThreadRowButtonClickEvent => Callback,
    title: String,
    hasDropdown: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null
  ): ThreadRowButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Lists.ThreadRowButtonClickEvent) => onClick(t0).runNow()))
    if (!js.isUndefined(hasDropdown)) __obj.updateDynamic("hasDropdown")(hasDropdown.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonDescriptor]
  }
}

