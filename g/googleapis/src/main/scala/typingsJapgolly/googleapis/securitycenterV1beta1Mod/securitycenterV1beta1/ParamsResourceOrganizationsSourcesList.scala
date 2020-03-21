package typingsJapgolly.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsSourcesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of results to return in a single response. Default is
    * 10, minimum is 1, maximum is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListSourcesResponse`; indicates that this
    * is a continuation of a prior `ListSources` call, and that the system
    * should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Resource name of the parent of sources to list. Its format should be
    * "organizations/[organization_id]".
    */
  var parent: js.UndefOr[String] = js.native
}

