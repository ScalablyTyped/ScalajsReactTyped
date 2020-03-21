package typingsJapgolly.reachTooltip.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.ReactEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerParams extends js.Object {
  var `aria-describedby`: String
  var `data-reach-tooltip-trigger`: String
  var onBlur: ReactEventHandler[Element]
  var onFocus: ReactEventHandler[Element]
  var onKeyDown: ReactEventHandler[Element]
  var onMouseDown: ReactEventHandler[Element]
  var onMouseEnter: ReactEventHandler[Element]
  var onMouseLeave: ReactEventHandler[Element]
  var onMouseMove: ReactEventHandler[Element]
  var ref: Ref
}

object TriggerParams {
  @scala.inline
  def apply(
    `aria-describedby`: String,
    `data-reach-tooltip-trigger`: String,
    onBlur: ReactEventFrom[Element] => Callback,
    onFocus: ReactEventFrom[Element] => Callback,
    onKeyDown: ReactEventFrom[Element] => Callback,
    onMouseDown: ReactEventFrom[Element] => Callback,
    onMouseEnter: ReactEventFrom[Element] => Callback,
    onMouseLeave: ReactEventFrom[Element] => Callback,
    onMouseMove: ReactEventFrom[Element] => Callback,
    ref: Ref = null
  ): TriggerParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseDown(t0).runNow()))
    __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerParams]
  }
}

