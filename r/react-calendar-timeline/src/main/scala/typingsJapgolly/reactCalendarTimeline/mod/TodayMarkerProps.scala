package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TodayMarkerProps extends MarkerProps {
  var interval: js.UndefOr[Double] = js.undefined
}

object TodayMarkerProps {
  @scala.inline
  def apply(
    date: js.Date | Double,
    children: /* props */ CustomMarkerChildrenProps => CallbackTo[Node] = null,
    interval: Int | Double = null
  ): TodayMarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactCalendarTimeline.mod.CustomMarkerChildrenProps) => children(t0).runNow()))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodayMarkerProps]
  }
}

