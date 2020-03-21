package typingsJapgolly.winrt.Windows.Storage.FileProperties

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IContentTypeProvider
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.FileProperties.StorageItemThumbnail")
@js.native
class StorageItemThumbnail ()
  extends IRandomAccessStream
     with IContentTypeProvider
     with IThumbnailProperties {
  /* CompleteClass */
  override var canRead: Boolean = js.native
  /* CompleteClass */
  override var canWrite: Boolean = js.native
  /* CompleteClass */
  override var contentType: String = js.native
  /* CompleteClass */
  override var originalHeight: Double = js.native
  /* CompleteClass */
  override var originalWidth: Double = js.native
  /* CompleteClass */
  override var position: Double = js.native
  /* CompleteClass */
  override var returnedSmallerCachedSize: Boolean = js.native
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override var `type`: ThumbnailType = js.native
  /* CompleteClass */
  override def cloneStream(): IRandomAccessStream = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  def dispose(): Unit = js.native
  /* CompleteClass */
  override def flushAsync(): IAsyncOperation[Boolean] = js.native
  /* CompleteClass */
  override def getInputStreamAt(position: Double): IInputStream = js.native
  /* CompleteClass */
  override def getOutputStreamAt(position: Double): IOutputStream = js.native
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
  /* CompleteClass */
  override def seek(position: Double): Unit = js.native
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
}

