package typingsJapgolly.winrt.Windows.System.UserProfile

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockScreenStatics extends js.Object {
  var originalImageFile: Uri
  def getImageStream(): IRandomAccessStream
  def setImageFileAsync(value: IStorageFile): IAsyncAction
  def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction
}

object ILockScreenStatics {
  @scala.inline
  def apply(
    getImageStream: CallbackTo[IRandomAccessStream],
    originalImageFile: Uri,
    setImageFileAsync: IStorageFile => CallbackTo[IAsyncAction],
    setImageStreamAsync: IRandomAccessStream => CallbackTo[IAsyncAction]
  ): ILockScreenStatics = {
    val __obj = js.Dynamic.literal(originalImageFile = originalImageFile.asInstanceOf[js.Any])
    __obj.updateDynamic("getImageStream")(getImageStream.toJsFn)
    __obj.updateDynamic("setImageFileAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => setImageFileAsync(t0).runNow()))
    __obj.updateDynamic("setImageStreamAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream) => setImageStreamAsync(t0).runNow()))
    __obj.asInstanceOf[ILockScreenStatics]
  }
}

