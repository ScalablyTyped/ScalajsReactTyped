package typingsJapgolly.winrt.Windows.Media.Transcoding

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrepareTranscodeResult extends js.Object {
  var canTranscode: Boolean
  var failureReason: TranscodeFailureReason
  def transcodeAsync(): IAsyncActionWithProgress[Double]
}

object IPrepareTranscodeResult {
  @scala.inline
  def apply(
    canTranscode: Boolean,
    failureReason: TranscodeFailureReason,
    transcodeAsync: CallbackTo[IAsyncActionWithProgress[Double]]
  ): IPrepareTranscodeResult = {
    val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any])
    __obj.updateDynamic("transcodeAsync")(transcodeAsync.toJsFn)
    __obj.asInstanceOf[IPrepareTranscodeResult]
  }
}

