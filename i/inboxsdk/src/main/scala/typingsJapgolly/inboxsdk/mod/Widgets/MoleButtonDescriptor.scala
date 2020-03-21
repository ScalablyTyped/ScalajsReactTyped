package typingsJapgolly.inboxsdk.mod.Widgets

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoleButtonDescriptor extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var title: String
  def onClick(): Unit
}

object MoleButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: Callback, title: String, iconClass: String = null): MoleButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoleButtonDescriptor]
  }
}

