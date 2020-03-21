package typingsJapgolly.zui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: js.UndefOr[ActionFunc] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(
    action: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    html: String = null,
    icon: String = null,
    name: String = null,
    text: String = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    action.foreach(p => __obj.updateDynamic("action")(p.toJsFn))
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

