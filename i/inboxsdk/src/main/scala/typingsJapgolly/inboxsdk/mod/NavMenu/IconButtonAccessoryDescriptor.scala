package typingsJapgolly.inboxsdk.mod.NavMenu

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.ICON_BUTTON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconButtonAccessoryDescriptor extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
  var `type`: ICON_BUTTON
  def onClick(): Unit
}

object IconButtonAccessoryDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: Callback, `type`: ICON_BUTTON, iconClass: String = null): IconButtonAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconButtonAccessoryDescriptor]
  }
}

