package typingsJapgolly.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsAddInstanceRequest extends js.Object {
  /**
    * A full or partial URL to an instance to add to this target pool. This can be a full or partial URL. For example, the following are valid URLs:
    * - https://www.googleapis.com/compute/v1/projects/project-id/zones/zone/instances/instance-name
    * - projects/project-id/zones/zone/instances/instance-name
    * - zones/zone/instances/instance-name
    */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.undefined
}

object TargetPoolsAddInstanceRequest {
  @scala.inline
  def apply(instances: js.Array[InstanceReference] = null): TargetPoolsAddInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPoolsAddInstanceRequest]
  }
}

