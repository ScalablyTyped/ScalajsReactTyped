package typingsJapgolly.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceDebuggerDebuggeesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The client version making the call. Schema: `domain/type/version` (e.g.,
    * `google.com/intellij/v1`).
    */
  var clientVersion: js.UndefOr[String] = js.native
  /**
    * When set to `true`, the result includes all debuggees. Otherwise, the
    * result includes only debuggees that are active.
    */
  var includeInactive: js.UndefOr[Boolean] = js.native
  /**
    * Project number of a Google Cloud project whose debuggees to list.
    */
  var project: js.UndefOr[String] = js.native
}

