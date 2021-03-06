package typingsJapgolly.googleapis.bigtableadminV2Mod.bigtableadminV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesTablesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The unique name of the requested table. Values are of the form
    * `projects/<project>/instances/<instance>/tables/<table>`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The view to be applied to the returned table's fields. Defaults to
    * `SCHEMA_VIEW` if unspecified.
    */
  var view: js.UndefOr[String] = js.native
}

