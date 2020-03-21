package typingsJapgolly.inboxsdk.mod.Toolbars

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonDescriptor extends js.Object {
  var arrowColor: js.UndefOr[String] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var title: String
  var titleClass: js.UndefOr[String] = js.undefined
  def onClick(event: AppToolbarButtonEvent): Unit
}

object AppToolbarButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: String,
    onClick: AppToolbarButtonEvent => Callback,
    title: String,
    arrowColor: String = null,
    iconClass: String = null,
    titleClass: String = null
  ): AppToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Toolbars.AppToolbarButtonEvent) => onClick(t0).runNow()))
    if (arrowColor != null) __obj.updateDynamic("arrowColor")(arrowColor.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppToolbarButtonDescriptor]
  }
}

