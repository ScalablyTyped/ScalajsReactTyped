package typingsJapgolly.pulumiAws.inputMod.glue

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionProperty extends js.Object {
  /**
    * The maximum number of concurrent runs allowed for a job. The default is 1.
    */
  var maxConcurrentRuns: js.UndefOr[Input[Double]] = js.native
}

object JobExecutionProperty {
  @scala.inline
  def apply(maxConcurrentRuns: Input[Double] = null): JobExecutionProperty = {
    val __obj = js.Dynamic.literal()
    if (maxConcurrentRuns != null) __obj.updateDynamic("maxConcurrentRuns")(maxConcurrentRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionProperty]
  }
}

