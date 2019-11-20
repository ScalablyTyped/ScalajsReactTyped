package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: String
  var title: Node
}

object Anon_Href {
  @scala.inline
  def apply(href: String, title: VdomNode = null): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Href]
  }
}

