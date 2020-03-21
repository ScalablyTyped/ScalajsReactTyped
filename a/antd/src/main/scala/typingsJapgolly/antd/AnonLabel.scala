package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: Node
  var style: CSSProperties
}

object AnonLabel {
  @scala.inline
  def apply(style: CSSProperties, label: VdomNode = null): AnonLabel = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

