package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsCollection extends js.Object {
  // Notify about successfully authorizing user's payment method for a given amount.
  def notifyauthapproved(resource: OrderpaymentsNotifyAuthApprovedRequest, merchantId: String, orderId: String): OrderpaymentsNotifyAuthApprovedResponse
  // Notify about failure to authorize user's payment method.
  def notifyauthdeclined(resource: OrderpaymentsNotifyAuthDeclinedRequest, merchantId: String, orderId: String): OrderpaymentsNotifyAuthDeclinedResponse
  // Notify about charge on user's selected payments method.
  def notifycharge(resource: OrderpaymentsNotifyChargeRequest, merchantId: String, orderId: String): OrderpaymentsNotifyChargeResponse
  // Notify about refund on user's selected payments method.
  def notifyrefund(resource: OrderpaymentsNotifyRefundRequest, merchantId: String, orderId: String): OrderpaymentsNotifyRefundResponse
}

object OrderpaymentsCollection {
  @scala.inline
  def apply(
    notifyauthapproved: (OrderpaymentsNotifyAuthApprovedRequest, String, String) => CallbackTo[OrderpaymentsNotifyAuthApprovedResponse],
    notifyauthdeclined: (OrderpaymentsNotifyAuthDeclinedRequest, String, String) => CallbackTo[OrderpaymentsNotifyAuthDeclinedResponse],
    notifycharge: (OrderpaymentsNotifyChargeRequest, String, String) => CallbackTo[OrderpaymentsNotifyChargeResponse],
    notifyrefund: (OrderpaymentsNotifyRefundRequest, String, String) => CallbackTo[OrderpaymentsNotifyRefundResponse]
  ): OrderpaymentsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notifyauthapproved")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedRequest, t1: java.lang.String, t2: java.lang.String) => notifyauthapproved(t0, t1, t2).runNow()))
    __obj.updateDynamic("notifyauthdeclined")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedRequest, t1: java.lang.String, t2: java.lang.String) => notifyauthdeclined(t0, t1, t2).runNow()))
    __obj.updateDynamic("notifycharge")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeRequest, t1: java.lang.String, t2: java.lang.String) => notifycharge(t0, t1, t2).runNow()))
    __obj.updateDynamic("notifyrefund")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundRequest, t1: java.lang.String, t2: java.lang.String) => notifyrefund(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OrderpaymentsCollection]
  }
}

