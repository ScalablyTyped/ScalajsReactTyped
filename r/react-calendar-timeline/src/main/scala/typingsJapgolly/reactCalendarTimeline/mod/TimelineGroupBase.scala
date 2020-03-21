package typingsJapgolly.reactCalendarTimeline.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroupBase extends js.Object {
  var id: Id
  var rightTitle: js.UndefOr[Node] = js.undefined
  var title: Node
}

object TimelineGroupBase {
  @scala.inline
  def apply(id: Id, rightTitle: VdomNode = null, title: VdomNode = null): TimelineGroupBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroupBase]
  }
}

