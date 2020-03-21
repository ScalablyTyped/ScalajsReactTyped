package typingsJapgolly.d3Collection

import typingsJapgolly.d3Collection.mod.NestedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues[Datum, RollupType] extends js.Object {
  var key: String
  var value: js.UndefOr[RollupType] = js.undefined
  var values: js.UndefOr[(NestedArray[Datum, RollupType]) | js.Array[Datum]] = js.undefined
}

object AnonValues {
  @scala.inline
  def apply[Datum, RollupType](
    key: String,
    value: RollupType = null,
    values: (NestedArray[Datum, RollupType]) | js.Array[Datum] = null
  ): AnonValues[Datum, RollupType] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValues[Datum, RollupType]]
  }
}

