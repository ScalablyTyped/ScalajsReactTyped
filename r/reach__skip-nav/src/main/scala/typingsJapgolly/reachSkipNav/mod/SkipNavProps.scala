package typingsJapgolly.reachSkipNav.mod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipNavProps extends js.Object {
  var children: js.UndefOr[String | Node] = js.undefined
}

object SkipNavProps {
  @scala.inline
  def apply(children: String | Node = null): SkipNavProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipNavProps]
  }
}

