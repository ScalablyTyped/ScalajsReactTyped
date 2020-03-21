package typingsJapgolly.googleapis.chatV1Mod.chatV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSpacesMembersGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. Resource name of the membership to be retrieved, in the form
    * "spaces/x/members/x".  Example:
    * spaces/AAAAMpdlehY/members/105115627578887013105
    */
  var name: js.UndefOr[String] = js.native
}

