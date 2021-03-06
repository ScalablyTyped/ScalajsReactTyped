package typingsJapgolly.googleapis.scriptV1Mod.scriptV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsDeploymentsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The deployment ID to be undeployed.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * The script project's Drive ID.
    */
  var scriptId: js.UndefOr[String] = js.native
}

