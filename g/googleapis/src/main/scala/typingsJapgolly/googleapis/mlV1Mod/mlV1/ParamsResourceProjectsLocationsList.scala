package typingsJapgolly.googleapis.mlV1Mod.mlV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The number of locations to retrieve per "page" of results. If
    * there are more remaining results than this number, the response message
    * will contain a valid value in the `next_page_token` field.  The default
    * value is 20, and the maximum page size is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. A page token to request the next page of results.  You get the
    * token from the `next_page_token` field of the response from the previous
    * call.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The name of the project for which available locations are to be
    * listed (since some locations might be whitelisted for specific projects).
    */
  var parent: js.UndefOr[String] = js.native
}

