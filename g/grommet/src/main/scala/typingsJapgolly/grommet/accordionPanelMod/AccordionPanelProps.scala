package typingsJapgolly.grommet.accordionPanelMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionPanelProps extends js.Object {
  var header: js.UndefOr[Node] = js.undefined
  var label: js.UndefOr[String | Node] = js.undefined
}

object AccordionPanelProps {
  @scala.inline
  def apply(header: VdomNode = null, label: String | Node = null): AccordionPanelProps = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.rawNode.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionPanelProps]
  }
}

