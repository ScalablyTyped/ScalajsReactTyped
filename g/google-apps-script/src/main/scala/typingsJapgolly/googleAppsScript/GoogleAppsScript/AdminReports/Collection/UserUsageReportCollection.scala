package typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Collection

import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReports.Schema.UsageReports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserUsageReportCollection extends js.Object {
  // Retrieves a report which is a collection of properties / statistics for a set of users.
  def get(userKey: String, date: String): UsageReports = js.native
  // Retrieves a report which is a collection of properties / statistics for a set of users.
  def get(userKey: String, date: String, optionalArgs: js.Object): UsageReports = js.native
}

