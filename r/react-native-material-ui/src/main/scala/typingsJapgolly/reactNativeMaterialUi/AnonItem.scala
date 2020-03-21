package typingsJapgolly.reactNativeMaterialUi

import typingsJapgolly.reactNativeMaterialUi.mod.TextStyle
import typingsJapgolly.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[ViewStyle] = js.undefined
  var item: js.UndefOr[ViewStyle] = js.undefined
  var label: js.UndefOr[TextStyle] = js.undefined
  var subheader: js.UndefOr[TextStyle] = js.undefined
  var value: js.UndefOr[TextStyle] = js.undefined
}

object AnonItem {
  @scala.inline
  def apply(
    container: ViewStyle = null,
    icon: ViewStyle = null,
    item: ViewStyle = null,
    label: TextStyle = null,
    subheader: TextStyle = null,
    value: TextStyle = null
  ): AnonItem = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem]
  }
}

