package typingsJapgolly.grommet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grommet.grommetStrings.Africa
import typingsJapgolly.grommet.grommetStrings.Asia
import typingsJapgolly.grommet.grommetStrings.Australia
import typingsJapgolly.grommet.grommetStrings.Europe
import typingsJapgolly.grommet.grommetStrings.`North America`
import typingsJapgolly.grommet.grommetStrings.`South America`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var color: js.UndefOr[String | AnonLight] = js.undefined
  var name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(
    name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`),
    color: String | AnonLight = null,
    onClick: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onHover: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onHover(t0).runNow()))
    __obj.asInstanceOf[AnonName]
  }
}

