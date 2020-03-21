package typingsJapgolly.winrt.Windows.Storage.BulkAccess

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.FileProperties.BasicProperties
import typingsJapgolly.winrt.Windows.Storage.FileProperties.DocumentProperties
import typingsJapgolly.winrt.Windows.Storage.FileProperties.ImageProperties
import typingsJapgolly.winrt.Windows.Storage.FileProperties.MusicProperties
import typingsJapgolly.winrt.Windows.Storage.FileProperties.StorageItemThumbnail
import typingsJapgolly.winrt.Windows.Storage.FileProperties.VideoProperties
import typingsJapgolly.winrt.Windows.Storage.IStorageFolder
import typingsJapgolly.winrt.Windows.Storage.IStorageItem
import typingsJapgolly.winrt.Windows.Storage.IStorageItemProperties
import typingsJapgolly.winrt.Windows.Storage.Search.IStorageFolderQueryOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.BulkAccess.FolderInformation")
@js.native
class FolderInformation ()
  extends IStorageFolder
     with IStorageItemInformation
     with IStorageItemProperties
     with IStorageFolderQueryOperations {
  /* CompleteClass */
  override var basicProperties: BasicProperties = js.native
  /* CompleteClass */
  override var documentProperties: DocumentProperties = js.native
  /* CompleteClass */
  override var imageProperties: ImageProperties = js.native
  /* CompleteClass */
  override var musicProperties: MusicProperties = js.native
  /* CompleteClass */
  override var onpropertiesupdated: js.Any = js.native
  /* CompleteClass */
  override var onthumbnailupdated: js.Any = js.native
  /* CompleteClass */
  override var thumbnail: StorageItemThumbnail = js.native
  /* CompleteClass */
  override var videoProperties: VideoProperties = js.native
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}

