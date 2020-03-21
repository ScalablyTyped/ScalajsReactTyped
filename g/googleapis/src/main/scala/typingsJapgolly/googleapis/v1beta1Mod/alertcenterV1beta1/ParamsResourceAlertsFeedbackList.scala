package typingsJapgolly.googleapis.v1beta1Mod.alertcenterV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAlertsFeedbackList extends StandardParameters {
  /**
    * Required. The alert identifier. The "-" wildcard could be used to
    * represent all alerts.
    */
  var alertId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alert feedback are associated with. Inferred from the
    * caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Optional. A query string for filtering alert feedback results. For more
    * details, see [Query filters](/admin-sdk/alertcenter/guides/query-filters)
    * and [Supported query filter
    * fields](/admin-sdk/alertcenter/reference/filter-fields#alerts.feedback.list).
    */
  var filter: js.UndefOr[String] = js.native
}

