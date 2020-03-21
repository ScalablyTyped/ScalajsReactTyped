package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var alignment: js.UndefOr[center | left | right] = js.undefined
  var location: js.UndefOr[left | right | top] = js.undefined
  var showColon: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonLocation {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    location: left | right | top = null,
    showColon: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonLocation = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(showColon)) __obj.updateDynamic("showColon")(showColon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
}

