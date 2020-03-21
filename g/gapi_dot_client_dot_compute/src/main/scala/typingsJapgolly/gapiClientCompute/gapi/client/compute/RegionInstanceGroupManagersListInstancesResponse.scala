package typingsJapgolly.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupManagersListInstancesResponse extends js.Object {
  /** List of managed instances. */
  var managedInstances: js.UndefOr[js.Array[ManagedInstance]] = js.undefined
}

object RegionInstanceGroupManagersListInstancesResponse {
  @scala.inline
  def apply(managedInstances: js.Array[ManagedInstance] = null): RegionInstanceGroupManagersListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (managedInstances != null) __obj.updateDynamic("managedInstances")(managedInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionInstanceGroupManagersListInstancesResponse]
  }
}

