package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentTypeOrder extends js.Object {
  // Whether this is the default Content Type
  var default: js.UndefOr[Boolean] = js.undefined
  // Specifies the position in which the Content Type appears in the selection UI.
  var position: js.UndefOr[Double] = js.undefined
}

object ContentTypeOrder {
  @scala.inline
  def apply(default: js.UndefOr[Boolean] = js.undefined, position: Int | Double = null): ContentTypeOrder = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeOrder]
  }
}

