package typingsJapgolly.winrt.Windows.Graphics.Imaging

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapDecoder extends js.Object {
  var bitmapContainerProperties: BitmapPropertiesView
  var decoderInformation: BitmapCodecInformation
  var frameCount: Double
  def getFrameAsync(frameIndex: Double): IAsyncOperation[BitmapFrame]
  def getPreviewAsync(): IAsyncOperation[ImageStream]
}

object IBitmapDecoder {
  @scala.inline
  def apply(
    bitmapContainerProperties: BitmapPropertiesView,
    decoderInformation: BitmapCodecInformation,
    frameCount: Double,
    getFrameAsync: Double => CallbackTo[IAsyncOperation[BitmapFrame]],
    getPreviewAsync: CallbackTo[IAsyncOperation[ImageStream]]
  ): IBitmapDecoder = {
    val __obj = js.Dynamic.literal(bitmapContainerProperties = bitmapContainerProperties.asInstanceOf[js.Any], decoderInformation = decoderInformation.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any])
    __obj.updateDynamic("getFrameAsync")(js.Any.fromFunction1((t0: scala.Double) => getFrameAsync(t0).runNow()))
    __obj.updateDynamic("getPreviewAsync")(getPreviewAsync.toJsFn)
    __obj.asInstanceOf[IBitmapDecoder]
  }
}

