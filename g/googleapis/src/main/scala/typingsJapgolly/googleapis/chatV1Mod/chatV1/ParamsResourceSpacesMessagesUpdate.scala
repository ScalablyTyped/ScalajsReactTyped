package typingsJapgolly.googleapis.chatV1Mod.chatV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSpacesMessagesUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Resource name, in the form "spaces/x/messages/x".  Example:
    * spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMessage] = js.native
  /**
    * Required. The field paths to be updated.  Currently supported field
    * paths: "text", "cards".
    */
  var updateMask: js.UndefOr[String] = js.native
}

