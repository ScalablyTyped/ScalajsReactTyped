package typingsJapgolly.winrt.Windows.System.UserProfile

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.UserProfile.LockScreen")
@js.native
class LockScreen () extends js.Object

/* static members */
@JSGlobal("Windows.System.UserProfile.LockScreen")
@js.native
object LockScreen extends js.Object {
  var originalImageFile: Uri = js.native
  def getImageStream(): IRandomAccessStream = js.native
  def setImageFileAsync(value: IStorageFile): IAsyncAction = js.native
  def setImageStreamAsync(value: IRandomAccessStream): IAsyncAction = js.native
}

