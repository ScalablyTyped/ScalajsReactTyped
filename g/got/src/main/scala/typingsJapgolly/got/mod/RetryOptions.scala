package typingsJapgolly.got.mod

import typingsJapgolly.got.gotNumbers.`408`
import typingsJapgolly.got.gotNumbers.`413`
import typingsJapgolly.got.gotNumbers.`429`
import typingsJapgolly.got.gotNumbers.`500`
import typingsJapgolly.got.gotNumbers.`502`
import typingsJapgolly.got.gotNumbers.`503`
import typingsJapgolly.got.gotNumbers.`504`
import typingsJapgolly.got.gotStrings.DELETE
import typingsJapgolly.got.gotStrings.GET
import typingsJapgolly.got.gotStrings.HEAD
import typingsJapgolly.got.gotStrings.OPTIONS
import typingsJapgolly.got.gotStrings.POST
import typingsJapgolly.got.gotStrings.PUT
import typingsJapgolly.got.gotStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  /**
    * Allowed error codes.
    */
  var errorCodes: js.UndefOr[js.Array[String]] = js.undefined
  var maxRetryAfter: js.UndefOr[Double] = js.undefined
  var methods: js.UndefOr[js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE]] = js.undefined
  var retries: js.UndefOr[Double | RetryFunction] = js.undefined
  var statusCodes: js.UndefOr[js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`]] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    errorCodes: js.Array[String] = null,
    maxRetryAfter: Int | Double = null,
    methods: js.Array[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE] = null,
    retries: Double | RetryFunction = null,
    statusCodes: js.Array[`408` | `413` | `429` | `500` | `502` | `503` | `504`] = null
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (errorCodes != null) __obj.updateDynamic("errorCodes")(errorCodes.asInstanceOf[js.Any])
    if (maxRetryAfter != null) __obj.updateDynamic("maxRetryAfter")(maxRetryAfter.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (statusCodes != null) __obj.updateDynamic("statusCodes")(statusCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

