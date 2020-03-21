package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.baseui.AnonExpandedBoolean
import typingsJapgolly.baseui.accordionMod.PanelOverrides
import typingsJapgolly.baseui.accordionMod.PanelProps
import typingsJapgolly.baseui.accordionMod.SharedProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Panel {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ AnonExpandedBoolean => CallbackTo[js.Any] = null,
    onClick: /* e */ Event_ => CallbackTo[js.Any] = null,
    onKeyDown: /* e */ KeyboardEvent => CallbackTo[js.Any] = null,
    overrides: PanelOverrides[SharedProps] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PanelProps, typingsJapgolly.baseui.accordionMod.Panel, Unit, PanelProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonExpandedBoolean) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.accordionMod.PanelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.accordionMod.Panel](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.accordionMod.PanelProps])(children: _*)
  }
  @JSImport("baseui/accordion", "Panel")
  @js.native
  object componentImport extends js.Object
  
}

