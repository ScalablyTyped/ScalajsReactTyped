package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProcessorOutput extends js.Object {
  /**
    * The Amazon Kinesis Data Streams stream to which the Amazon Rekognition stream processor streams the analysis results.
    */
  var KinesisDataStream: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.KinesisDataStream] = js.native
}

object StreamProcessorOutput {
  @scala.inline
  def apply(KinesisDataStream: KinesisDataStream = null): StreamProcessorOutput = {
    val __obj = js.Dynamic.literal()
    if (KinesisDataStream != null) __obj.updateDynamic("KinesisDataStream")(KinesisDataStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProcessorOutput]
  }
}

