package typingsJapgolly.grommet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var color: js.UndefOr[String | AnonLight] = js.undefined
  var location: js.Array[Double]
  var name: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object AnonLocation {
  @scala.inline
  def apply(
    location: js.Array[Double],
    color: String | AnonLight = null,
    name: String = null,
    onClick: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onHover: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): AnonLocation = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onHover(t0).runNow()))
    __obj.asInstanceOf[AnonLocation]
  }
}

