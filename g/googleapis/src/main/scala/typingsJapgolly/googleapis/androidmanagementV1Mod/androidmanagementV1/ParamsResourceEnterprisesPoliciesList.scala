package typingsJapgolly.googleapis.androidmanagementV1Mod.androidmanagementV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEnterprisesPoliciesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The requested page size. The actual page size may be fixed to a min or
    * max value.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results returned by the server.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the enterprise in the form enterprises/{enterpriseId}.
    */
  var parent: js.UndefOr[String] = js.native
}

