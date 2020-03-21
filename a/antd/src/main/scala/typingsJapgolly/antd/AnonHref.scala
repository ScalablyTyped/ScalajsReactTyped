package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var href: String
  var title: Node
}

object AnonHref {
  @scala.inline
  def apply(href: String, title: VdomNode = null): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHref]
  }
}

