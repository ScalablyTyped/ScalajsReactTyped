package typingsJapgolly.reactPopperTooltip.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTooltipPropsArg
  extends /* key */ StringDictionary[js.Any] {
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ ReactEventFrom[Element], Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetTooltipPropsArg {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onMouseEnter: /* event */ ReactEventFrom[Element] => Callback = null,
    onMouseLeave: /* event */ ReactEventFrom[Element] => Callback = null,
    style: CSSProperties = null
  ): GetTooltipPropsArg = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onMouseLeave(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTooltipPropsArg]
  }
}

