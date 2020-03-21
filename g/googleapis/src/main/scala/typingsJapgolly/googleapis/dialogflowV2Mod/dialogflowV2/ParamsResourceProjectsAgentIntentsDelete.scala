package typingsJapgolly.googleapis.dialogflowV2Mod.dialogflowV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsAgentIntentsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The name of the intent to delete. If this intent has direct or
    * indirect followup intents, we also delete them. Format:
    * `projects/<Project ID>/agent/intents/<Intent ID>`.
    */
  var name: js.UndefOr[String] = js.native
}

