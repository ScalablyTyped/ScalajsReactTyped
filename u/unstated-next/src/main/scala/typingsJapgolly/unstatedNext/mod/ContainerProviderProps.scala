package typingsJapgolly.unstatedNext.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProviderProps[State] extends js.Object {
  var children: Node
  var initialState: js.UndefOr[State] = js.undefined
}

object ContainerProviderProps {
  @scala.inline
  def apply[State](children: VdomNode = null, initialState: State = null): ContainerProviderProps[State] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerProviderProps[State]]
  }
}

