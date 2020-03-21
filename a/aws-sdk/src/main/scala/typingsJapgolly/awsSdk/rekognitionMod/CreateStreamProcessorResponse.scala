package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamProcessorResponse extends js.Object {
  /**
    * ARN for the newly create stream processor.
    */
  var StreamProcessorArn: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.StreamProcessorArn] = js.native
}

object CreateStreamProcessorResponse {
  @scala.inline
  def apply(StreamProcessorArn: StreamProcessorArn = null): CreateStreamProcessorResponse = {
    val __obj = js.Dynamic.literal()
    if (StreamProcessorArn != null) __obj.updateDynamic("StreamProcessorArn")(StreamProcessorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamProcessorResponse]
  }
}

