package typingsJapgolly.baseui.phoneInputMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.selectMod.OnChangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulPhoneInputContainerProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.undefined
  var onTextChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], _]] = js.undefined
  var overrides: js.UndefOr[PhoneInputOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulPhoneInputContainerProps {
  @scala.inline
  def apply(
    `aria-label`: String = null,
    children: VdomNode = null,
    initialState: State = null,
    mapIsoToLabel: /* iso */ String => CallbackTo[String] = null,
    onCountryChange: /* event */ OnChangeParams => CallbackTo[js.Any] = null,
    onTextChange: /* event */ ReactEventFrom[HTMLInputElement] => CallbackTo[js.Any] = null,
    overrides: PhoneInputOverrides = null,
    stateReducer: (/* type */ StateChange, /* nextState */ State, /* currentState */ State) => CallbackTo[State] = null
  ): StatefulPhoneInputContainerProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1((t0: /* iso */ java.lang.String) => mapIsoToLabel(t0).runNow()))
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.baseui.selectMod.OnChangeParams) => onCountryChange(t0).runNow()))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onTextChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: /* type */ typingsJapgolly.baseui.phoneInputMod.StateChange, t1: /* nextState */ typingsJapgolly.baseui.phoneInputMod.State, t2: /* currentState */ typingsJapgolly.baseui.phoneInputMod.State) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[StatefulPhoneInputContainerProps]
  }
}

