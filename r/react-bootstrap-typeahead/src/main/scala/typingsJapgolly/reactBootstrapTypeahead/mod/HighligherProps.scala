package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighligherProps extends js.Object {
  var children: Node
  var search: js.UndefOr[String] = js.undefined
}

object HighligherProps {
  @scala.inline
  def apply(children: VdomNode = null, search: String = null): HighligherProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighligherProps]
  }
}

