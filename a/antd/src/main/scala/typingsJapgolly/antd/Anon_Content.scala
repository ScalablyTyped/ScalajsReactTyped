package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: Node
  var ellipsis: Boolean
  var text: String
}

object Anon_Content {
  @scala.inline
  def apply(ellipsis: Boolean, text: String, content: VdomNode = null): Anon_Content = {
    val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

