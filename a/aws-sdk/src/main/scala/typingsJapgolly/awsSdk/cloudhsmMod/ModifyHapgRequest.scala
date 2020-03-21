package typingsJapgolly.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to modify.
    */
  var HapgArn: typingsJapgolly.awsSdk.cloudhsmMod.HapgArn = js.native
  /**
    * The new label for the high-availability partition group.
    */
  var Label: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmMod.Label] = js.native
  /**
    * The list of partition serial numbers to make members of the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmMod.PartitionSerialList] = js.native
}

object ModifyHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn, Label: Label = null, PartitionSerialList: PartitionSerialList = null): ModifyHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (PartitionSerialList != null) __obj.updateDynamic("PartitionSerialList")(PartitionSerialList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHapgRequest]
  }
}

