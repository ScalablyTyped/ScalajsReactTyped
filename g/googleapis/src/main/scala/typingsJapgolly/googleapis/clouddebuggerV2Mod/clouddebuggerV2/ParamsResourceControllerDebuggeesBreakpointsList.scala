package typingsJapgolly.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceControllerDebuggeesBreakpointsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Identifies the debuggee.
    */
  var debuggeeId: js.UndefOr[String] = js.native
  /**
    * If set to `true` (recommended), returns `google.rpc.Code.OK` status and
    * sets the `wait_expired` response field to `true` when the server-selected
    * timeout has expired.  If set to `false` (deprecated), returns
    * `google.rpc.Code.ABORTED` status when the server-selected timeout has
    * expired.
    */
  var successOnTimeout: js.UndefOr[Boolean] = js.native
  /**
    * A token that, if specified, blocks the method call until the list of
    * active breakpoints has changed, or a server-selected timeout has expired.
    * The value should be set from the `next_wait_token` field in the last
    * response. The initial value should be set to `"init"`.
    */
  var waitToken: js.UndefOr[String] = js.native
}

