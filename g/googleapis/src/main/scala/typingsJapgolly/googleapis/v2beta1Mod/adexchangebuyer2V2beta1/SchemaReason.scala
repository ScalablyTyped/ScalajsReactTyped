package typingsJapgolly.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specific filtering status and how many times it occurred.
  */
@js.native
trait SchemaReason extends js.Object {
  /**
    * The number of times the creative was filtered for the status. The count
    * is aggregated across all publishers on the exchange.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The filtering status code. Please refer to the
    * [creative-status-codes.txt](https://storage.googleapis.com/adx-rtb-dictionaries/creative-status-codes.txt)
    * file for different statuses.
    */
  var status: js.UndefOr[Double] = js.native
}

object SchemaReason {
  @scala.inline
  def apply(count: String = null, status: Int | Double = null): SchemaReason = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReason]
  }
}

