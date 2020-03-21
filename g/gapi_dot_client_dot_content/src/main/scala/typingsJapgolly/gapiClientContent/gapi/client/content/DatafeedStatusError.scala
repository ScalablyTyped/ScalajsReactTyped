package typingsJapgolly.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedStatusError extends js.Object {
  /** The code of the error, e.g., "validation/invalid_value". */
  var code: js.UndefOr[String] = js.undefined
  /** The number of occurrences of the error in the feed. */
  var count: js.UndefOr[String] = js.undefined
  /** A list of example occurrences of the error, grouped by product. */
  var examples: js.UndefOr[js.Array[DatafeedStatusExample]] = js.undefined
  /** The error message, e.g., "Invalid price". */
  var message: js.UndefOr[String] = js.undefined
}

object DatafeedStatusError {
  @scala.inline
  def apply(
    code: String = null,
    count: String = null,
    examples: js.Array[DatafeedStatusExample] = null,
    message: String = null
  ): DatafeedStatusError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (examples != null) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedStatusError]
  }
}

