package typingsJapgolly.googleapis.cloudidentityV1Mod.cloudidentityV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsMembershipsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Membership to be deleted.  Format:
    * `groups/{group_id}/memberships/{member_id}`, where `group_id` is the
    * unique ID assigned to the Group to which Membership belongs to, and
    * member_id is the unique ID assigned to the member.
    */
  var name: js.UndefOr[String] = js.native
}

