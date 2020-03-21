package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsCollection extends js.Object {
  // Returns the Analytics data.
  def batchGet(resource: GetReportsRequest): GetReportsResponse
}

object ReportsCollection {
  @scala.inline
  def apply(batchGet: GetReportsRequest => CallbackTo[GetReportsResponse]): ReportsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchGet")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema.GetReportsRequest) => batchGet(t0).runNow()))
    __obj.asInstanceOf[ReportsCollection]
  }
}

