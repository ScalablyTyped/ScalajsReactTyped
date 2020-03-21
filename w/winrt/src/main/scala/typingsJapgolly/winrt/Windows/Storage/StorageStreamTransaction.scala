package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageStreamTransaction")
@js.native
class StorageStreamTransaction () extends IStorageStreamTransaction {
  /* CompleteClass */
  override var stream: IRandomAccessStream = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def commitAsync(): IAsyncAction = js.native
  def dispose(): Unit = js.native
}

