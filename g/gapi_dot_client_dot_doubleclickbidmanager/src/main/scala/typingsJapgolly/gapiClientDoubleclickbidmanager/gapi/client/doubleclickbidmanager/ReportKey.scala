package typingsJapgolly.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportKey extends js.Object {
  /** Query ID. */
  var queryId: js.UndefOr[String] = js.undefined
  /** Report ID. */
  var reportId: js.UndefOr[String] = js.undefined
}

object ReportKey {
  @scala.inline
  def apply(queryId: String = null, reportId: String = null): ReportKey = {
    val __obj = js.Dynamic.literal()
    if (queryId != null) __obj.updateDynamic("queryId")(queryId.asInstanceOf[js.Any])
    if (reportId != null) __obj.updateDynamic("reportId")(reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportKey]
  }
}

