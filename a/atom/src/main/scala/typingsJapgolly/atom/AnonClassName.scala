package typingsJapgolly.atom

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onDidClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonClassName {
  @scala.inline
  def apply(
    className: String = null,
    onDidClick: /* event */ MouseEvent => Callback = null,
    text: String = null
  ): AnonClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onDidClick != null) __obj.updateDynamic("onDidClick")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.MouseEvent) => onDidClick(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassName]
  }
}

