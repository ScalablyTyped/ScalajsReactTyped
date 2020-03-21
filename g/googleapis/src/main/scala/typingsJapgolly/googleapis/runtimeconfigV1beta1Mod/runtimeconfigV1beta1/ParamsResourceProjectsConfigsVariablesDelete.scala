package typingsJapgolly.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsConfigsVariablesDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The name of the variable to delete, in the format:
    * `projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME]`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Set to `true` to recursively delete multiple variables with the same
    * prefix.
    */
  var recursive: js.UndefOr[Boolean] = js.native
}

