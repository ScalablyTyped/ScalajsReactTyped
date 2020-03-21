package typingsJapgolly.baseui.tagMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.baseuiStrings.accent
import typingsJapgolly.baseui.baseuiStrings.custom_
import typingsJapgolly.baseui.baseuiStrings.light
import typingsJapgolly.baseui.baseuiStrings.negative
import typingsJapgolly.baseui.baseuiStrings.neutral
import typingsJapgolly.baseui.baseuiStrings.outlined
import typingsJapgolly.baseui.baseuiStrings.positive
import typingsJapgolly.baseui.baseuiStrings.primary
import typingsJapgolly.baseui.baseuiStrings.solid
import typingsJapgolly.baseui.baseuiStrings.warning
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var closeable: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var isHovered: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[custom_ | accent | primary | neutral | positive | warning | negative] = js.undefined
  var onActionClick: js.UndefOr[js.Function2[/* e */ Event_, /* children */ js.UndefOr[Node], _]] = js.undefined
  var onActionKeyDown: js.UndefOr[js.Function2[/* e */ Event_, /* children */ js.UndefOr[Node], _]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event_, _]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* event */ Event_, _]] = js.undefined
  var overrides: js.UndefOr[TagOverrides] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var variant: js.UndefOr[solid | light | outlined] = js.undefined
}

object TagProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    isHovered: js.UndefOr[Boolean] = js.undefined,
    kind: custom_ | accent | primary | neutral | positive | warning | negative = null,
    onActionClick: (/* e */ Event_, /* children */ js.UndefOr[Node]) => CallbackTo[js.Any] = null,
    onActionKeyDown: (/* e */ Event_, /* children */ js.UndefOr[Node]) => CallbackTo[js.Any] = null,
    onClick: /* event */ Event_ => CallbackTo[js.Any] = null,
    onKeyDown: /* event */ Event_ => CallbackTo[js.Any] = null,
    overrides: TagOverrides = null,
    title: String = null,
    variant: solid | light | outlined = null
  ): TagProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (!js.isUndefined(isHovered)) __obj.updateDynamic("isHovered")(isHovered.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.std.Event_, t1: /* children */ js.UndefOr[japgolly.scalajs.react.raw.React.Node]) => onActionClick(t0, t1).runNow()))
    if (onActionKeyDown != null) __obj.updateDynamic("onActionKeyDown")(js.Any.fromFunction2((t0: /* e */ typingsJapgolly.std.Event_, t1: /* children */ js.UndefOr[japgolly.scalajs.react.raw.React.Node]) => onActionKeyDown(t0, t1).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onKeyDown(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagProps]
  }
}

