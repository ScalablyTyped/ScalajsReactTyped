package typingsJapgolly.googleapis.reportsV1Mod.adminReportsV1

import typingsJapgolly.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a collection of usage reports.
  */
@js.native
trait SchemaUsageReports extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The kind of object.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token for retrieving the next page
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Various application parameter records.
    */
  var usageReports: js.UndefOr[js.Array[SchemaUsageReport]] = js.native
  /**
    * Warnings if any.
    */
  var warnings: js.UndefOr[js.Array[AnonCode]] = js.native
}

object SchemaUsageReports {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    usageReports: js.Array[SchemaUsageReport] = null,
    warnings: js.Array[AnonCode] = null
  ): SchemaUsageReports = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (usageReports != null) __obj.updateDynamic("usageReports")(usageReports.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUsageReports]
  }
}

