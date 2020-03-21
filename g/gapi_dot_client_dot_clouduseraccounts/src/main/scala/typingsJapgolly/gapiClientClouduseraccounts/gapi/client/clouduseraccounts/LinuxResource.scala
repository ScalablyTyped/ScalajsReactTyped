package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientClouduseraccounts.AnonFilter
import typingsJapgolly.gapiClientClouduseraccounts.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResource extends js.Object {
  /** Returns a list of authorized public keys for a specific user account. */
  def getAuthorizedKeysView(request: AnonInstance): Request_[LinuxGetAuthorizedKeysViewResponse]
  /** Retrieves a list of user accounts for an instance within a specific project. */
  def getLinuxAccountViews(request: AnonFilter): Request_[LinuxGetLinuxAccountViewsResponse]
}

object LinuxResource {
  @scala.inline
  def apply(
    getAuthorizedKeysView: AnonInstance => CallbackTo[Request_[LinuxGetAuthorizedKeysViewResponse]],
    getLinuxAccountViews: AnonFilter => CallbackTo[Request_[LinuxGetLinuxAccountViewsResponse]]
  ): LinuxResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAuthorizedKeysView")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonInstance) => getAuthorizedKeysView(t0).runNow()))
    __obj.updateDynamic("getLinuxAccountViews")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientClouduseraccounts.AnonFilter) => getLinuxAccountViews(t0).runNow()))
    __obj.asInstanceOf[LinuxResource]
  }
}

