package typingsJapgolly.googleapis.monitoringV3Mod.monitoringV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsMetricdescriptorsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The metric descriptor on which to execute the request. The format is
    * "projects/{project_id_or_number}/metricDescriptors/{metric_id}". An
    * example of {metric_id} is: "custom.googleapis.com/my_test_metric".
    */
  var name: js.UndefOr[String] = js.native
}

