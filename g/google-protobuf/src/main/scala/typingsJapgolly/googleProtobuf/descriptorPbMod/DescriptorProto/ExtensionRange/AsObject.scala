package typingsJapgolly.googleProtobuf.descriptorPbMod.DescriptorProto.ExtensionRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var options: js.UndefOr[typingsJapgolly.googleProtobuf.descriptorPbMod.ExtensionRangeOptions.AsObject] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    end: Int | Double = null,
    options: typingsJapgolly.googleProtobuf.descriptorPbMod.ExtensionRangeOptions.AsObject = null,
    start: Int | Double = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

