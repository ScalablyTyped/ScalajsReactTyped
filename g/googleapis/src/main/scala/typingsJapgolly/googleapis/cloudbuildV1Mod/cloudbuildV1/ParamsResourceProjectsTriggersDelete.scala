package typingsJapgolly.googleapis.cloudbuildV1Mod.cloudbuildV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsTriggersDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of the project that owns the trigger.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * ID of the `BuildTrigger` to delete.
    */
  var triggerId: js.UndefOr[String] = js.native
}

