package typingsJapgolly.reactNativeMaterialUi.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactNative.mod.Image
import typingsJapgolly.reactNativeMaterialUi.AnonContainerContentContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerHeaderProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Element] = js.undefined
  var image: js.UndefOr[js.Array[Image]] = js.undefined
  var style: js.UndefOr[AnonContainerContentContainer] = js.undefined
}

object DrawerHeaderProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    children: VdomElement = null,
    image: js.Array[Image] = null,
    style: AnonContainerContentContainer = null
  ): DrawerHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerHeaderProps]
  }
}

