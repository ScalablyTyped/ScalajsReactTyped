package typingsJapgolly.grommet.dropButtonMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.grommet.AnonLeft
import typingsJapgolly.grommet.dropMod.DropProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropButtonProps extends js.Object {
  var dropAlign: js.UndefOr[AnonLeft] = js.undefined
  var dropContent: Element
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
}

object DropButtonProps {
  @scala.inline
  def apply(
    dropContent: VdomElement,
    dropAlign: AnonLeft = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    onClose: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onOpen: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    open: js.UndefOr[Boolean] = js.undefined
  ): DropButtonProps = {
    val __obj = js.Dynamic.literal()
    if (dropContent != null) __obj.updateDynamic("dropContent")(dropContent.rawElement.asInstanceOf[js.Any])
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClose(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onOpen(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropButtonProps]
  }
}

