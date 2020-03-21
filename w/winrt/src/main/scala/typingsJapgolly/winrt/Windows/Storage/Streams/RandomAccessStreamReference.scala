package typingsJapgolly.winrt.Windows.Storage.Streams

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
class RandomAccessStreamReference () extends IRandomAccessStreamReference {
  /* CompleteClass */
  override def openReadAsync(): IAsyncOperation[IRandomAccessStreamWithContentType] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
@js.native
object RandomAccessStreamReference extends js.Object {
  def createFromFile(file: IStorageFile): RandomAccessStreamReference = js.native
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference = js.native
  def createFromUri(uri: Uri): RandomAccessStreamReference = js.native
}

