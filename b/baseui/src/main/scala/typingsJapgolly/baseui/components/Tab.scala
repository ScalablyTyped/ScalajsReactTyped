package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.baseui.tabsMod.SharedProps
import typingsJapgolly.baseui.tabsMod.TabOverrides
import typingsJapgolly.baseui.tabsMod.TabProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab {
  def apply(
    $orientation: horizontal | vertical = null,
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onClick: /* e */ Event_ => CallbackTo[js.Any] = null,
    onKeyDown: /* e */ KeyboardEvent => CallbackTo[js.Any] = null,
    onSelect: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    overrides: TabOverrides[SharedProps] = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabProps, typingsJapgolly.baseui.tabsMod.Tab, Unit, TabProps] = {
    val __obj = js.Dynamic.literal()
  
      if ($orientation != null) __obj.updateDynamic("$orientation")($orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    onSelect.foreach(p => __obj.updateDynamic("onSelect")(p.toJsFn))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.tabsMod.TabProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.tabsMod.Tab](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tabsMod.TabProps])(children: _*)
  }
  @JSImport("baseui/tabs", "Tab")
  @js.native
  object componentImport extends js.Object
  
}

