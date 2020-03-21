package typingsJapgolly.googleapis.cloudidentityV1Mod.cloudidentityV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The default page size is 200 (max 1000) for the BASIC view, and 50 (max
    * 500) for the FULL view.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous list request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * `Required`. May be made Optional in the future. Customer ID to list all
    * groups from.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Group resource view to be returned. Defaults to [View.BASIC]().
    */
  var view: js.UndefOr[String] = js.native
}

