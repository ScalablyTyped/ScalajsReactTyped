package typingsJapgolly.pulumiAws.inviteAccepterMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAccepterState extends js.Object {
  /**
    * The detector ID of the member GuardDuty account.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
  /**
    * AWS account ID for master account.
    */
  val masterAccountId: js.UndefOr[Input[String]] = js.native
}

object InviteAccepterState {
  @scala.inline
  def apply(detectorId: Input[String] = null, masterAccountId: Input[String] = null): InviteAccepterState = {
    val __obj = js.Dynamic.literal()
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (masterAccountId != null) __obj.updateDynamic("masterAccountId")(masterAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAccepterState]
  }
}

