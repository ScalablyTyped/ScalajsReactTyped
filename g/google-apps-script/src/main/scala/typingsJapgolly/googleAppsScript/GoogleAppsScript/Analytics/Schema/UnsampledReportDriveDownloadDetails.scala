package typingsJapgolly.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsampledReportDriveDownloadDetails extends js.Object {
  var documentId: js.UndefOr[String] = js.undefined
}

object UnsampledReportDriveDownloadDetails {
  @scala.inline
  def apply(documentId: String = null): UnsampledReportDriveDownloadDetails = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsampledReportDriveDownloadDetails]
  }
}

