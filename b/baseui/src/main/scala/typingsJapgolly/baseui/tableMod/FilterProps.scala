package typingsJapgolly.baseui.tableMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var children: Node
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onReset: js.UndefOr[js.Function0[_]] = js.undefined
  var onSelectAll: js.UndefOr[js.Function0[_]] = js.undefined
  var overrides: js.UndefOr[AnonContent] = js.undefined
}

object FilterProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onReset: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onSelectAll: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    overrides: AnonContent = null
  ): FilterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    onReset.foreach(p => __obj.updateDynamic("onReset")(p.toJsFn))
    onSelectAll.foreach(p => __obj.updateDynamic("onSelectAll")(p.toJsFn))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterProps]
  }
}

