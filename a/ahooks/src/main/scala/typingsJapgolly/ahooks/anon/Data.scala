package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[TData /* <: typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Data */] extends StObject {
  
  def cancel(): Unit
  
  var data: js.UndefOr[TData] = js.undefined
  
  def loadMore(): Unit
  
  def loadMoreAsync(): js.Promise[TData]
  
  var loading: Boolean
  
  var loadingMore: Boolean
  
  var mutate: Dispatch[SetStateAction[js.UndefOr[TData]]]
  
  var noMore: Boolean
  
  def reload(): Unit
  
  def reloadAsync(): js.Promise[TData]
}
object Data {
  
  inline def apply[TData /* <: typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Data */](
    cancel: Callback,
    loadMore: Callback,
    loadMoreAsync: CallbackTo[js.Promise[TData]],
    loading: Boolean,
    loadingMore: Boolean,
    mutate: SetStateAction[js.UndefOr[TData]] => Callback,
    noMore: Boolean,
    reload: Callback,
    reloadAsync: CallbackTo[js.Promise[TData]]
  ): Data[TData] = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, loadMore = loadMore.toJsFn, loadMoreAsync = loadMoreAsync.toJsFn, loading = loading.asInstanceOf[js.Any], loadingMore = loadingMore.asInstanceOf[js.Any], mutate = js.Any.fromFunction1((t0: SetStateAction[js.UndefOr[TData]]) => mutate(t0).runNow()), noMore = noMore.asInstanceOf[js.Any], reload = reload.toJsFn, reloadAsync = reloadAsync.toJsFn)
    __obj.asInstanceOf[Data[TData]]
  }
  
  extension [Self <: Data[?], TData /* <: typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Data */](x: Self & Data[TData]) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLoadMore(value: Callback): Self = StObject.set(x, "loadMore", value.toJsFn)
    
    inline def setLoadMoreAsync(value: CallbackTo[js.Promise[TData]]): Self = StObject.set(x, "loadMoreAsync", value.toJsFn)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingMore(value: Boolean): Self = StObject.set(x, "loadingMore", value.asInstanceOf[js.Any])
    
    inline def setMutate(value: SetStateAction[js.UndefOr[TData]] => Callback): Self = StObject.set(x, "mutate", js.Any.fromFunction1((t0: SetStateAction[js.UndefOr[TData]]) => value(t0).runNow()))
    
    inline def setNoMore(value: Boolean): Self = StObject.set(x, "noMore", value.asInstanceOf[js.Any])
    
    inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
    
    inline def setReloadAsync(value: CallbackTo[js.Promise[TData]]): Self = StObject.set(x, "reloadAsync", value.toJsFn)
  }
}
