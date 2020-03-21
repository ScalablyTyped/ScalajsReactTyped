package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, Node]] = js.undefined
  var date: js.Date | Double
}

object MarkerProps {
  @scala.inline
  def apply(date: js.Date | Double, children: /* props */ CustomMarkerChildrenProps => CallbackTo[Node] = null): MarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactCalendarTimeline.mod.CustomMarkerChildrenProps) => children(t0).runNow()))
    __obj.asInstanceOf[MarkerProps]
  }
}

