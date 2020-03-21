package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactNativeMaterialUi.AnonContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProps extends js.Object {
  var children: Element
  var style: js.UndefOr[AnonContainerViewStyle] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(children: VdomElement, style: AnonContainerViewStyle = null): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

