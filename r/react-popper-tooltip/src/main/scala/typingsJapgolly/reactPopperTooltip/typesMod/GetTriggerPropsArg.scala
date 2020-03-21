package typingsJapgolly.reactPopperTooltip.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTriggerPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var onBlur: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
}

object GetTriggerPropsArg {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onBlur: /* event */ ReactEventFrom[Element] => Callback = null,
    onClick: /* event */ ReactEventFrom[Element] => Callback = null,
    onContextMenu: /* event */ ReactEventFrom[Element] => Callback = null,
    onFocus: /* event */ ReactEventFrom[Element] => Callback = null,
    onMouseEnter: /* event */ ReactEventFrom[Element] => Callback = null,
    onMouseLeave: /* event */ ReactEventFrom[Element] => Callback = null,
    onMouseMove: /* event */ ReactEventFrom[Element] => Callback = null,
    onTouchEnd: /* event */ ReactEventFrom[Element] => Callback = null
  ): GetTriggerPropsArg = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onContextMenu(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseMove(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onTouchEnd(t0).runNow()))
    __obj.asInstanceOf[GetTriggerPropsArg]
  }
}

