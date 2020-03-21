package typingsJapgolly.baseui.headingMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadingLevelProps extends js.Object {
  var children: Node
}

object HeadingLevelProps {
  @scala.inline
  def apply(children: VdomNode = null): HeadingLevelProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingLevelProps]
  }
}

