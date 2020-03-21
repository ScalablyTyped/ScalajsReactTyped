package typingsJapgolly.winrtUwp.Windows.Storage.Search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods to access to and manage query results. */
trait IStorageQueryResultBase extends js.Object {
  /** Gets the folder originally used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object. This folder represents the scope of the query. */
  var folder: StorageFolder
  /**
    * Applies new query options to the results retrieved by the StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @param newQueryOptions The new query options.
    */
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit
  /**
    * Retrieves the index of the file from the query results that most closely matches the specified property value. The property that is matched is determined by the first SortEntry of the QueryOptions.SortOrder list.
    * @param value The property value to match when searching the query results.
    * @return When this method completes successfully it returns the index of the matched item in the query results.
    */
  def findStartIndexAsync(value: js.Any): IPromiseWithIAsyncOperation[Double]
  /**
    * Retrieves the query options used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @return The query options.
    */
  def getCurrentQueryOptions(): QueryOptions
  /**
    * Retrieves the number of items that match the query that created a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @return When this method completes successfully, it returns the number of items that match the query.
    */
  def getItemCountAsync(): IPromiseWithIAsyncOperation[Double]
}

object IStorageQueryResultBase {
  @scala.inline
  def apply(
    applyNewQueryOptions: QueryOptions => Callback,
    findStartIndexAsync: js.Any => CallbackTo[IPromiseWithIAsyncOperation[Double]],
    folder: StorageFolder,
    getCurrentQueryOptions: CallbackTo[QueryOptions],
    getItemCountAsync: CallbackTo[IPromiseWithIAsyncOperation[Double]]
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any])
    __obj.updateDynamic("applyNewQueryOptions")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Storage.Search.QueryOptions) => applyNewQueryOptions(t0).runNow()))
    __obj.updateDynamic("findStartIndexAsync")(js.Any.fromFunction1((t0: js.Any) => findStartIndexAsync(t0).runNow()))
    __obj.updateDynamic("getCurrentQueryOptions")(getCurrentQueryOptions.toJsFn)
    __obj.updateDynamic("getItemCountAsync")(getItemCountAsync.toJsFn)
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
}

