package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatusDestinationStatus extends js.Object {
  var approvalPending: js.UndefOr[Boolean] = js.undefined
  var approvalStatus: js.UndefOr[String] = js.undefined
  var destination: js.UndefOr[String] = js.undefined
  var intention: js.UndefOr[String] = js.undefined
}

object ProductStatusDestinationStatus {
  @scala.inline
  def apply(
    approvalPending: js.UndefOr[Boolean] = js.undefined,
    approvalStatus: String = null,
    destination: String = null,
    intention: String = null
  ): ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(approvalPending)) __obj.updateDynamic("approvalPending")(approvalPending.asInstanceOf[js.Any])
    if (approvalStatus != null) __obj.updateDynamic("approvalStatus")(approvalStatus.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (intention != null) __obj.updateDynamic("intention")(intention.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductStatusDestinationStatus]
  }
}

