package typingsJapgolly.googleapis.loggingV2Mod.loggingV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBillingaccountsSinksGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource name of the sink:
    * "projects/[PROJECT_ID]/sinks/[SINK_ID]"
    * "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
    * "folders/[FOLDER_ID]/sinks/[SINK_ID]" Example:
    * "projects/my-project-id/sinks/my-sink-id".
    */
  var sinkName: js.UndefOr[String] = js.native
}

