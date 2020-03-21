package typingsJapgolly.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxGetLinuxAccountViewsResponse extends js.Object {
  /** [Output Only] A list of authorized user accounts and groups. */
  var resource: js.UndefOr[LinuxAccountViews] = js.undefined
}

object LinuxGetLinuxAccountViewsResponse {
  @scala.inline
  def apply(resource: LinuxAccountViews = null): LinuxGetLinuxAccountViewsResponse = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxGetLinuxAccountViewsResponse]
  }
}

