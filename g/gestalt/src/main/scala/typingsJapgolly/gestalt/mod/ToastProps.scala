package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.gestalt.gestaltStrings.`arrow-circle-forward`
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.orange
import typingsJapgolly.gestalt.gestaltStrings.red
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProps extends js.Object {
  var color: js.UndefOr[darkGray | orange | red] = js.undefined
  var icon: js.UndefOr[`arrow-circle-forward`] = js.undefined
  var text: js.UndefOr[String | js.Array[String]] = js.undefined
  var thumbnail: js.UndefOr[Element] = js.undefined
}

object ToastProps {
  @scala.inline
  def apply(
    color: darkGray | orange | red = null,
    icon: `arrow-circle-forward` = null,
    text: String | js.Array[String] = null,
    thumbnail: VdomElement = null
  ): ToastProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
}

