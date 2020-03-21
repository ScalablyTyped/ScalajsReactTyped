package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShape extends js.Object {
  var shape: js.UndefOr[circle | square] = js.undefined
  var size: js.UndefOr[Double | small | large | default] = js.undefined
}

object AnonShape {
  @scala.inline
  def apply(shape: circle | square = null, size: Double | small | large | default = null): AnonShape = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShape]
  }
}

