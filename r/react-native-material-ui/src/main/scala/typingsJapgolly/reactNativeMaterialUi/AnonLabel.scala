package typingsJapgolly.reactNativeMaterialUi

import typingsJapgolly.reactNativeMaterialUi.mod.TextStyle
import typingsJapgolly.reactNativeMaterialUi.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var container: js.UndefOr[ViewStyle] = js.undefined
  var icon: js.UndefOr[ViewStyle] = js.undefined
  var label: js.UndefOr[TextStyle] = js.undefined
}

object AnonLabel {
  @scala.inline
  def apply(container: ViewStyle = null, icon: ViewStyle = null, label: TextStyle = null): AnonLabel = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLabel]
  }
}

