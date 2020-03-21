package typingsJapgolly.grommet.tabMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var plain: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(plain: js.UndefOr[Boolean] = js.undefined, title: VdomNode = null): TabProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

