package typingsJapgolly.googleapis.pubsubV1Mod.pubsubV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsSubscriptionsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of subscriptions to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListSubscriptionsResponse`; indicates
    * that this is a continuation of a prior `ListSubscriptions` call, and that
    * the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the project in which to list subscriptions. Format is
    * `projects/{project-id}`.
    */
  var project: js.UndefOr[String] = js.native
}

