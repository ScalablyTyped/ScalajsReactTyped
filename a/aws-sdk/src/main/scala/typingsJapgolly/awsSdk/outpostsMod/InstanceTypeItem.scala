package typingsJapgolly.awsSdk.outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeItem extends js.Object {
  var InstanceType: js.UndefOr[typingsJapgolly.awsSdk.outpostsMod.InstanceType] = js.native
}

object InstanceTypeItem {
  @scala.inline
  def apply(InstanceType: InstanceType = null): InstanceTypeItem = {
    val __obj = js.Dynamic.literal()
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTypeItem]
  }
}

