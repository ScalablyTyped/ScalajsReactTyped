package typingsJapgolly.reactBreadcrumbs

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle extends js.Object {
  var title: js.UndefOr[Node] = js.undefined
}

object AnonTitle {
  @scala.inline
  def apply(title: VdomNode = null): AnonTitle = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitle]
  }
}

