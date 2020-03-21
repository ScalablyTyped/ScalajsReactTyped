package typingsJapgolly.lokijs

import typingsJapgolly.lokijs.lokijsBooleans.`false`
import typingsJapgolly.lokijs.lokijsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lokijs.AnonDelimited
  - typingsJapgolly.lokijs.AnonDelimiter
*/
trait DeserializeOptions extends js.Object

object DeserializeOptions {
  @scala.inline
  def AnonDelimited(
    delimited: `false`,
    delimiter: String = null,
    partition: Int | Double = null,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal(delimited = delimited.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
  @scala.inline
  def AnonDelimiter(
    delimiter: String,
    delimited: `true` = null,
    partition: Int | Double = null,
    partitioned: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    if (delimited != null) __obj.updateDynamic("delimited")(delimited.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(partitioned)) __obj.updateDynamic("partitioned")(partitioned.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
}

