package typingsJapgolly.jpm

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var iconURL: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* data */ String, _]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(
    data: String = null,
    iconURL: String = null,
    onClick: /* data */ String => CallbackTo[js.Any] = null,
    text: String = null,
    title: String = null
  ): AnonData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => onClick(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

