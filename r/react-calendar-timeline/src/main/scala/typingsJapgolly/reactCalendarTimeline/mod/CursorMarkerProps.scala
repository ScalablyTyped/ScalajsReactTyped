package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react-calendar-timeline.react-calendar-timeline.MarkerProps, 'date'> */
trait CursorMarkerProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, Node]] = js.undefined
}

object CursorMarkerProps {
  @scala.inline
  def apply(children: /* props */ CustomMarkerChildrenProps => CallbackTo[Node] = null): CursorMarkerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactCalendarTimeline.mod.CustomMarkerChildrenProps) => children(t0).runNow()))
    __obj.asInstanceOf[CursorMarkerProps]
  }
}

