package typingsJapgolly.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The parent resource name, which should be a scan run resource
    * name in the format
    * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    */
  var parent: js.UndefOr[String] = js.native
}

