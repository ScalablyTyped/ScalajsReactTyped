package typingsJapgolly.googleapis.v1beta1aMod.pubsubV1beta1a

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTopicsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of topics to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The value obtained in the last <code>ListTopicsResponse</code> for
    * continuation.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * A valid label query expression.
    */
  var query: js.UndefOr[String] = js.native
}

