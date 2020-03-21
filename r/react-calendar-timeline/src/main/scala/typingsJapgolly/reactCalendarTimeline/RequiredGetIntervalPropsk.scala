package typingsJapgolly.reactCalendarTimeline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactCalendarTimeline.mod.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<react-calendar-timeline.react-calendar-timeline.GetIntervalProps> & {  key  :string | number} */
trait RequiredGetIntervalPropsk extends js.Object {
  var interval: Interval
  var key: String | Double
  var onClick: MouseEventHandler[Element]
  var style: CSSProperties
}

object RequiredGetIntervalPropsk {
  @scala.inline
  def apply(
    interval: Interval,
    key: String | Double,
    onClick: ReactMouseEventFrom[Element] => Callback,
    style: CSSProperties
  ): RequiredGetIntervalPropsk = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    __obj.asInstanceOf[RequiredGetIntervalPropsk]
  }
}

