package typingsJapgolly.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePipelineResponse extends js.Object {
  /**
    * A section of the response body that provides information about the pipeline that is created.
    */
  var Pipeline: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.Pipeline] = js.native
  /**
    * Elastic Transcoder returns a warning if the resources used by your pipeline are not in the same region as the pipeline. Using resources in the same region, such as your Amazon S3 buckets, Amazon SNS notification topics, and AWS KMS key, reduces processing time and prevents cross-regional charges.
    */
  var Warnings: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.Warnings] = js.native
}

object CreatePipelineResponse {
  @scala.inline
  def apply(Pipeline: Pipeline = null, Warnings: Warnings = null): CreatePipelineResponse = {
    val __obj = js.Dynamic.literal()
    if (Pipeline != null) __obj.updateDynamic("Pipeline")(Pipeline.asInstanceOf[js.Any])
    if (Warnings != null) __obj.updateDynamic("Warnings")(Warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineResponse]
  }
}

