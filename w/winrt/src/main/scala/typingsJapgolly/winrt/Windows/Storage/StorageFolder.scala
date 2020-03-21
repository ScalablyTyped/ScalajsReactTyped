package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.Search.IStorageFolderQueryOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageFolder")
@js.native
class StorageFolder ()
  extends IStorageFolder
     with IStorageFolder2
     with IStorageFolderQueryOperations
     with IStorageItemProperties {
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  /* CompleteClass */
  override def tryGetItemAsync(name: String): IAsyncOperation[IStorageItem] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
object StorageFolder extends js.Object {
  def getFolderFromPathAsync(path: String): IAsyncOperation[StorageFolder] = js.native
}

