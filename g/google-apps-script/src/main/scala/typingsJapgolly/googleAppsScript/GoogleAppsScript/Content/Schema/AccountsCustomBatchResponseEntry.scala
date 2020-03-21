package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchResponseEntry extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var batchId: js.UndefOr[Double] = js.undefined
  var errors: js.UndefOr[Errors] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var linkStatus: js.UndefOr[String] = js.undefined
}

object AccountsCustomBatchResponseEntry {
  @scala.inline
  def apply(
    account: Account = null,
    batchId: Int | Double = null,
    errors: Errors = null,
    kind: String = null,
    linkStatus: String = null
  ): AccountsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (linkStatus != null) __obj.updateDynamic("linkStatus")(linkStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsCustomBatchResponseEntry]
  }
}

