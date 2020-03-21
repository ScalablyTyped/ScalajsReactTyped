package typingsJapgolly.stellarSdk

import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.InternalServerError
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.RateLimitExceeded
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.ErrorResponseData.TransactionFailed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatus extends js.Object {
  var data: js.UndefOr[RateLimitExceeded | InternalServerError | TransactionFailed] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonStatus {
  @scala.inline
  def apply(
    data: RateLimitExceeded | InternalServerError | TransactionFailed = null,
    status: Int | Double = null,
    statusText: String = null,
    url: String = null
  ): AnonStatus = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatus]
  }
}

