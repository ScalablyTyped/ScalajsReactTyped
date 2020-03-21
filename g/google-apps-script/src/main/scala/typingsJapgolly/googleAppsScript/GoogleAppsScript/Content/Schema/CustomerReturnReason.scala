package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerReturnReason extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var reasonCode: js.UndefOr[String] = js.undefined
}

object CustomerReturnReason {
  @scala.inline
  def apply(description: String = null, reasonCode: String = null): CustomerReturnReason = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerReturnReason]
  }
}

