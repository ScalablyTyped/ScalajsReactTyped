package typingsJapgolly.googleapis.peopleV1Mod.peopleV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceContactgroupsBatchget extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Specifies the maximum number of members to return for each group.
    */
  var maxMembers: js.UndefOr[Double] = js.native
  /**
    * The resource names of the contact groups to get.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}

