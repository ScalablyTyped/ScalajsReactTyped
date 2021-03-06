package typingsJapgolly.storybookComponents.fieldMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProps extends js.Object {
  var label: js.UndefOr[Node] = js.native
}

object FieldProps {
  @scala.inline
  def apply(label: VdomNode = null): FieldProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldProps]
  }
}

