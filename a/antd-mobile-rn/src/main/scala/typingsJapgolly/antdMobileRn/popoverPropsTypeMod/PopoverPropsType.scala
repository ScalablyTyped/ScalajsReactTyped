package typingsJapgolly.antdMobileRn.popoverPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverPropsType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
  var overlay: Node
}

object PopoverPropsType {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Callback = null,
    overlay: VdomNode = null
  ): PopoverPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* node */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => onSelect(t0, t1).runNow()))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverPropsType]
  }
}

