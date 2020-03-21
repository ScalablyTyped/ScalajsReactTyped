package typingsJapgolly.googleapis.youtubereportingV1Mod.youtubereportingV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceJobsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If set to true, also system-managed jobs will be returned; otherwise only
    * user-created jobs will be returned. System-managed jobs can neither be
    * modified nor deleted.
    */
  var includeSystemManaged: js.UndefOr[Boolean] = js.native
  /**
    * The content owner's external ID on which behalf the user is acting on. If
    * not set, the user is acting for himself (his own channel).
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.native
  /**
    * Requested page size. Server may return fewer jobs than requested. If
    * unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListReportTypesResponse.next_page_token
    * returned in response to the previous call to the `ListJobs` method.
    */
  var pageToken: js.UndefOr[String] = js.native
}

