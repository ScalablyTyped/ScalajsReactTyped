package typingsJapgolly.googleapis.scriptV1Mod.scriptV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceScriptsRun extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExecutionRequest] = js.native
  /**
    * The script ID of the script to be executed. To find the script ID, open
    * the project in the script editor and select **File > Project
    * properties**.
    */
  var scriptId: js.UndefOr[String] = js.native
}

