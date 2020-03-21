package typingsJapgolly.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesSetMachineResourcesRequest extends js.Object {
  /** List of the type and count of accelerator cards attached to the instance. */
  var guestAccelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
}

object InstancesSetMachineResourcesRequest {
  @scala.inline
  def apply(guestAccelerators: js.Array[AcceleratorConfig] = null): InstancesSetMachineResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (guestAccelerators != null) __obj.updateDynamic("guestAccelerators")(guestAccelerators.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstancesSetMachineResourcesRequest]
  }
}

