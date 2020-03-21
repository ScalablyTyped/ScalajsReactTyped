package typingsJapgolly.googleapis.monitoringV3Mod.monitoringV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsMonitoredresourcedescriptorsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The monitored resource descriptor to get. The format is
    * "projects/{project_id_or_number}/monitoredResourceDescriptors/{resource_type}".
    * The {resource_type} is a predefined type, such as cloudsql_database.
    */
  var name: js.UndefOr[String] = js.native
}

