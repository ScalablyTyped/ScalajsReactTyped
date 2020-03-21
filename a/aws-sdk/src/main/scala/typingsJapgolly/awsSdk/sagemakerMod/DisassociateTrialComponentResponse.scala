package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTrialComponentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TrialArn] = js.native
  /**
    * The ARN of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typingsJapgolly.awsSdk.sagemakerMod.TrialComponentArn] = js.native
}

object DisassociateTrialComponentResponse {
  @scala.inline
  def apply(TrialArn: TrialArn = null, TrialComponentArn: TrialComponentArn = null): DisassociateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (TrialArn != null) __obj.updateDynamic("TrialArn")(TrialArn.asInstanceOf[js.Any])
    if (TrialComponentArn != null) __obj.updateDynamic("TrialComponentArn")(TrialComponentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTrialComponentResponse]
  }
}

