package typingsJapgolly.googleapis.loggingV2Mod.loggingV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsMetricsUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The resource name of the metric to update:
    * "projects/[PROJECT_ID]/metrics/[METRIC_ID]" The updated metric must be
    * provided in the request and it's name field must be the same as
    * [METRIC_ID] If the metric does not exist in [PROJECT_ID], then a new
    * metric is created.
    */
  var metricName: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLogMetric] = js.native
}

