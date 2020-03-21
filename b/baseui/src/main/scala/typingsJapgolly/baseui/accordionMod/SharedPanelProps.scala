package typingsJapgolly.baseui.accordionMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.baseui.AnonExpandedBoolean
import typingsJapgolly.react.mod.Key
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedPanelProps extends js.Object {
  var children: Node
  var disabled: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonExpandedBoolean, _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.undefined
  var overrides: js.UndefOr[PanelOverrides[SharedProps]] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object SharedPanelProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onChange: /* args */ AnonExpandedBoolean => CallbackTo[js.Any] = null,
    onClick: /* e */ Event_ => CallbackTo[js.Any] = null,
    onKeyDown: /* e */ KeyboardEvent => CallbackTo[js.Any] = null,
    overrides: PanelOverrides[SharedProps] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    title: VdomNode = null
  ): SharedPanelProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonExpandedBoolean) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPanelProps]
  }
}

