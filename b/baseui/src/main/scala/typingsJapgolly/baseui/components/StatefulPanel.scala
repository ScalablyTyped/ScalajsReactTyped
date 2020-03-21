package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.baseui.AnonExpandedBoolean
import typingsJapgolly.baseui.accordionMod.PanelOverrides
import typingsJapgolly.baseui.accordionMod.PanelState
import typingsJapgolly.baseui.accordionMod.SharedProps
import typingsJapgolly.baseui.accordionMod.StatefulPanelProps
import typingsJapgolly.baseui.baseuiStrings.expand
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPanel {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: PanelState = null,
    onChange: /* args */ AnonExpandedBoolean => CallbackTo[js.Any] = null,
    onClick: /* e */ Event_ => CallbackTo[js.Any] = null,
    onKeyDown: /* e */ KeyboardEvent => CallbackTo[js.Any] = null,
    overrides: PanelOverrides[SharedProps] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (expand, PanelState, PanelState) => CallbackTo[PanelState] = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    StatefulPanelProps, 
    MountedWithRawType[StatefulPanelProps, js.Object, RawMounted[StatefulPanelProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonExpandedBoolean) => onChange(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.KeyboardEvent) => onKeyDown(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.expand, t1: typingsJapgolly.baseui.accordionMod.PanelState, t2: typingsJapgolly.baseui.accordionMod.PanelState) => stateReducer(t0, t1, t2).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.accordionMod.StatefulPanelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.accordionMod.StatefulPanelProps])(children: _*)
  }
  @JSImport("baseui/accordion", "StatefulPanel")
  @js.native
  object componentImport extends js.Object
  
}

