package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersAcknowledgeRequest extends js.Object {
  var operationId: js.UndefOr[String] = js.undefined
}

object OrdersAcknowledgeRequest {
  @scala.inline
  def apply(operationId: String = null): OrdersAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersAcknowledgeRequest]
  }
}

