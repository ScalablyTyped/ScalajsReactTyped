package typingsJapgolly.grommet.skipLinksMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.grommet.AnonSkipTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipLinksProps extends js.Object {
  var children: Node
  var messages: js.UndefOr[AnonSkipTo] = js.undefined
}

object SkipLinksProps {
  @scala.inline
  def apply(children: VdomNode = null, messages: AnonSkipTo = null): SkipLinksProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipLinksProps]
  }
}

