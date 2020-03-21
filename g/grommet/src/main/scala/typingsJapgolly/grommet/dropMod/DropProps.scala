package typingsJapgolly.grommet.dropMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.grommet.AnonHorizontal
import typingsJapgolly.grommet.AnonLeft
import typingsJapgolly.grommet.grommetStrings.auto
import typingsJapgolly.grommet.grommetStrings.hidden
import typingsJapgolly.grommet.grommetStrings.scroll
import typingsJapgolly.grommet.grommetStrings.visible
import typingsJapgolly.grommet.utilsMod.ElevationType
import typingsJapgolly.grommet.utilsMod.KeyboardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropProps extends js.Object {
  var align: js.UndefOr[AnonLeft] = js.undefined
  var elevation: js.UndefOr[ElevationType] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onEsc: js.UndefOr[KeyboardType] = js.undefined
  var overflow: js.UndefOr[auto | hidden | scroll | visible | AnonHorizontal | String] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Boolean] = js.undefined
  var restrictFocus: js.UndefOr[Boolean] = js.undefined
  var stretch: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[js.Object] = js.undefined
}

object DropProps {
  @scala.inline
  def apply(
    align: AnonLeft = null,
    elevation: ElevationType = null,
    onClickOutside: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onEsc: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback = null,
    overflow: auto | hidden | scroll | visible | AnonHorizontal | String = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    responsive: js.UndefOr[Boolean] = js.undefined,
    restrictFocus: js.UndefOr[Boolean] = js.undefined,
    stretch: js.UndefOr[Boolean] = js.undefined,
    target: js.Object = null
  ): DropProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClickOutside(t0).runNow()))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onEsc(t0).runNow()))
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictFocus)) __obj.updateDynamic("restrictFocus")(restrictFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(stretch)) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropProps]
  }
}

