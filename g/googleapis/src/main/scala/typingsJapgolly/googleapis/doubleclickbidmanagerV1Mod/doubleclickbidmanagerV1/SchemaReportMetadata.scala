package typingsJapgolly.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Report metadata.
  */
@js.native
trait SchemaReportMetadata extends js.Object {
  /**
    * The path to the location in Google Cloud Storage where the report is
    * stored.
    */
  var googleCloudStoragePath: js.UndefOr[String] = js.native
  /**
    * The ending time for the data that is shown in the report.
    */
  var reportDataEndTimeMs: js.UndefOr[String] = js.native
  /**
    * The starting time for the data that is shown in the report.
    */
  var reportDataStartTimeMs: js.UndefOr[String] = js.native
  /**
    * Report status.
    */
  var status: js.UndefOr[SchemaReportStatus] = js.native
}

object SchemaReportMetadata {
  @scala.inline
  def apply(
    googleCloudStoragePath: String = null,
    reportDataEndTimeMs: String = null,
    reportDataStartTimeMs: String = null,
    status: SchemaReportStatus = null
  ): SchemaReportMetadata = {
    val __obj = js.Dynamic.literal()
    if (googleCloudStoragePath != null) __obj.updateDynamic("googleCloudStoragePath")(googleCloudStoragePath.asInstanceOf[js.Any])
    if (reportDataEndTimeMs != null) __obj.updateDynamic("reportDataEndTimeMs")(reportDataEndTimeMs.asInstanceOf[js.Any])
    if (reportDataStartTimeMs != null) __obj.updateDynamic("reportDataStartTimeMs")(reportDataStartTimeMs.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportMetadata]
  }
}

