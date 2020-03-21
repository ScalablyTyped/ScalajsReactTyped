package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonActiveKey
import typingsJapgolly.baseui.SharedPropsactiveboolean
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.baseui.tabsMod.State
import typingsJapgolly.baseui.tabsMod.StatefulTabsProps
import typingsJapgolly.baseui.tabsMod.TabsOverrides
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulTabs {
  def apply(
    activeKey: Key = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: State = null,
    onChange: /* args */ AnonActiveKey => CallbackTo[js.Any] = null,
    orientation: horizontal | vertical = null,
    overrides: TabsOverrides[SharedPropsactiveboolean] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StatefulTabsProps, 
    typingsJapgolly.baseui.tabsMod.StatefulTabs, 
    Unit, 
    StatefulTabsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonActiveKey) => onChange(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* nextState */ typingsJapgolly.baseui.tabsMod.State, t2: /* currentState */ typingsJapgolly.baseui.tabsMod.State) => stateReducer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.tabsMod.StatefulTabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.tabsMod.StatefulTabs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tabsMod.StatefulTabsProps])(children: _*)
  }
  @JSImport("baseui/tabs", "StatefulTabs")
  @js.native
  object componentImport extends js.Object
  
}

