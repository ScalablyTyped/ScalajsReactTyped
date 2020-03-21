package typingsJapgolly.baseui.tabsMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.AnonActiveKey
import typingsJapgolly.baseui.SharedPropsactiveboolean
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.horizontal
import typingsJapgolly.baseui.baseuiStrings.vertical
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tabs.TabsProps & {  activeKey ? :never,   renderAll ? :boolean,   initialState ? :baseui.baseui/tabs.State,   stateReducer ? :baseui.baseui/tabs.StateReducer} */
trait StatefulTabsProps extends js.Object {
  var activeKey: js.UndefOr[Key] = js.undefined
  var children: Node
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonActiveKey, _]] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var overrides: js.UndefOr[TabsOverrides[SharedPropsactiveboolean]] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulTabsProps {
  @scala.inline
  def apply(
    activeKey: Key = null,
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: State = null,
    onChange: /* args */ AnonActiveKey => CallbackTo[js.Any] = null,
    orientation: horizontal | vertical = null,
    overrides: TabsOverrides[SharedPropsactiveboolean] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (change_, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulTabsProps = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonActiveKey) => onChange(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* nextState */ typingsJapgolly.baseui.tabsMod.State, t2: /* currentState */ typingsJapgolly.baseui.tabsMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulTabsProps]
  }
}

