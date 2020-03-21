package typingsJapgolly.reactSelect.groupMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps extends js.Object {
  /** Component to wrap the label, recieves headingProps. */
  var Heading: ComponentType[_]
  /** The children to be rendered. */
  var children: Node
  /** Label to be displayed in the heading component. */
  var label: Node
}

object ComponentProps {
  @scala.inline
  def apply(Heading: ComponentType[_], children: VdomNode = null, label: VdomNode = null): ComponentProps = {
    val __obj = js.Dynamic.literal(Heading = Heading.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
}

