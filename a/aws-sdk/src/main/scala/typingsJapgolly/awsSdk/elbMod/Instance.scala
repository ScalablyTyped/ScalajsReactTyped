package typingsJapgolly.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.elbMod.InstanceId] = js.native
}

object Instance {
  @scala.inline
  def apply(InstanceId: InstanceId = null): Instance = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

