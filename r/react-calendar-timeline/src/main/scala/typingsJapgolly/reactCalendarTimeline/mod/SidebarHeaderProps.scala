package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarHeaderProps[Data] extends js.Object {
  var headerData: js.UndefOr[Data] = js.undefined
  var variant: js.UndefOr[left | right] = js.undefined
  def children(props: SidebarHeaderChildrenFnProps[Data]): Node
}

object SidebarHeaderProps {
  @scala.inline
  def apply[Data](
    children: SidebarHeaderChildrenFnProps[Data] => CallbackTo[Node],
    headerData: Data = null,
    variant: left | right = null
  ): SidebarHeaderProps[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactCalendarTimeline.mod.SidebarHeaderChildrenFnProps[Data]) => children(t0).runNow()))
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarHeaderProps[Data]]
  }
}

