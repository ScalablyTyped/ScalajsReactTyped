package typingsJapgolly.baseui.radioMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.ChangeEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
  var stateReducer: StateReducer
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State, /* event */ ReactEventFrom[HTMLInputElement]) => CallbackTo[State],
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    initialState: State = null,
    onChange: ReactEventFrom[HTMLInputElement] => Callback = null,
    overrides: RadioOverrides with RadioGroupOverrides = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stateReducer")(js.Any.fromFunction4((t0: /* stateType */ java.lang.String, t1: /* nextState */ typingsJapgolly.baseui.radioMod.State, t2: /* currentState */ typingsJapgolly.baseui.radioMod.State, t3: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => stateReducer(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

