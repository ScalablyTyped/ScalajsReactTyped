package typingsJapgolly.pulumiAws.inputMod.ec2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[Input[String]] = js.native
}

object InstanceCreditSpecification {
  @scala.inline
  def apply(cpuCredits: Input[String] = null): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
}

