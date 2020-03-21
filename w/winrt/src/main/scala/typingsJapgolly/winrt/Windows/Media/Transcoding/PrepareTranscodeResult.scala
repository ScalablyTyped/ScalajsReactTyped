package typingsJapgolly.winrt.Windows.Media.Transcoding

import typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Transcoding.PrepareTranscodeResult")
@js.native
class PrepareTranscodeResult () extends IPrepareTranscodeResult {
  /* CompleteClass */
  override var canTranscode: Boolean = js.native
  /* CompleteClass */
  override var failureReason: TranscodeFailureReason = js.native
  /* CompleteClass */
  override def transcodeAsync(): IAsyncActionWithProgress[Double] = js.native
}

