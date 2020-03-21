package typingsJapgolly.pulumiAws.inputMod.batch

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDefinitionRetryStrategy extends js.Object {
  var attempts: js.UndefOr[Input[Double]] = js.native
}

object JobDefinitionRetryStrategy {
  @scala.inline
  def apply(attempts: Input[Double] = null): JobDefinitionRetryStrategy = {
    val __obj = js.Dynamic.literal()
    if (attempts != null) __obj.updateDynamic("attempts")(attempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDefinitionRetryStrategy]
  }
}

