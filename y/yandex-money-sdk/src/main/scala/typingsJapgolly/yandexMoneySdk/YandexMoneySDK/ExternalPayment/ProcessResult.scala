package typingsJapgolly.yandexMoneySdk.YandexMoneySDK.ExternalPayment

import typingsJapgolly.yandexMoneySdk.AnonDictkey
import typingsJapgolly.yandexMoneySdk.AnonMoneysourcetoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessResult extends js.Object {
  var acs_params: js.UndefOr[AnonDictkey] = js.undefined
  var acs_uri: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var invoice_id: js.UndefOr[String] = js.undefined
  var money_source: js.UndefOr[AnonMoneysourcetoken] = js.undefined
  var next_retry: js.UndefOr[Double] = js.undefined
  var status: String
}

object ProcessResult {
  @scala.inline
  def apply(
    status: String,
    acs_params: AnonDictkey = null,
    acs_uri: String = null,
    error: String = null,
    invoice_id: String = null,
    money_source: AnonMoneysourcetoken = null,
    next_retry: Int | Double = null
  ): ProcessResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (acs_params != null) __obj.updateDynamic("acs_params")(acs_params.asInstanceOf[js.Any])
    if (acs_uri != null) __obj.updateDynamic("acs_uri")(acs_uri.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (invoice_id != null) __obj.updateDynamic("invoice_id")(invoice_id.asInstanceOf[js.Any])
    if (money_source != null) __obj.updateDynamic("money_source")(money_source.asInstanceOf[js.Any])
    if (next_retry != null) __obj.updateDynamic("next_retry")(next_retry.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessResult]
  }
}

