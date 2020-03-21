package typingsJapgolly.googleapis.tpuV1Mod.tpuV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsTensorflowversionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * List filter.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * Sort results.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The maximum number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The parent resource name.
    */
  var parent: js.UndefOr[String] = js.native
}

