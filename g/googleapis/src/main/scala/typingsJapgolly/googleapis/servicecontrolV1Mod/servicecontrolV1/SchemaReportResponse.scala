package typingsJapgolly.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the Report method.
  */
@js.native
trait SchemaReportResponse extends js.Object {
  /**
    * Partial failures, one for each `Operation` in the request that failed
    * processing. There are three possible combinations of the RPC status:  1.
    * The combination of a successful RPC status and an empty `report_errors`
    * list indicates a complete success where all `Operations` in the request
    * are processed successfully. 2. The combination of a successful RPC status
    * and a non-empty    `report_errors` list indicates a partial success where
    * some    `Operations` in the request succeeded. Each    `Operation` that
    * failed processing has a corresponding item    in this list. 3. A failed
    * RPC status indicates a general non-deterministic failure.    When this
    * happens, it&#39;s impossible to know which of the    &#39;Operations&#39;
    * in the request succeeded or failed.
    */
  var reportErrors: js.UndefOr[js.Array[SchemaReportError]] = js.native
  /**
    * Quota usage for each quota release `Operation` request.  Fully or
    * partially failed quota release request may or may not be present in
    * `report_quota_info`. For example, a failed quota release request will
    * have the current quota usage info when precise quota library returns the
    * info. A deadline exceeded quota request will not have quota usage info.
    * If there is no quota release request, report_quota_info will be empty.
    */
  var reportInfos: js.UndefOr[js.Array[SchemaReportInfo]] = js.native
  /**
    * The actual config id used to process the request.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object SchemaReportResponse {
  @scala.inline
  def apply(
    reportErrors: js.Array[SchemaReportError] = null,
    reportInfos: js.Array[SchemaReportInfo] = null,
    serviceConfigId: String = null
  ): SchemaReportResponse = {
    val __obj = js.Dynamic.literal()
    if (reportErrors != null) __obj.updateDynamic("reportErrors")(reportErrors.asInstanceOf[js.Any])
    if (reportInfos != null) __obj.updateDynamic("reportInfos")(reportInfos.asInstanceOf[js.Any])
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportResponse]
  }
}

