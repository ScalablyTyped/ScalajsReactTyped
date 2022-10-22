package typingsJapgolly.winrt.Windows.Storage.Search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorageQueryResultBase extends StObject {
  
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit
  
  def findStartIndexAsync(value: Any): IAsyncOperation[Double]
  
  var folder: StorageFolder
  
  def getCurrentQueryOptions(): QueryOptions
  
  def getItemCountAsync(): IAsyncOperation[Double]
  
  var oncontentschanged: Any
  
  var onoptionschanged: Any
}
object IStorageQueryResultBase {
  
  inline def apply(
    applyNewQueryOptions: QueryOptions => Callback,
    findStartIndexAsync: Any => IAsyncOperation[Double],
    folder: StorageFolder,
    getCurrentQueryOptions: CallbackTo[QueryOptions],
    getItemCountAsync: CallbackTo[IAsyncOperation[Double]],
    oncontentschanged: Any,
    onoptionschanged: Any
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1((t0: QueryOptions) => applyNewQueryOptions(t0).runNow()), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder.asInstanceOf[js.Any], getCurrentQueryOptions = getCurrentQueryOptions.toJsFn, getItemCountAsync = getItemCountAsync.toJsFn, oncontentschanged = oncontentschanged.asInstanceOf[js.Any], onoptionschanged = onoptionschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
  
  extension [Self <: IStorageQueryResultBase](x: Self) {
    
    inline def setApplyNewQueryOptions(value: QueryOptions => Callback): Self = StObject.set(x, "applyNewQueryOptions", js.Any.fromFunction1((t0: QueryOptions) => value(t0).runNow()))
    
    inline def setFindStartIndexAsync(value: Any => IAsyncOperation[Double]): Self = StObject.set(x, "findStartIndexAsync", js.Any.fromFunction1(value))
    
    inline def setFolder(value: StorageFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentQueryOptions(value: CallbackTo[QueryOptions]): Self = StObject.set(x, "getCurrentQueryOptions", value.toJsFn)
    
    inline def setGetItemCountAsync(value: CallbackTo[IAsyncOperation[Double]]): Self = StObject.set(x, "getItemCountAsync", value.toJsFn)
    
    inline def setOncontentschanged(value: Any): Self = StObject.set(x, "oncontentschanged", value.asInstanceOf[js.Any])
    
    inline def setOnoptionschanged(value: Any): Self = StObject.set(x, "onoptionschanged", value.asInstanceOf[js.Any])
  }
}
