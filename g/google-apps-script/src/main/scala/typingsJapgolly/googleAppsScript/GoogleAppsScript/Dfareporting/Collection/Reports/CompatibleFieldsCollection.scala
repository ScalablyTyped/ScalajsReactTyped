package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection.Reports

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CompatibleFields
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Report
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleFieldsCollection extends js.Object {
  // Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input report and user permissions.
  def query(resource: Report, profileId: String): CompatibleFields
}

object CompatibleFieldsCollection {
  @scala.inline
  def apply(query: (Report, String) => CallbackTo[CompatibleFields]): CompatibleFieldsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.Report, t1: java.lang.String) => query(t0, t1).runNow()))
    __obj.asInstanceOf[CompatibleFieldsCollection]
  }
}

