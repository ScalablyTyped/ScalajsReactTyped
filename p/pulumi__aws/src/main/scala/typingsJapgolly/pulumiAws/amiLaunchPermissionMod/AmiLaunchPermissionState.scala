package typingsJapgolly.pulumiAws.amiLaunchPermissionMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiLaunchPermissionState extends js.Object {
  /**
    * An AWS Account ID to add launch permissions.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val imageId: js.UndefOr[Input[String]] = js.native
}

object AmiLaunchPermissionState {
  @scala.inline
  def apply(accountId: Input[String] = null, imageId: Input[String] = null): AmiLaunchPermissionState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiLaunchPermissionState]
  }
}

