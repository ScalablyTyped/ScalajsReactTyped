package typingsJapgolly.reactCalendarTimeline.mod

import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemDragObjectResize extends OnItemDragObjectBase {
  var edge: js.UndefOr[left | right] = js.undefined
  @JSName("eventType")
  var eventType_OnItemDragObjectResize: resize
}

object OnItemDragObjectResize {
  @scala.inline
  def apply(eventType: resize, itemId: Id, time: Double, edge: left | right = null): OnItemDragObjectResize = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectResize]
  }
}

