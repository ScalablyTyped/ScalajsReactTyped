package typingsJapgolly.grommet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var value: Double | js.Array[Double]
}

object AnonLabel {
  @scala.inline
  def apply(
    value: Double | js.Array[Double],
    label: String = null,
    onClick: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onHover: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): AnonLabel = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onHover(t0).runNow()))
    __obj.asInstanceOf[AnonLabel]
  }
}

