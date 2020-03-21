package typingsJapgolly.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeInterval extends js.Object {
  /**
    * The timestamp marking the end of the range (exclusive) for which data is
    * included.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /**
    * The timestamp marking the start of the range (inclusive) for which data is
    * included.
    */
  var startTime: js.UndefOr[String] = js.undefined
}

object TimeInterval {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): TimeInterval = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval]
  }
}

