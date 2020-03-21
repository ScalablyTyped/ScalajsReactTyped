package typingsJapgolly.googleapis.vaultV1Mod.vaultV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMattersSavedqueriesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The matter id of the parent matter for which the saved queries are to be
    * retrieved.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The maximum number of saved queries to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The pagination token as returned in the previous response. An empty token
    * means start from the beginning.
    */
  var pageToken: js.UndefOr[String] = js.native
}

