package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineForPatchGroupRequest extends js.Object {
  /**
    * Returns he operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.OperatingSystem] = js.native
  /**
    * The name of the patch group whose patch baseline should be retrieved.
    */
  var PatchGroup: typingsJapgolly.awsSdk.ssmMod.PatchGroup = js.native
}

object GetPatchBaselineForPatchGroupRequest {
  @scala.inline
  def apply(PatchGroup: PatchGroup, OperatingSystem: OperatingSystem = null): GetPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupRequest]
  }
}

