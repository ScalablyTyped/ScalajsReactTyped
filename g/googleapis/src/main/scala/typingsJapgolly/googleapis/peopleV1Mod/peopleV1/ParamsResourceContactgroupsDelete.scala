package typingsJapgolly.googleapis.peopleV1Mod.peopleV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceContactgroupsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Set to true to also delete the contacts in the specified group.
    */
  var deleteContacts: js.UndefOr[Boolean] = js.native
  /**
    * The resource name of the contact group to delete.
    */
  var resourceName: js.UndefOr[String] = js.native
}

