package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
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
import typingsJapgolly.baseui.tagMod.TagOverrides
import typingsJapgolly.baseui.tagMod.TagProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tag {
  def apply(
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
    variant: solid | light | outlined = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TagProps, typingsJapgolly.baseui.tagMod.Tag, Unit, TagProps] = {
    val __obj = js.Dynamic.literal()
  
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.tagMod.TagProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.tagMod.Tag](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tagMod.TagProps])(children: _*)
  }
  @JSImport("baseui/tag", "Tag")
  @js.native
  object componentImport extends js.Object
  
}

