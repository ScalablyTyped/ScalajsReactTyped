package typingsJapgolly.inboxsdk.mod.Lists

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.LINK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowActionButtonDescriptor extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var title: String
  var `type`: LINK
  var url: String
}

object ThreadRowActionButtonDescriptor {
  @scala.inline
  def apply(
    title: String,
    `type`: LINK,
    url: String,
    className: String = null,
    onClick: /* event */ js.Any => Callback = null
  ): ThreadRowActionButtonDescriptor = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ js.Any) => onClick(t0).runNow()))
    __obj.asInstanceOf[ThreadRowActionButtonDescriptor]
  }
}

