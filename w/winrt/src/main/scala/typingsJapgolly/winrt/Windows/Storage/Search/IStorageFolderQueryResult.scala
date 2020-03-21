package typingsJapgolly.winrt.Windows.Storage.Search

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFolderQueryResult extends IStorageQueryResultBase {
  def getFoldersAsync(): IAsyncOperation[IVectorView[StorageFolder]] = js.native
  def getFoldersAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFolder]] = js.native
}

