package typingsJapgolly.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsScanconfigsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The filter expression.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The number of scan configs to return in the list.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Token to provide to skip to a particular spot in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the project to list scan configurations for in the form of
    * `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}

