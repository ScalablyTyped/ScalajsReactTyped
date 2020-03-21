package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Collection.Metadata

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsCollection extends js.Object {
  // Lists all columns for a report type
  def list(reportType: String): Columns
}

object ColumnsCollection {
  @scala.inline
  def apply(list: String => CallbackTo[Columns]): ColumnsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: java.lang.String) => list(t0).runNow()))
    __obj.asInstanceOf[ColumnsCollection]
  }
}

