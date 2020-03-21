package typingsJapgolly.winrt.Windows.Media.MediaProperties

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaEncodingProfileStatics extends js.Object {
  def createFromFileAsync(file: IStorageFile): IAsyncOperation[MediaEncodingProfile]
  def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[MediaEncodingProfile]
  def createM4a(quality: AudioEncodingQuality): MediaEncodingProfile
  def createMp3(quality: AudioEncodingQuality): MediaEncodingProfile
  def createMp4(quality: VideoEncodingQuality): MediaEncodingProfile
  def createWma(quality: AudioEncodingQuality): MediaEncodingProfile
  def createWmv(quality: VideoEncodingQuality): MediaEncodingProfile
}

object IMediaEncodingProfileStatics {
  @scala.inline
  def apply(
    createFromFileAsync: IStorageFile => CallbackTo[IAsyncOperation[MediaEncodingProfile]],
    createFromStreamAsync: IRandomAccessStream => CallbackTo[IAsyncOperation[MediaEncodingProfile]],
    createM4a: AudioEncodingQuality => CallbackTo[MediaEncodingProfile],
    createMp3: AudioEncodingQuality => CallbackTo[MediaEncodingProfile],
    createMp4: VideoEncodingQuality => CallbackTo[MediaEncodingProfile],
    createWma: AudioEncodingQuality => CallbackTo[MediaEncodingProfile],
    createWmv: VideoEncodingQuality => CallbackTo[MediaEncodingProfile]
  ): IMediaEncodingProfileStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFromFileAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => createFromFileAsync(t0).runNow()))
    __obj.updateDynamic("createFromStreamAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => createFromStreamAsync(t0).runNow()))
    __obj.updateDynamic("createM4a")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality) => createM4a(t0).runNow()))
    __obj.updateDynamic("createMp3")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality) => createMp3(t0).runNow()))
    __obj.updateDynamic("createMp4")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality) => createMp4(t0).runNow()))
    __obj.updateDynamic("createWma")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality) => createWma(t0).runNow()))
    __obj.updateDynamic("createWmv")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality) => createWmv(t0).runNow()))
    __obj.asInstanceOf[IMediaEncodingProfileStatics]
  }
}

