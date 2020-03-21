package typingsJapgolly.bootstrapV3Datetimepicker.mod

import typingsJapgolly.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.auto
import typingsJapgolly.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.bottom
import typingsJapgolly.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.left
import typingsJapgolly.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.right
import typingsJapgolly.bootstrapV3Datetimepicker.bootstrapV3DatetimepickerStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetPositioningOptions extends js.Object {
  var horizontal: js.UndefOr[auto | left | right] = js.undefined
  var vertical: js.UndefOr[auto | top | bottom] = js.undefined
}

object WidgetPositioningOptions {
  @scala.inline
  def apply(horizontal: auto | left | right = null, vertical: auto | top | bottom = null): WidgetPositioningOptions = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetPositioningOptions]
  }
}

