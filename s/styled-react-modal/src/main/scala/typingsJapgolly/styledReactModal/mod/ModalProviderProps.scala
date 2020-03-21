package typingsJapgolly.styledReactModal.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.styledComponents.styledComponentsMod.AnyStyledComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProviderProps extends js.Object {
  var backgroundComponent: js.UndefOr[AnyStyledComponent] = js.undefined
  var children: Node
}

object ModalProviderProps {
  @scala.inline
  def apply(backgroundComponent: AnyStyledComponent = null, children: VdomNode = null): ModalProviderProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProviderProps]
  }
}

