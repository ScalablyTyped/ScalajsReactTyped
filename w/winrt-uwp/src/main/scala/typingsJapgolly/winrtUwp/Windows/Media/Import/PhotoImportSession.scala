package typingsJapgolly.winrtUwp.Windows.Media.Import

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a photo import session with a photo import source. */
@JSGlobal("Windows.Media.Import.PhotoImportSession")
@js.native
abstract class PhotoImportSession () extends js.Object {
  /** Gets or sets a value specifying whether the session date should be appended to the destination folder name. */
  var appendSessionDateToDestinationFolder: Boolean = js.native
  /** Gets or sets the prefix for the destination file name. */
  var destinationFileNamePrefix: String = js.native
  /** Gets or sets the destination folder for the photo import session. */
  var destinationFolder: IStorageFolder = js.native
  /** Gets a unique identifier for the import session. */
  var sessionId: String = js.native
  /** Gets an object representing the source device associated with the photo import session. */
  var source: PhotoImportSource = js.native
  /** Gets or sets a value indicating the method used for naming subfolders within the destination folder. */
  var subfolderCreationMode: PhotoImportSubfolderCreationMode = js.native
  /** Closes the photo import session and releases associated resources. */
  def close(): Unit = js.native
  /**
    * Asynchronously finds items on the source device that are available for import.
    * @param contentTypeFilter A value indicating whether the find operation includes images, videos, or both in the results.
    * @param itemSelectionMode A value indicating whether all items, no items, or only new items in the results are initially marked as selected.
    * @return An asynchronous operation that returns a PhotoImportFindItemsResult on successful completion.
    */
  def findItemsAsync(contentTypeFilter: PhotoImportContentTypeFilter, itemSelectionMode: PhotoImportItemSelectionMode): IPromiseWithIAsyncOperationWithProgress[PhotoImportFindItemsResult, Double] = js.native
}

