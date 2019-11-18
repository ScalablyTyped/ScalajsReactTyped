package typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceHeaderProps extends js.Object {
  var index: Double
  var label: Node
  var resource: js.Object
}

object ResourceHeaderProps {
  @scala.inline
  def apply(index: Double, label: VdomNode, resource: js.Object): ResourceHeaderProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceHeaderProps]
  }
}

