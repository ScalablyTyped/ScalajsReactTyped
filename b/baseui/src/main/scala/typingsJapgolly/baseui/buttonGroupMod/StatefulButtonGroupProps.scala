package typingsJapgolly.baseui.buttonGroupMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.baseui.baseuiStrings.checkbox
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.baseuiStrings.minimal
import typingsJapgolly.baseui.baseuiStrings.pill
import typingsJapgolly.baseui.baseuiStrings.primary
import typingsJapgolly.baseui.baseuiStrings.radio
import typingsJapgolly.baseui.baseuiStrings.round
import typingsJapgolly.baseui.baseuiStrings.secondary
import typingsJapgolly.baseui.baseuiStrings.square
import typingsJapgolly.baseui.baseuiStrings.tertiary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulButtonGroupProps extends ButtonGroupProps {
  var initialState: js.UndefOr[InitialState] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function3[
      /* stateType */ STATE_CHANGE_TYPE, 
      /* nextState */ State, 
      /* currentState */ State, 
      State
    ]
  ] = js.undefined
}

object StatefulButtonGroupProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: InitialState = null,
    kind: primary | secondary | tertiary | minimal = null,
    mode: checkbox | radio = null,
    onClick: (/* event */ ReactMouseEventFrom[HTMLButtonElement], /* index */ Double) => CallbackTo[js.Any] = null,
    overrides: ButtonGroupOverrides = null,
    selected: Double | js.Array[Double] = null,
    shape: default_ | pill | round | square = null,
    size: compact | default_ | large_ | mini = null,
    stateReducer: (/* stateType */ STATE_CHANGE_TYPE, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement], t1: /* index */ scala.Double) => onClick(t0, t1).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* stateType */ typingsJapgolly.baseui.buttonGroupMod.STATE_CHANGE_TYPE, t1: /* nextState */ typingsJapgolly.baseui.buttonGroupMod.State, t2: /* currentState */ typingsJapgolly.baseui.buttonGroupMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulButtonGroupProps]
  }
}

