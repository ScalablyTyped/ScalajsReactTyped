package typingsJapgolly.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeldGroupsQuery extends js.Object {
  /**
    * The end date range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var endTime: js.UndefOr[String] = js.undefined
  /**
    * The start date range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var startTime: js.UndefOr[String] = js.undefined
  /** The search terms for the hold. */
  var terms: js.UndefOr[String] = js.undefined
}

object HeldGroupsQuery {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null, terms: String = null): HeldGroupsQuery = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeldGroupsQuery]
  }
}

