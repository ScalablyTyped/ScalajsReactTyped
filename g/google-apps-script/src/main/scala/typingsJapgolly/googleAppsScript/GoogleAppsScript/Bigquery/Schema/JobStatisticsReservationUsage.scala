package typingsJapgolly.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatisticsReservationUsage extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var slotMs: js.UndefOr[String] = js.undefined
}

object JobStatisticsReservationUsage {
  @scala.inline
  def apply(name: String = null, slotMs: String = null): JobStatisticsReservationUsage = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (slotMs != null) __obj.updateDynamic("slotMs")(slotMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatisticsReservationUsage]
  }
}

