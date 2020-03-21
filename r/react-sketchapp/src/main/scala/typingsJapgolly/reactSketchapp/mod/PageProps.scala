package typingsJapgolly.reactSketchapp.mod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProps extends js.Object {
  var children: js.UndefOr[js.Array[Node] | Node] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object PageProps {
  @scala.inline
  def apply(children: js.Array[Node] | Node = null, name: String = null): PageProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageProps]
  }
}

