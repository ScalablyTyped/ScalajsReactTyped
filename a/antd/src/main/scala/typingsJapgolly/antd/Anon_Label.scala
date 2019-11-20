package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: Node
  var style: CSSProperties
}

object Anon_Label {
  @scala.inline
  def apply(style: CSSProperties, label: VdomNode = null): Anon_Label = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

