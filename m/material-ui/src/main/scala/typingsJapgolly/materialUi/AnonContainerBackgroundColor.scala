package typingsJapgolly.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerBackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var containerBackgroundColor: js.UndefOr[String] = js.undefined
}

object AnonContainerBackgroundColor {
  @scala.inline
  def apply(backgroundColor: String = null, containerBackgroundColor: String = null): AnonContainerBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerBackgroundColor]
  }
}

