package typingsJapgolly.reactQuery.typesCoreQueryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactQuery.typesCoreTypesMod.EnsuredQueryKey
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryKey
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryMeta
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchContext[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] extends StObject {
  
  def fetchFn(): Any | js.Promise[Any]
  
  var fetchOptions: js.UndefOr[FetchOptions] = js.undefined
  
  var meta: js.UndefOr[QueryMeta] = js.undefined
  
  var options: QueryOptions[TQueryFnData, TError, TData, Any]
  
  var queryKey: EnsuredQueryKey[TQueryKey]
  
  var state: QueryState[TData, TError]
}
object FetchContext {
  
  inline def apply[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](
    fetchFn: CallbackTo[Any | js.Promise[Any]],
    options: QueryOptions[TQueryFnData, TError, TData, Any],
    queryKey: EnsuredQueryKey[TQueryKey],
    state: QueryState[TData, TError]
  ): FetchContext[TQueryFnData, TError, TData, TQueryKey] = {
    val __obj = js.Dynamic.literal(fetchFn = fetchFn.toJsFn, options = options.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchContext[TQueryFnData, TError, TData, TQueryKey]]
  }
  
  extension [Self <: FetchContext[?, ?, ?, ?], TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](x: Self & (FetchContext[TQueryFnData, TError, TData, TQueryKey])) {
    
    inline def setFetchFn(value: CallbackTo[Any | js.Promise[Any]]): Self = StObject.set(x, "fetchFn", value.toJsFn)
    
    inline def setFetchOptions(value: FetchOptions): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
    
    inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
    
    inline def setMeta(value: QueryMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setOptions(value: QueryOptions[TQueryFnData, TError, TData, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setQueryKey(value: EnsuredQueryKey[TQueryKey]): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
    
    inline def setState(value: QueryState[TData, TError]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
