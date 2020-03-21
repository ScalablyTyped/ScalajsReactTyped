package typingsJapgolly.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBatchInferenceJobResponse extends js.Object {
  /**
    * The ARN of the batch inference job.
    */
  var batchInferenceJobArn: js.UndefOr[Arn] = js.native
}

object CreateBatchInferenceJobResponse {
  @scala.inline
  def apply(batchInferenceJobArn: Arn = null): CreateBatchInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    if (batchInferenceJobArn != null) __obj.updateDynamic("batchInferenceJobArn")(batchInferenceJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchInferenceJobResponse]
  }
}

