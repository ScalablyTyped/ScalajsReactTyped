package typingsJapgolly.googleapis.monitoringV3Mod.monitoringV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceUptimecheckipsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of results to return in a single response. The server
    * may further constrain the maximum number of results returned in a single
    * page. If the page_size is <=0, the server will decide the number of
    * results to be returned. NOTE: this field is not yet implemented
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If this field is not empty then it must contain the nextPageToken value
    * returned by a previous call to this method. Using this field causes the
    * method to return more results from the previous method call. NOTE: this
    * field is not yet implemented
    */
  var pageToken: js.UndefOr[String] = js.native
}

