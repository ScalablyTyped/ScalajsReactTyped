package typingsJapgolly.azureSb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-sb", "createNotificationHubService")
@js.native
object createNotificationHubService extends js.Object {
  def apply(hubName: String): NotificationHubService = js.native
  def apply(hubName: String, endpointOrConnectionString: String): NotificationHubService = js.native
  def apply(hubName: String, endpointOrConnectionString: String, sharedAccessKeyName: String): NotificationHubService = js.native
  def apply(
    hubName: String,
    endpointOrConnectionString: String,
    sharedAccessKeyName: String,
    sharedAccessKeyValue: String
  ): NotificationHubService = js.native
}

