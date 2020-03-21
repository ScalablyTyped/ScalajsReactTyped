package typingsJapgolly.facebookJsSdk.facebook

import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.async
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.iframe
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.page
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.pay
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.popup
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.purchaseiap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsLiteDialogParams extends DialogParams {
  var action: purchaseiap
  var developer_payload: js.UndefOr[String] = js.undefined
  var method: pay
  var product_id: String
  var quantity: js.UndefOr[Double] = js.undefined
}

object PaymentsLiteDialogParams {
  @scala.inline
  def apply(
    action: purchaseiap,
    method: pay,
    product_id: String,
    app_id: String = null,
    developer_payload: String = null,
    display: page | iframe | async | popup = null,
    quantity: Int | Double = null,
    redirect_uri: String = null
  ): PaymentsLiteDialogParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (developer_payload != null) __obj.updateDynamic("developer_payload")(developer_payload.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentsLiteDialogParams]
  }
}

