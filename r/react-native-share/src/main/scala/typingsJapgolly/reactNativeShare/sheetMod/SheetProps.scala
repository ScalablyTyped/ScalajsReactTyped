package typingsJapgolly.reactNativeShare.sheetMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetProps extends js.Object {
  var children: Node
  var visible: Boolean
}

object SheetProps {
  @scala.inline
  def apply(visible: Boolean, children: VdomNode = null): SheetProps = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetProps]
  }
}

