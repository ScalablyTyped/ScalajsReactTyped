package typingsJapgolly.mirrorx.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(children: VdomNode = null, location: Location[LocationState] = null): SwitchProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

