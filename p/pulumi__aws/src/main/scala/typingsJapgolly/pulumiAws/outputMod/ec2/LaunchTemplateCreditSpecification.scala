package typingsJapgolly.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCreditSpecification extends js.Object {
  var cpuCredits: js.UndefOr[String] = js.native
}

object LaunchTemplateCreditSpecification {
  @scala.inline
  def apply(cpuCredits: String = null): LaunchTemplateCreditSpecification = {
    val __obj = js.Dynamic.literal()
    if (cpuCredits != null) __obj.updateDynamic("cpuCredits")(cpuCredits.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCreditSpecification]
  }
}

