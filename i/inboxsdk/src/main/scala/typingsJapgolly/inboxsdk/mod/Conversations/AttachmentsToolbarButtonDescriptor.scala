package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsToolbarButtonDescriptor extends js.Object {
  var iconUrl: String
  var tooltip: String
  def onClick(event: AttachmentsToolbarButtonEvent): Unit
}

object AttachmentsToolbarButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: AttachmentsToolbarButtonEvent => Callback, tooltip: String): AttachmentsToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Conversations.AttachmentsToolbarButtonEvent) => onClick(t0).runNow()))
    __obj.asInstanceOf[AttachmentsToolbarButtonDescriptor]
  }
}

