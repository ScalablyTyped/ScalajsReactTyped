package typingsJapgolly.winrtUwp.Windows.Storage.Search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods to access to and manage query results. */
trait IStorageQueryResultBase extends StObject {
  
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
  def findStartIndexAsync(value: Any): IPromiseWithIAsyncOperation[Double]
  
  /** Gets the folder originally used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object. This folder represents the scope of the query. */
  var folder: StorageFolder
  
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
  
  inline def apply(
    applyNewQueryOptions: QueryOptions => Callback,
    findStartIndexAsync: Any => IPromiseWithIAsyncOperation[Double],
    folder: StorageFolder,
    getCurrentQueryOptions: CallbackTo[QueryOptions],
    getItemCountAsync: CallbackTo[IPromiseWithIAsyncOperation[Double]]
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1((t0: QueryOptions) => applyNewQueryOptions(t0).runNow()), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder.asInstanceOf[js.Any], getCurrentQueryOptions = getCurrentQueryOptions.toJsFn, getItemCountAsync = getItemCountAsync.toJsFn)
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
  
  extension [Self <: IStorageQueryResultBase](x: Self) {
    
    inline def setApplyNewQueryOptions(value: QueryOptions => Callback): Self = StObject.set(x, "applyNewQueryOptions", js.Any.fromFunction1((t0: QueryOptions) => value(t0).runNow()))
    
    inline def setFindStartIndexAsync(value: Any => IPromiseWithIAsyncOperation[Double]): Self = StObject.set(x, "findStartIndexAsync", js.Any.fromFunction1(value))
    
    inline def setFolder(value: StorageFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentQueryOptions(value: CallbackTo[QueryOptions]): Self = StObject.set(x, "getCurrentQueryOptions", value.toJsFn)
    
    inline def setGetItemCountAsync(value: CallbackTo[IPromiseWithIAsyncOperation[Double]]): Self = StObject.set(x, "getItemCountAsync", value.toJsFn)
  }
}
