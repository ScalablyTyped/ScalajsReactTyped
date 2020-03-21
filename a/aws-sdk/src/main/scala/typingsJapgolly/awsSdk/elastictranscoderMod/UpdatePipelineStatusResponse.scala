package typingsJapgolly.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePipelineStatusResponse extends js.Object {
  /**
    * A section of the response body that provides information about the pipeline.
    */
  var Pipeline: js.UndefOr[typingsJapgolly.awsSdk.elastictranscoderMod.Pipeline] = js.native
}

object UpdatePipelineStatusResponse {
  @scala.inline
  def apply(Pipeline: Pipeline = null): UpdatePipelineStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (Pipeline != null) __obj.updateDynamic("Pipeline")(Pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineStatusResponse]
  }
}

